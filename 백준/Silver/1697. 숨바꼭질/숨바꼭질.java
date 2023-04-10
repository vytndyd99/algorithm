import java.util.*;
import java.io.*;


public class Main{

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static int N, K;
    private static int[] arr = new int[100001];

    private static void BFS(int start) {
        Deque<Integer> q = new LinkedList<>();
        q.add(start);
        arr[start] = 0;
        while(!q.isEmpty()) {
            int fun = 0;
            int dot = q.poll();
            for(int i = 0; i < 3 ; i++) {
                if(fun == 0) { // x + 1 좌표
                    int newDot = dot + 1;
                    if(newDot >= 0 && newDot <= 100000) {
                        if(arr[newDot] == 0) {
                            arr[newDot] = arr[dot] + 1;
                            q.add(newDot);
                        }
                    }
                }
                else if(fun == 1) { // x - 1 좌표
                    int newDot = dot - 1;
                    if(newDot >= 0 && newDot <= 100000) {
                        if(arr[newDot] == 0) {
                            arr[newDot] = arr[dot] + 1;
                            q.add(newDot);
                        }
                    }
                }
                else if(fun == 2) { // 2 * x 좌표
                    int newDot = dot * 2;
                    if(newDot >= 0 && newDot <= 100000) {
                        if(arr[newDot] == 0) {
                            arr[newDot] = arr[dot] + 1;
                            q.add(newDot);
                        }
                    }
                }
                fun += 1;
            }
        } 
    }

    public static void main(String[] args) throws IOException {
        
        st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        if(N == K) {
            bw.write(Integer.toString(arr[K]));
        }
        else {
            BFS(N);
            bw.write(Integer.toString(arr[K]));
        }
        

        bw.flush();

        br.close();
        bw.close();
    }
}