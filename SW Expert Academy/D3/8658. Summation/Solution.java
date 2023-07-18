
import java.util.*;
import java.io.*;

public class Solution {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;    
    private static int maxAnswer, minAnswer;
    

    
    private static void solution(int num) {
        String nums = Integer.toString(num);
        int sum = 0;
        
        for(int i = 0 ; i < nums.length() ; i++) {
            sum += (nums.charAt(i) - '0');
        }
        
        maxAnswer = Math.max(sum, maxAnswer);
        minAnswer = Math.min(sum, minAnswer);
    }
    
    

    /**
     * @param args
     */
    public static void main(String[] args) throws IOException{
        
        int T = Integer.parseInt(br.readLine());
        
        for(int i = 1 ; i <= T ; i++) {
            
            st = new StringTokenizer(br.readLine());
            
            maxAnswer = 0;
            minAnswer = Integer.MAX_VALUE;
            
            for(int j = 0 ; j < 10 ; j++) {
                solution(Integer.parseInt(st.nextToken()));
            }
            
            
            
            
            bw.write("#" + Integer.toString(i) + " " + Integer.toString(maxAnswer) + " " + Integer.toString(minAnswer) + "\n");
            
            
            
        }
        
        
        bw.flush();
        br.close();
        bw.close();
    }

}
