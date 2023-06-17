import java.io.*;
import java.util.*;

public class Solution {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine(), " ");

        int[] arr = new int[N];

        for(int i = 0 ; i < N ; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int midIdx = N / 2;

        bw.write(Integer.toString(arr[midIdx]));

        bw.flush();

        br.close();
        bw.close();
    }
}