import java.io.*;
import java.util.*;

public class Solution {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

    private static void solution(int N) throws IOException {
        int sum = 0;

        for(int i = 1 ; i <= N ; i++) {
            sum += i;
        }

        bw.write(Integer.toString(sum));
    }

    public static void main(String[] args) throws IOException {
        
        int N = Integer.parseInt(br.readLine());

        solution(N);



        bw.flush();

        br.close();
        bw.close();
    }
}