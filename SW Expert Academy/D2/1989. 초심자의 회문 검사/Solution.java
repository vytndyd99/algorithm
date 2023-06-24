import java.io.*;
import java.util.*;

public class Solution {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

    private static boolean oddSolution(String str) {
        int midIdx = str.length() / 2;
        int leftIdx = midIdx - 1;
        int rightIdx = midIdx + 1;
        boolean flag = true; // 회문인지 확인

        while(leftIdx >= 0 && rightIdx <= str.length() - 1) {

            if(str.charAt(rightIdx) != str.charAt(leftIdx)) {
                flag = false;
                return flag;
            }
            leftIdx -= 1;
            rightIdx += 1;
        }

        return flag;
        
    }

    private static boolean evenSolution(String str) {
        int leftIdx = str.length() / 2 - 1;
        int rightIdx = str.length() / 2;

        boolean flag = true; // 회문인지 확인

        while(leftIdx >= 0 && rightIdx <= str.length() - 1) {

            if(str.charAt(rightIdx) != str.charAt(leftIdx)) {
                flag = false;
                return flag;
            }
            leftIdx -= 1;
            rightIdx += 1;
        }

        return flag;
    }

    private static boolean solution(String str) throws IOException{
        if(str.length() % 2 == 1) {
            return oddSolution(str);
        }
        else {
            return evenSolution(str);
        }
    }

    public static void main(String[] args) throws IOException {
        
        int T = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < T ; i++) {
            String str = br.readLine();
            Boolean flag = solution(str);

            bw.write("#");
            bw.write(Integer.toString(i + 1));
            bw.write(" ");
            if(flag) {
                bw.write(Integer.toString(1));
            }
            else {
                bw.write(Integer.toString(0));
            }

            bw.write("\n");
        }

        bw.flush();

        br.close();
        bw.close();
    }
}