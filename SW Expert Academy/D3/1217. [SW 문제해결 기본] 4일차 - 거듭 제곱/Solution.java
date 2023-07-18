
import java.util.*;
import java.io.*;

public class Solution {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;    

    
    private static int solution(int N, int M, int count) {
        if(count == M) {
            return 1;
        }
        else {
            return N * solution(N, M, count + 1);
        }
    }
    
    

    /**
     * @param args
     */
    public static void main(String[] args) throws IOException{
        
        // int T = Integer.parseInt(br.readLine());
        
        for(int i = 1 ; i <= 10 ; i++) {
            
            int T = Integer.parseInt(br.readLine());
            
            st = new StringTokenizer(br.readLine(), " ");
            
            int N = Integer.parseInt(st.nextToken());
            
            int M = Integer.parseInt(st.nextToken());
            
            int answer = solution(N, M, 0);
            
            
            
            bw.write("#" + Integer.toString(i) + " " + Integer.toString(answer) + "\n");
            
            
            
        }
        
        
        bw.flush();
        br.close();
        bw.close();
    }

}
