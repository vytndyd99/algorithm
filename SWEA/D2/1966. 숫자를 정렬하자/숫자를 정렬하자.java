import java.io.*;
import java.util.*;

public class Solution {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

    private static int[] solution(int N, int[] nums) throws IOException{
        Arrays.sort(nums);

        return nums;
    }

    public static void main(String[] args) throws IOException {
        
        int T = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < T ; i++) {
            int N = Integer.parseInt(br.readLine());
            int[] nums = new int[N];
            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0 ; j < N ; j++) {
                nums[j] = Integer.parseInt(st.nextToken());
            }

            int[] sortNums = solution(N, nums);

            bw.write("#" + Integer.toString(i + 1) + " ");

            for(int j = 0 ; j < N ; j++) {
                if(j != N - 1) {
                    bw.write(Integer.toString(nums[j]) + " ");
                }
                else {
                    bw.write(Integer.toString(nums[j]));
                }
            }

            bw.write("\n");
        }

        bw.flush();

        br.close();
        bw.close();
    }
}