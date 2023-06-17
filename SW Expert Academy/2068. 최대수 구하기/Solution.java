import java.io.*;
import java.util.*;

public class Solution {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

    private static int fun(int[] arr) {
        int maxNum = 0;

        for(int i = 0 ; i < arr.length ; i++) {
            if(arr[i] > maxNum) {
                maxNum = arr[i];
            }
        }

        return maxNum;
    }

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < T ; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            int[] arr = new int[10];

            for(int j = 0 ; j < arr.length ; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            int maxNum = fun(arr);

            bw.write("#");
            bw.write(Integer.toString(i + 1) + " ");
            bw.write(Integer.toString(maxNum));
            bw.write("\n");


        }

        bw.flush();

        br.close();
        bw.close();
    }
}