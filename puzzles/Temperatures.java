import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // the number of temperatures to analyse
        in.nextLine();
        String temps = in.nextLine(); // the n temperatures expressed as integers ranging from -273 to 5526
	//Give min the max value + 1 the temperatures can get
        int min = 5527;
        
	//If there are no input print 0 and terminate the program
        if(n == 0){
            System.out.println(0);
            System.exit(0);
        }
        
	//Put the temperatures in an array
        String[] temperatures = temps.split(" ");
        
        //For all the temperatures find the closest to zero.
        for(String t : temperatures){
            int temp = Integer.parseInt(t);
            if(temp == min){
                continue;
            }
            else if(Math.abs(temp) == Math.abs(min)){
                min = Math.abs(temp);
            }
            else if(Math.abs(temp) < Math.abs(min)){
                min = temp;
            }
            
        }
        System.out.println(min);
        
    }
}
