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
        int road = in.nextInt(); // the length of the road before the gap.
        int gap = in.nextInt(); // the length of the gap.
        int platform = in.nextInt(); // the length of the landing platform.
        int distFromGap = road;
        boolean jumped = false;
        int noZeroSpeed = 1;
        
        
        // game loop
        while (true) {
            int speed = in.nextInt(); // the motorbike's speed.
            int coordX = in.nextInt(); // the position on the road of the motorbike.
            
            
            //System.err.println("Dist from Gap: " + distFromGap);
            //System.err.println("Gap: " + gap);
            //System.err.println("Speed: " + speed);
            //System.err.println("CoordX: " + coordX);
            //System.err.println("Platform: " + platform);
            

            if(speed != 0){
                noZeroSpeed = speed;
            }
            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");

	    //If the bike has made the jump or the speed is too high to stop before the platform ends then SLOW
            if(jumped || (speed/gap) > (platform/noZeroSpeed)){
                System.out.println("SLOW");
                distFromGap -= speed;
            }            
	    //Before the road ends JUMP
            else if(coordX == road -1){
                System.out.println("JUMP");
                jumped = true;
                distFromGap -= speed;
                
            }
	    //SPEED up until the bike has enough speed to make the jump 
            else if(speed < gap + 1){
                System.out.println("SPEED");
                distFromGap -= speed;
                
            }
	    //If the bike has the right speed or it doesn't need to jump WAIT
            else{
                System.out.println("WAIT");
                distFromGap -= speed;
            }
        }
    }
}
