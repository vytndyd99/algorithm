
import java.util.*;
import java.io.*;

public class Solution {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;    
    

    
    private static int solution(int T, int[] person) {
        int answer = 0;
        double sum = 0;
        double avg;
        
        for(int i = 0 ; i < T ; i++) {
            sum += person[i];
        }
        
        avg = sum / T;
        
        for(int i = 0 ; i < T ; i++) {
            if(person[i] <= avg) {
                answer += 1;
            }
        }
        
        return answer;
        
    }
    
    

    /**
     * @param args
     */
    public static void main(String[] args) throws IOException{
        
        int T = Integer.parseInt(br.readLine()); 
        
        for(int i = 1 ; i <= T ; i++) {
            
            int N = Integer.parseInt(br.readLine());
            int[] person = new int[N];
            
            st = new StringTokenizer(br.readLine());
            
            for(int j = 0 ; j < N ; j++) {
                person[j] = Integer.parseInt(st.nextToken());
            }
            
            int answer = solution(N, person);
            
            
            bw.write("#" + Integer.toString(i) + " " + Integer.toString(answer) + "\n");
            
            
            
        }
        
        
        bw.flush();
        br.close();
        bw.close();
    }

}
