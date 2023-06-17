import java.io.*;
import java.util.*;

public class Solution {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

    private static boolean checkOdd(int num) {
        if(num % 2 == 1) {
            return true;
        }
        else {
            return false;
        }
    }

    private static int fun(int[] arr) {
        int sum = 0;

        for(int i = 0 ; i < arr.length ; i++) {
            if(checkOdd(arr[i])) {
                sum += arr[i];
            }
        }

        return sum;
    }

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < T ; i++) {
            int[] arr = new int[10];
            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0 ; j < 10 ; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            int sumOddNums = fun(arr); // 합계 계산

            bw.write("#");
            bw.write(Integer.toString(i + 1));
            bw.write(" " + sumOddNums);
            bw.write("\n");

        }

        bw.flush();

        br.close();
        bw.close();
    }
}