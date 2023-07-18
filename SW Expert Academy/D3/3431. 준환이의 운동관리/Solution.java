
import java.util.*;
import java.io.*;

public class Solution {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;    
    

    
    private static int solution(int L, int U, int X) {
        int answer;
        
        if(X >= L && X <= U) {
            answer = 0;
        }
        else if(X > U) {
            answer = -1;
        }
        else {
            answer = L - X;
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
            
            int L = Integer.parseInt(st.nextToken());
            int U = Integer.parseInt(st.nextToken());
            int X = Integer.parseInt(st.nextToken());
            
            int answer = solution(L, U, X);
            
            bw.write("#" + Integer.toString(i) + " " + Integer.toString(answer) + "\n");
            
            
            
        }
        
        
        bw.flush();
        br.close();
        bw.close();
    }

}
