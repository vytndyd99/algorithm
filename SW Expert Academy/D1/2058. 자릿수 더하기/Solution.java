import java.io.*;
import java.util.*;

public class Solution {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

    private static int stringToSumNum(String N) {
        int sumNum = 0;

        for(int i = 0 ; i < N.length() ; i++) {
            int num = N.charAt(i) - '0';
            sumNum += num;
        }

        return sumNum;
    }

    public static void main(String[] args) throws IOException {
        String N = br.readLine();

        int sumNum = stringToSumNum(N);

        bw.write(Integer.toString(sumNum));

        bw.flush();

        br.close();
        bw.close();
    }
}