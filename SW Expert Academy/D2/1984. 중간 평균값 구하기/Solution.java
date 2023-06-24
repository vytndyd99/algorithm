import java.io.*;
import java.util.*;

public class Solution {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

    private static int solution(int[] nums) throws IOException{
        double sum = 0;
        int maxNum = -1;
        int minNum = 10001;

        for(int i = 0 ; i < 10 ; i++) {
            if(nums[i] > maxNum) {
                maxNum = nums[i];
            }
            if(nums[i] < minNum) {
                minNum = nums[i];
            }
        }

        for(int i = 0 ; i < 10 ; i++) {
            if(nums[i] != maxNum && nums[i] != minNum) {
                sum += nums[i];
            }
        }

        int answer = (int)Math.round(sum / 8.0) ;
        
        return answer;
        
    }

    public static void main(String[] args) throws IOException {
        
        int T = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < T ; i++) {
            int[] nums = new int[10];
            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0 ; j < 10 ; j++) {
                nums[j] = Integer.parseInt(st.nextToken());
            }
            int answer = solution(nums);

            bw.write("#");
            bw.write(Integer.toString(i + 1) + " ");
            bw.write(Integer.toString(answer));
            bw.write("\n");
        }

        bw.flush();

        br.close();
        bw.close();
    }
}