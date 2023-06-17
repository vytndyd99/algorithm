import java.io.*;
import java.util.*;

public class Solution {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

    private static void solution(int N) throws IOException{
        
        for(int i = N ; i >= 0 ; i--) {
            bw.write(Integer.toString(i));
            if(i != 0) {
                bw.write(" ");
            }
        }
 


    }

    public static void main(String[] args) throws IOException {
        
        int N = Integer.parseInt(br.readLine());

        solution(N);



        bw.flush();

        br.close();
        bw.close();
    }
}