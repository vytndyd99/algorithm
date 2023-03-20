// created by Ipad
import java.util.*;
import java.io.*;

public class Main{

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static int K;
    private static Stack<Integer> nums = new Stack<>();


    public static void main(String[] args) throws IOException{
        K = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < K ; i++) {
            int num = Integer.parseInt(br.readLine());
            if(num == 0) {
                nums.pop();
            }
            else {
                nums.push(num);
            }
        }
        int sum = 0;
        int stackSize = nums.size();
        for(int i = 0 ; i < stackSize ; i++) {
            sum += nums.peek();
            nums.pop();
        }

        bw.write(Integer.toString(sum));

        br.close();
        bw.close();
    }
}