import java.io.*;
import java.util.*;

public class Solution {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

    private static void solveProblem(int A, int B) throws IOException {
        bw.write(Integer.toString(A / B) + " " + Integer.toString(A % B));
    }

    public static void main(String[] args) throws IOException {
        
        int T = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < T ; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            bw.write("#" + Integer.toString(i + 1) + " ");

            solveProblem(A, B);

            bw.write("\n");
        }



        bw.flush();

        br.close();
        bw.close();
    }
}