import java.io.*;
import java.util.*;

public class Solution {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

    private static boolean solution(int length, String str) throws IOException{
        if(length == 1 || length % 2 == 1) {
            return false;
        }

        int startIdx = 0;
        int endIdx = length / 2;

        while(startIdx != length / 2) {
            if(str.charAt(startIdx) != str.charAt(endIdx)) {
                return false;
            } 

            startIdx += 1;
            endIdx += 1;
        }

        return true;

    }

    public static void main(String[] args) throws IOException {
        
        int T = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < T ; i++) {
            int length = Integer.parseInt(br.readLine());
            String str = br.readLine();
            boolean flag = solution(length, str);

            bw.write("#" + Integer.toString(i + 1) + " ");
            if(flag) {
                bw.write("Yes");
            }
            else {
                bw.write("No");
            }

            bw.write("\n");
        }

        bw.flush();

        br.close();
        bw.close();
    }
}