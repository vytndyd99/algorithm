import java.io.*;
import java.util.*;

public class Solution {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

    private static int checkCount(int num) {
        String Number = Integer.toString(num);
        int count = 0;

        for(int i = 0 ; i < Number.length() ; i++) {
            char n = Number.charAt(i);
            if(n == '3' || n == '6' || n == '9') {
                count += 1;
            }
        }

        return count;

    }

    private static void solution(int N) throws IOException{
        
        for(int i = 1 ; i <= N ; i++) {
            int count = checkCount(i);
            if(count == 0) {
                bw.write(Integer.toString(i));
            }
            else {
                if(count == 2) {
                    bw.write("--");
                }
                else {
                    bw.write("-");
                }
            }

            if(i != N) {
                bw.write(" ");
            }
        }
    }

    public static void main(String[] args) throws IOException {
        
        int N = Integer.parseInt(br.readLine());

        solution(N);



        bw.flush();

        br.close();
        bw.close();
    }
}