import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Solution {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

    private static ArrayList<Integer> primeNum(int N) {
        ArrayList<Integer> nums = new ArrayList<>();

        for(int i = 1 ; i <= Math.sqrt(N) ; i++) {
            if(N % i == 0) {
                nums.add(i);
                nums.add(N / i);
            }
        }

        ArrayList<Integer> num = new ArrayList<>();
        for(int a: nums) {
            if(!num.contains(a)) {
                num.add(a);
            }
        }

        Collections.sort(num);

        return num;
    }

    private static int solution(int N) throws IOException{
        int answer;

        ArrayList<Integer> nums = primeNum(N);

        if(nums.size() % 2 == 1) {
            answer = nums.get(nums.size() / 2) + nums.get(nums.size() / 2) - 2;
        }
        else {
            answer = nums.get(nums.size() / 2 - 1) + nums.get(nums.size() / 2) - 2;
        }


        return answer;
    }

    public static void main(String[] args) throws IOException {
        
        int T = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < T ; i++) {
            int N = Integer.parseInt(br.readLine());

            int answer = solution(N);

            bw.write("#" + Integer.toString(i + 1) + " " + Integer.toString(answer) + "\n");
        }

        bw.flush();

        br.close();
        bw.close();
    }
}