/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package powerofthor;

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 **/
class PowerOfThor {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTX = in.nextInt(); // Thor's starting X position
        int initialTY = in.nextInt(); // Thor's starting Y position

        // game loop
        while (true) {
            int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");
            
            
            //If both dimmension are deferent move diagonial towards the right dirrection
            if(lightX != initialTX && lightY != initialTY){
                if(lightX < initialTX && lightY < initialTY){
                    System.out.println("NW");
                    --initialTX;
                    --initialTY;
                }
                else if(lightX < initialTX && lightY > initialTY){
                    System.out.println("SW");
                    ++initialTY;
                    --initialTX;
                }
                else if(lightX > initialTX && lightY < initialTY){
                    System.out.println("NE");
                    --initialTY;
                    ++initialTX;
                }
                else{
                    System.out.println("SE");
                    ++initialTY;
                    ++initialTX;
                }
            }
            else{
                while(lightX != initialTX){
                    if(lightX < initialTX){
                        System.out.println("W");
                        --initialTX;
                    }
                    else{
                        System.out.println("E");
                        ++initialTX;
                    }
                }
            
                while(lightY != initialTY){
                    if(lightY < initialTY){
                        System.out.println("N");
                        --initialTY;
                    }
                    else{
                        System.out.println("S");
                        ++initialTY;
                    }
                }
            }
            
            

        }
    }
}
