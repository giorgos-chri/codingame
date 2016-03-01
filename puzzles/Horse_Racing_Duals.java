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
        ArrayList<Integer> horses = new ArrayList<>();
        int minDiff = 100000000;
        int N = in.nextInt();
        for (int i = 0; i < N; i++) {
            int pi = in.nextInt();
            horses.add(pi);
        }
        
       Collections.sort(horses);
       for(int i=0; i<N-1; ++i){
            int diff = (horses.get(i+1) - horses.get(i));
            if(diff < minDiff ){
                minDiff = diff;
            }
       }

        System.out.println(minDiff);
    }
}
