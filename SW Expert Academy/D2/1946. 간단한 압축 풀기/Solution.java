import java.io.*;
import java.util.*;

public class Solution {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

    private static void solution(LinkedList<String[]> arr, int arrSize) throws IOException{
        int count = 0;

        while(!arr.isEmpty()) {
            String[] nums = arr.poll();
            String str = nums[0];
            int countNum = Integer.parseInt(nums[1]);

            for(int i = 0 ; i < countNum ; i++) {
                if(count % 10 == 0 && count != 0) {
                    bw.write("\n");
                }
                bw.write(str);
                count += 1;
            }
        }


        
    }

    public static void main(String[] args) throws IOException {
        
        int T = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < T ; i++) {
            int N = Integer.parseInt(br.readLine());
            bw.write("#" + Integer.toString(i + 1) + "\n");
            LinkedList<String[]> str = new LinkedList<>();
            for(int j = 0 ; j < N ; j++) {
                st = new StringTokenizer(br.readLine(), " ");
                str.add(new String[] {st.nextToken(), st.nextToken()});
            }
            solution(str, N);
            bw.write("\n");

            if(i == T - 1) {
                bw.write("\n");
            }
        }

        bw.flush();

        br.close();
        bw.close();
    }
}