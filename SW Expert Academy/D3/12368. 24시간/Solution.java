
import java.util.*;
import java.io.*;

public class Solution {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;    
    

    
    private static int solution(int A, int B) {
        int answer;
        
        if(A + B >= 24) {
            answer = A + B - 24;
        }
        else {
            answer = A + B;
        }
        
        return answer;
    }
    
    

    /**
     * @param args
     */
    public static void main(String[] args) throws IOException{
        
        int T = Integer.parseInt(br.readLine()); 
        
        for(int i = 1 ; i <= T ; i++) {
            
            st = new StringTokenizer(br.readLine(), " ");
            
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            
            int answer = solution(A, B);
            
            bw.write("#" + Integer.toString(i) + " " + Integer.toString(answer) + "\n");
            
            
            
        }
        
        
        bw.flush();
        br.close();
        bw.close();
    }

}
