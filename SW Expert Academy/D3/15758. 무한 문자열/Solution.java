import java.util.*;
import java.io.*;

public class Solution {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    
    private static boolean solution(String fir, String sec) {
        boolean answer = true;
        
        int firLen = fir.length();
        int secLen = sec.length();    
        int intersectionLen = firLen * secLen;
        
        String firStr = "";
        String secStr = "";
        
        for(int i = 0 ; i < intersectionLen / firLen ; i++) {
            firStr += fir;
        }
        
        for(int i = 0 ; i < intersectionLen / secLen ; i++) {
            secStr += sec;
        }
        
        for(int i = 0 ; i < intersectionLen ; i++) {
            if(firStr.charAt(i) != secStr.charAt(i)) {
                answer = false;
                break;
            }
        }
    
        
        return answer;
    }

    /**
     * @param args
     */
    public static void main(String[] args) throws IOException{
        
        int T = Integer.parseInt(br.readLine());
        
        for(int i = 0 ; i < T ; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String fir = st.nextToken();
            String sec = st.nextToken();
            
            boolean flag = solution(fir, sec);
            String answer;
            
            if(flag) {
                answer = "yes";
            }
            else {
                answer = "no";
            }
            
            bw.write("#" + Integer.toString(i + 1) + " " + answer + "\n");
        }
        
        bw.flush();
        br.close();
        bw.close();
    }

}