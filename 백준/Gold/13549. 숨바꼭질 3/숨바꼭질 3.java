import java.util.*;
import java.io.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static int[] arr;
    private static boolean[] visited;
    private static int N, K;

    private static void bfs() {
        Queue<Integer> q = new LinkedList<>();
        q.add(N);
        visited[N] = true;
        while(!q.isEmpty()) {
            int dot = q.poll();
            for(int i = 0 ; i < 3 ; i++) {
                int newDot;
                if(i == 0) {
                    newDot = dot * 2;
                }
                else if(i == 1) {
                    newDot = dot - 1;
                }
                else {
                    newDot = dot + 1;
                }

                if(newDot >= 0 && newDot < 100001) {
                    if(arr[newDot] == 0 && visited[newDot] == false) {
                        visited[newDot] = true;
                        if(i == 0) {
                            arr[newDot] = arr[dot];
                        }
                        else {
                            arr[newDot] = arr[dot] + 1;
                        }

                        q.add(newDot);
                    }
                }
            }
        }
    }

   


  

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        arr = new int[100001];
        visited = new boolean[100001];

        bfs();

        bw.write(Integer.toString(arr[K]));


        


        bw.flush();
        br.close();
        bw.close();
        
        
    }

}
