import java.util.*;
import java.io.*;


public class Main{

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static int M, N, K, count;
    private static int[][] arr;
    private static boolean[][] visited;
    private static int[] dx = {0, 0, 1, -1};
    private static int[] dy = {1, -1, 0, 0};

    private static void BFS(int y, int x) {
        Deque<int[]> q = new LinkedList<>();
        visited[y][x] = true;
        q.add(new int[] {y, x});
        while(!q.isEmpty()) {
            int[] dots = q.poll();
            int dotX = dots[1];
            int dotY = dots[0];
            for(int i = 0 ; i < 4 ; i++) {
                int newX = dotX + dx[i];
                int newY = dotY + dy[i];
                if(newX >= 0 && newX < M && newY >= 0 && newY < N) {
                    if(arr[newY][newX] == 1 && visited[newY][newX] == false) {
                        q.add(new int[] {newY, newX});
                        visited[newY][newX] = true;
                    }
                }
            }
        } 
    }


   


    public static void main(String[] args) throws IOException {
        
        int T = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < T ; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
            arr = new int[N][M];
            visited = new boolean[N][M];
            for(int j = 0 ; j < K ; j++) {
                st = new StringTokenizer(br.readLine(), " ");
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                arr[y][x] = 1;
            }

            count = 0;

            for(int Y = 0 ; Y < N ; Y++) {
                for(int X = 0 ; X < M ; X++) {
                    if(arr[Y][X] == 1 && visited[Y][X] == false) {
                        BFS(Y, X);
                        count += 1;
                    }
                }
            }

            bw.write(Integer.toString(count));
            bw.write("\n");
        }

        bw.flush();

        br.close();
        bw.close();
    }
}