import java.io.*;
import java.util.*;

public class Solution {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

    private static int solution(int num) throws IOException{
        int sum = 0;
        for(int i = 1 ; i <= num ; i++) {
            if(i % 2 == 1) {
                sum += i;
            }
            else {
                sum -= i;
            }
        }

        return sum;
    }

    public static void main(String[] args) throws IOException {
        
        int T = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < T ; i++) {
            int N = Integer.parseInt(br.readLine());
            int sum = solution(N);

            bw.write("#");
            bw.write(Integer.toString(i + 1) + " ");
            bw.write(Integer.toString(sum));
            bw.write("\n");
        }

        bw.flush();

        br.close();
        bw.close();
    }
}