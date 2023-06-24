import java.io.*;
import java.util.*;

public class Solution {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

    private static void solution(String str) throws IOException{
        
    }

    public static void main(String[] args) throws IOException {
        
        int T = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < T ; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            for(int j = 0 ; j < N ; j++) {
                st = new StringTokenizer(br.readLine(), " ");
                int midterm = Integer.parseInt(st.nextToken()) * 0.35;
                int finalterm = Integer.parseInt(st.nextToken()) * 0.45;
                int assignment = Integer.parseInt(st.nextToken()) * 0.2;
                int sumScore = midterm + finalterm + assignment;

                
            }

        }

        bw.flush();

        br.close();
        bw.close();
    }
}