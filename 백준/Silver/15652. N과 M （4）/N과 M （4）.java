// created by Ipad
import java.util.*;
import java.io.*;

public class Main{
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static boolean[] visited;
    private static int N, M;
    private static Stack<Integer> answer = new Stack<>();

    private static void backTracking(int deep, int start) throws IOException{
        if(deep == M) {
            int count = answer.size();
            for(int i = 0 ; i < count ; i++) {
                if(i == count - 1) {
                    bw.write(Integer.toString(answer.elementAt(i)));
                }
                else {
                    bw.write(Integer.toString(answer.elementAt(i)));
                    bw.write(" ");
                }
            }
            bw.write("\n");
            return;
        }
        else {
            for(int i = start; i <= N ; i++) {
                answer.push(i);
                backTracking(deep + 1, i);
                answer.pop();
            }
        }
    }
    public static void main(String[] args) throws IOException{
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        visited = new boolean[N + 1];
        

        // 처음 깊이를 0으로 지정
        backTracking(0, 1);

        bw.flush();
        
        br.close();
        bw.close();
    }
}