import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        
        int[] h = new int[8];
        
        // game loop
        while (true) {
            int spaceX = in.nextInt();
            int spaceY = in.nextInt();
            int max = 0;
            int pos = 0;
            
            for (int i = 0; i < 8; i++) {
                int mountainH = in.nextInt();   // represents the height of one mountain, from 9 to 0. 
						//Mountain heights are provided from left to right.
	
		//Find the position of the tallest mountain so it will be the next that gets show.
                if(mountainH > max){
                    max = mountainH;
                    pos = i;
                }
            }
            
            //If the starship is above of the tallest mountain FIRE else HOLD.
            if(pos == spaceX){
                System.out.println("FIRE");
            }
            else{
                System.out.println("HOLD");
            }            
        }
    }
        
}
