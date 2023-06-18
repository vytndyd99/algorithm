import java.io.*;
import java.util.*;

public class Solution {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

    private static void solution(int N, int[] nums) throws IOException{
        int sum = 0;

        for(int i = 1 ; i < nums.length ; i++) {
            if(nums[i - 1] >= nums[i]) {
                continue;
            }
            else {
                
            }
        }


    }

    public static void main(String[] args) throws IOException {
        
        int T = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < T ; i++) {
            int N = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine(), " ");
            int[] nums = new int[N];
            for(int j = 0 ; j < N ; j++) {
                nums[j] = Integer.parseInt(st.nextToken());
            }

            solution(N, nums);


        }



        bw.flush();

        br.close();
        bw.close();
    }
}