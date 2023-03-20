// created by Ipad
import java.util.*;
import java.io.*;

public class Main{

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int N, K;
    private static int[] nums;
    private static int[] numSum;
    private static int maxNum = Integer.MIN_VALUE;

    private static void maxSum() throws IOException{
        for(int i = K ; i < N + 1 ; i++) {
            maxNum = Math.max(maxNum, numSum[i] - numSum[i - K]);
        }
        bw.write(Integer.toString(maxNum)); 
        bw.flush();

    }

    public static void main(String[] args) throws IOException{

        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        nums = new int[N];
        numSum = new int[N + 1];
        K = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0 ; i < N ; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
            // 3 -2 -4 -9 0 3 7 13 8 -3
        }
        
        numSum[0] = 0;
        for(int i = 1 ; i < N + 1 ; i++) {
            numSum[i] = numSum[i - 1] + nums[i - 1];
            // 0 3 1 -3 -12 -12 -9 -2 11 19 16
        }

        maxSum();
        br.close();
        bw.close();
    }
}