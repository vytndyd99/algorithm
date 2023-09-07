import java.util.*;
import java.io.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static int N, M;
    private static int[][] arr;
    private static boolean[][] visited;
    private static int maxSize = 0;
    private static int[] dx = {0, 0, 1, -1};
    private static int[] dy = {1, -1, 0, 0};

    private static int bfs(int i, int j) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {i, j});
        int count = 1;
        visited[i][j] = true;

        while(!q.isEmpty()) {
            int[] dots = q.poll();
            int x = dots[1];
            int y = dots[0];
            for(int k = 0 ; k < 4; k++) {
                int newX = x + dx[k];
                int newY = y + dy[k];

                if(newX >= 0 && newX < M && newY >= 0 && newY < N) {
                    if(visited[newY][newX] == false && arr[newY][newX] == 1) {
                        visited[newY][newX] = true;
                        count += 1;
                        q.add(new int[] {newY, newX});
                    }
                }

            }
        }

        return count;
    }


    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());

        M = Integer.parseInt(st.nextToken());

        arr = new int[N][M];
        visited = new boolean[N][M];

        int K = Integer.parseInt(st.nextToken());

        for(int i = 0 ; i <  K ; i++) {
            st = new StringTokenizer(br.readLine());
            int y = Integer.parseInt(st.nextToken()) - 1;
            int x = Integer.parseInt(st.nextToken()) - 1;
            arr[y][x] = 1;
        }

        for(int i = 0 ; i < N ; i++) {
            for(int j = 0 ; j < M ; j++) {
                if(arr[i][j] == 1) {
                    int count = bfs(i, j);
                    if(count > maxSize) {
                        maxSize = count;
                    }
                }
            }
        }

        bw.write(Integer.toString(maxSize));

        bw.flush();
        br.close();
        bw.close();
        
        
    }

}
