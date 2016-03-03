import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Don't let the machines win. You are humanity's last hope...
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int width = in.nextInt(); // the number of cells on the X axis
        int height = in.nextInt(); // the number of cells on the Y axis
        int grid[][] = new int[height][width];
        in.nextLine();
        for (int i = 0; i < height; i++) {
            String line = in.nextLine(); // width characters, each either 0 or .
            char[] symbols = line.toCharArray();//get each character
            for(int j=0; j<width; ++j){
                //If 0 is found set 0 else if dot is found set -1 
                if(symbols[j] == '0')
                    grid[i][j] = 0;
                else
                    grid[i][j] = -1;
            }
            
        }
        int horX = 0;
        int horY = 0;
        int verX = 0;
        int verY = 0;
        for(int i = 0; i < height; ++i){
            for(int j = 0; j < width; ++j){
                //If -1 there is no node so continue;
                if(grid[i][j] == -1){
                    continue;
                }
                else{
                    int newJ = j;
                    while(newJ < width){
                        //If at the right of the node the grid ends then set coordinates at -1 -1 and end the 
                        //while loop
                        if((newJ + 1) == width){
                            horX = -1;
                            horY = -1;
                            break;
                        }
                        ++newJ;
                        //If at the right of the node there is no node continue to the next (the next right)
                        if(grid[i][newJ] == -1){
                            continue;
                        }
                        //If at the right of the node there is another node save its coordinates and end the 
                        //while loop
                        else{
                            horX = i;
                            horY = newJ;
                            break;
                        }
                    }
                    int newI = i;
                    while(newI < height){
                        //If under the node the grid ends then set coordinates at -1 -1 and end the 
                        //while loop
                        if((newI + 1) == height){
                            verX = -1;
                            verY = -1;
                            break;
                        }                        
                        ++newI;
                        //If under the node there is no node continue to the next (the next below)
                        if(grid[newI][j] == -1){                            
                            continue;
                        }
                        //If under the node we find another node save its coordinates and end the while loop
                        else{
                            verX = newI;
                            verY = j;
                            break;
                        }
                    }
                }
                System.out.println(j + " " + i + " " + horY + " " + horX + " " + verY + " " + verX);
            }
        }

    }
}
