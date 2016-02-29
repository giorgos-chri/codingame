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
        int L = in.nextInt();
        int H = in.nextInt();
        System.err.println(L);
        System.err.println(H);
        in.nextLine();
        String T = in.nextLine();
        System.err.println(T);
        char[][] asci = new char[H][L*27];
        char[] characters = T.toCharArray();
        for (int i = 0; i < H; i++) {
            String ROW = in.nextLine();
	    //Split the lines to chars and save in a array
            char[] hashTags = ROW.toCharArray();
            int j = 0;
            for(char c : hashTags){
                asci[i][j] = c;
                ++j;
            }
            System.err.println(ROW);
        }
        
        int k = 0;
        while(k < H){
	    //Iterate first the columns and second the rows
            for(char c : characters){
                int asciChar = (int)c;
                if(64 < asciChar && asciChar < 91){
                    for(int j=(asciChar-65)*L; j< (asciChar-65)*L + L; ++j){
                        System.out.print(asci[k][j]);        
                    }
                }
                else if((96 < asciChar && asciChar  < 123)){
                    for(int j=(asciChar-97)*L; j< (asciChar-97)*L + L ; ++j){
                        System.out.print(asci[k][j]);
                    }
                }
                else{
                    for(int j=L*27-L; j< L*27; ++j){
                        System.out.print(asci[k][j]);
                    }
                }
            }
            System.out.println();
            ++k;
        }
    }
