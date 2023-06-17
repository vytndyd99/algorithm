import java.io.*;
import java.util.*;

public class Solution {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

    private static int solvePassword(int P, int K) {
        int answer;

        if(P < K) {
            answer = (999 - K) + P + 1;
        }
        else {
            answer = P - K + 1;
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        
        st = new StringTokenizer(br.readLine(), " ");

        int P = Integer.parseInt(st.nextToken());

        int K = Integer.parseInt(st.nextToken());

        int answer = solvePassword(P, K);

        bw.write(Integer.toString(answer));



        bw.flush();

        br.close();
        bw.close();
    }
}