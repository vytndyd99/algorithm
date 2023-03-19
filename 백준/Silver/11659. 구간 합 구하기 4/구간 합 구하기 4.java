import java.util.*;
import java.io.*;

public class Main{
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int[] nums;
    private static int[] sumNums;

    private static void sumFun(int start, int end) throws IOException{
        String answer = Integer.toString(sumNums[end] - sumNums[start - 1]);
        bw.write(answer);
        bw.write("\n");
    }


    

    public static void main(String[] args) throws IOException{

        int N, M;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        N = Integer.parseInt(st.nextToken());
        nums = new int[N];
        sumNums = new int[N + 1];
        sumNums[0]  = 0;

        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0 ; i < N ; i++) {
            int num = Integer.parseInt(st.nextToken());
            nums[i] = num;
            sumNums[i + 1] = sumNums[i] + num;
        }

        for(int i = 0 ; i < M ; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            sumFun(start, end);
        }

        bw.flush();

        br.close();
        bw.close();
        
    }
}