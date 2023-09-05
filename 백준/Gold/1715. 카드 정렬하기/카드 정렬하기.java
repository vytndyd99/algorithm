import java.util.*;
import java.io.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    
    private static int solution(PriorityQueue<Integer> q) {
        int sum = 0;
        int qLength = q.size();
        int twoNumsSum = 0;

        for(int i = 0 ; i < qLength - 1 ; i++) {
            twoNumsSum = q.poll() + q.poll();
            sum += twoNumsSum;
            q.add(twoNumsSum);
        }

        return sum;
    }
  

    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> q = new PriorityQueue<>();

        for(int i = 0 ; i < N ; i++) {
            int num = Integer.parseInt(br.readLine());
            q.add(num);
        }

        int answer = solution(q);

        bw.write(Integer.toString(answer));
        


        bw.flush();
        br.close();
        bw.close();
        
        
    }

}
