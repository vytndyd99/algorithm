import java.util.*;
import java.io.*;

public class Solution {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    
    private static int solution(String str) {
        int count = 0;
        
        for(int i = 0 ; i < str.length(); i++) {
            char checkChr = str.charAt(i);
            if(i == (int)checkChr - 97) {
                count += 1;
            }
            else {
                break;
            }
        }
        
        
        return count;
    }

    /**
     * @param args
     */
    public static void main(String[] args) throws IOException{
        
        int T = Integer.parseInt(br.readLine());
        
        for(int i = 0 ; i < T ; i++) {
            String str = br.readLine();
            str = str.toLowerCase();
            int count = solution(str);
            bw.write("#" + Integer.toString(i + 1) + " " + Integer.toString(count) + "\n");
        }
        
        bw.flush();
        br.close();
        bw.close();
    }

}