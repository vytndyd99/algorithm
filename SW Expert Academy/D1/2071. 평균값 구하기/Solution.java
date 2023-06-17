import java.io.*;
import java.util.*;

public class Solution {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

    private static double fun(int[] arr) {
        double sum = 0;

        for(int i = 0 ; i < arr.length ; i++) {
            sum += arr[i];
        }

        return sum;
    }

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < T ; i++) {
            int[] arr = new int[10];
            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0 ; j < arr.length ; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            double sumNum = fun(arr);

            double avgNum = sumNum / arr.length;

            bw.write("#");
            bw.write(Integer.toString(i + 1));
            bw.write(" " + Math.round(avgNum));
            bw.write("\n");

        }

        bw.flush();

        br.close();
        bw.close();
    }
}