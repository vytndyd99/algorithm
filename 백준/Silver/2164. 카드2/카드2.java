// created by Ipad
import java.util.*;
import java.io.*;

public class Main{

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static Deque<Integer> nums = new LinkedList<>();



    public static void main(String[] args) throws IOException{

        int N = Integer.parseInt(br.readLine());

        // 1 ~ N 까지의 카드가 있고, 1번 카드가 가장 위에, N번카드가 가장 아래에 놓여있다.
        // 스택은 추가 push 삭제 pop, 큐는 추가 add, 삭제 poll

        for(int i = 1 ; i <= N ; i++) {
            nums.add(i);
        }

        while(nums.size() != 1) {
            nums.poll(); // 제일 위에 있는 원소 버리기
            int num = nums.poll();
            nums.add(num);
        }

        bw.write(Integer.toString(nums.poll()));

        bw.flush();

        br.close();
        bw.close();
    }
}