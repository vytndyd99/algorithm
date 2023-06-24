import java.io.*;
import java.util.*;

public class Solution {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

    private static void solution(int[][] arr, int M) throws IOException{
        int sum = 0;
        for(int i = 0 ; i < arr.length ; i++) {
            for(int j = 0  ; j < arr[i].length ; j++) {
                
            }
        }
    }

    public static void main(String[] args) throws IOException {
        
        int T = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < T ; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int[][] arr = new int[N][N];
            for(int j = 0 ; j < N ; j++) {
                st = new StringTokenizer(br.readLine(), " ");
                for(int k = 0 ; k < N ; k++) {
                    arr[j][k] = Integer.parseInt(st.nextToken());
                }
            }

            solution(arr, M);
        }

        bw.flush();

        br.close();
        bw.close();
    }
}