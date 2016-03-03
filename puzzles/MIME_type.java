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
        int N = in.nextInt(); // Number of elements which make up the association table.
        String[][] mime = new String[N][2];//Stores the file extensions and the corresponding MIME
        int Q = in.nextInt(); // Number Q of file names to be analyzed.
        for (int i = 0; i < N; i++) {
            String EXT = in.next(); // file extension
            String MT = in.next(); // MIME type.
            System.err.println(EXT + ":  " + MT);
            in.nextLine();
            mime[i][0] = EXT.toLowerCase();
            mime[i][1] = MT;
        }
        
        for (int i = 0; i < Q; i++) {
            String FNAME = in.nextLine(); // One file name per line.
            boolean hasDot = FNAME.contains(".");
            System.err.println("Input file name:  " + FNAME);
            String[] fn = FNAME.split("\\.");
            int size = fn.length;
            //If the file name does not contain a dot OR if the last char is a dot then the type is UNKNOWN
            if(!FNAME.contains(".") || FNAME.substring(FNAME.length() - 1).equals(".")){
                System.out.println("UNKNOWN");
                continue;
            }else{
                boolean found = false;                
                for(int j=0; j < N; ++j){
                    //Check if the type of the file is known and print it.
                    if(mime[j][0].equals(fn[size-1].toLowerCase())){
                        System.out.println(mime[j][1]);
                        found = true;
                        break;
                    }
                }
                //If the type of the file is not found the print UNKNOWN
                if(!found){
                    System.out.println("UNKNOWN"); 
                }
            }
        }
    }
