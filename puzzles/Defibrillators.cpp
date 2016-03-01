#include <iostream>
#include <string>
#include <vector>
#include <algorithm>
#include <sstream>
#include <math.h>

using namespace std;

const int radius = 6371;

float calculateDistance(float lonA, float latA, float lonB, float latB);
float stringToFloat(string s);
/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
int main()
{
    string LON;
    cin >> LON; cin.ignore();
    string LAT;
    cin >> LAT; cin.ignore();
    int N;
    cin >> N; cin.ignore();
    string defibs[N];
    cerr << N << endl;
    for (int i = 0; i < N; i++) {
        string DEFIB;
        getline(cin, DEFIB);
        //Store each line to the array defibs[]
        defibs[i] = DEFIB;
    }
    
        
    string data[N*6];
    int j = 0;
    //Split the line at ; and store each substring to the array data[]
    for(int i=0; i< N; i++){
        istringstream ss(defibs[i]);
        string token;
        while(getline(ss, token, ';')) {
            data[j] = token;
            ++j;
        }
    }
    
    
    
    float minDist = 10000000000;
    int position = -1;
    int lonPosition = 4;
    int latPosition = 5;
    for(int i=0; i<N*6; i+=6){
        float lonB = stringToFloat(data[i+lonPosition]);
        float latB = stringToFloat(data[i+latPosition]);
        float distance = calculateDistance(stringToFloat(LON), stringToFloat(LAT), lonB,  latB);
        if(distance < minDist){
            minDist = distance;
            position = i;
        }
    }
    
    //cerr << defibs[181] << endl;
    //cerr << "Min distance: " <<minDist << endl;
    //cerr << "Position: " << position << endl;
    //cerr << data[position*6] << endl;
    
    //Print the Address of the correct destination
    cout << data[position+1] << endl;
}

//Makes the strings seperated with , to floats seperated with .
float stringToFloat(string s){
    replace(s.begin(), s.end(), ',', '.');
    return atof(s.c_str());
}


float calculateDistance(float lonA, float latA, float lonB, float latB){
    float x = (lonB-lonA)*cos((latA+latB)/2);
    float y = (latB-latA);
    float d = sqrt(pow(x,2.0) + pow(y,2.0))*radius;
    return d;
}
