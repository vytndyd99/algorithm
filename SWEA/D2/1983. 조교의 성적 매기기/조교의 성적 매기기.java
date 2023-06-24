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
            double[] sums = new double[N];
            String score = "";

            double findSum = 0;

            for(int j = 0 ; j < N ; j++) {
                st = new StringTokenizer(br.readLine(), " ");
                double midterm = Integer.parseInt(st.nextToken()) * 0.35;
                double finalterm = Integer.parseInt(st.nextToken()) * 0.45;
                double assignment = Integer.parseInt(st.nextToken()) * 0.2;
                double sumScore = midterm + finalterm + assignment;
                sums[j] = sumScore;

                if(j == K - 1) {
                    findSum = sumScore;
                }
            }

            Arrays.sort(sums);

            int findIdx = 0;

            for(int j = 0 ; j < sums.length ; j++) {
                if(sums[j] == findSum) {
                    findIdx = j;
                    break;
                }
            }

            if(findIdx < N / 10 * 1) {
                score = "D0";
            }
            else if(findIdx < N / 10 * 2) {
                score = "C-";
            }
            else if(findIdx < N / 10 * 3) {
                score = "C0";
            }
            else if(findIdx < N / 10 * 4) {
                score = "C+";
            }
            else if(findIdx < N / 10 * 5) {
                score = "B-";
            }
            else if(findIdx < N / 10 * 6) {
                score = "B0";
            }
            else if(findIdx < N / 10 * 7) {
                score = "B+";
            }
            else if(findIdx < N / 10 * 8) {
                score = "A-";
            }
            else if(findIdx < N / 10 * 9) {
                score = "A0";
            }
            else if(findIdx < N / 10 * 10) {
                score = "A+";
            }

            bw.write("#");
            bw.write(Integer.toString(i + 1) + " ");
            bw.write(score);
            bw.write("\n");


        }

        bw.flush();

        br.close();
        bw.close();
    }
}