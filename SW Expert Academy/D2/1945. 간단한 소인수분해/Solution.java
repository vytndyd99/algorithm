import java.io.*;
import java.util.*;

public class Solution {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

    private static int[] solution(int num, int[] primeNum, int[] counts) throws IOException{
        for(int i = 0 ; i < 5 ; i++) {
            while(num % primeNum[i] == 0) {
                num = num / primeNum[i];
                counts[i] += 1;
            }
        }

        return counts;

        
    }

    public static void main(String[] args) throws IOException {
        
        int T = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < T ; i++) {
            int[] primeNum = {2, 3, 5, 7, 11};
            int[] counts = {0, 0, 0, 0, 0};
            int num = Integer.parseInt(br.readLine());
            int[] answer = solution(num, primeNum, counts);

            bw.write("#" + Integer.toString(i + 1) + " ");
            for(int j = 0 ; j < 5 ; j++) {
                if(j == 4) {
                    bw.write(Integer.toString(answer[j]));
                    bw.write("\n");
                }
                else {
                    bw.write(Integer.toString(answer[j]) + " ");
                }
            }
        }

        bw.flush();

        br.close();
        bw.close();
    }
}