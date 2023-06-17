import java.io.*;
import java.util.*;

public class Solution {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

    private static void printSharp(int T) throws IOException{
        for(int i = 0 ; i < T ; i++) {
            bw.write("#");
        }
    }

    public static void main(String[] args) throws IOException {
        
        int T = Integer.parseInt(br.readLine());

        printSharp(T);



        bw.flush();

        br.close();
        bw.close();
    }
}