import java.io.*;
import java.util.*;

public class Solution {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

    private static int solution(int[] numsA, int[] numsB) throws IOException{
        int maxSum = 0;

        int startIdx = 0;
        int endIdx = (numsA.length <= numsB.length) ? numsA.length : numsB.length;

        while()





    }

    public static void main(String[] args) throws IOException {
        
        int T = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < T ; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            int[] numsA = new int[N];
            int[] numsB = new int[M];

            st = new StringTokenizer(br.readLine(), " ");

            for(int j = 0 ; j < N ; j++) {
                numsA[j] = Integer.parseInt(st.nextToken());
            }

            st = new StringTokenizer(br.readLine(), " ");

            for(int j = 0 ; j < M ; j++) {
                numsB[j] = Integer.parseInt(st.nextToken());
            }

            int maxSum = solution(numsA, numsB);
        }

        bw.flush();

        br.close();
        bw.close();
    }
}