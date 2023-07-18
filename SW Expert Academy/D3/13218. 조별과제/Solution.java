
import java.util.*;
import java.io.*;

public class Solution {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;    
    

    
    private static int solution(int N) {
        int answer = N / 3;
        
        return answer;
    }
    
    

    /**
     * @param args
     */
    public static void main(String[] args) throws IOException{
        
        int T = Integer.parseInt(br.readLine()); 
        
        for(int i = 1 ; i <= T ; i++) {
            
            int N = Integer.parseInt(br.readLine());
            
            
            int answer = solution(N);
            
            bw.write("#" + Integer.toString(i) + " " + Integer.toString(answer) + "\n");
            
            
            
        }
        
        
        bw.flush();
        br.close();
        bw.close();
    }

}
