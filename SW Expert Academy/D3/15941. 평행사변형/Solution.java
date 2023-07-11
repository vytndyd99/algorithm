
import java.util.*;
import java.io.*;

public class Solution {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    
    private static int solution(int N) {
        return N * N;
    }

    /**
     * @param args
     */
    public static void main(String[] args) throws IOException{
        
        int T = Integer.parseInt(br.readLine());
        
        for(int i = 0 ; i < T ; i++) {
            int N = Integer.parseInt(br.readLine());
            int answer = solution(N);
            
            bw.write("#" + Integer.toString(i + 1) + " " + Integer.toString(answer) + "\n");
        }
        
        bw.flush();
        br.close();
        bw.close();
    }

}