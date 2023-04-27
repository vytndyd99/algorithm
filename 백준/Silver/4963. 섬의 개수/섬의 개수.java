import java.util.*;
import java.io.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static int[][] arr;
    private static boolean[][] visited;
    private static int[] dx = {1, 1, 0, -1, -1, -1, 0, 1};
    private static int[] dy = {0, -1, -1, -1, 0, 1, 1, 1};
    private static int count;
    private static int w, h;

    private static void bfs(int y, int x) {
        Deque<int[]> q = new LinkedList<>();
        visited[y][x] = true;
        q.add(new int[] {y, x});
        while(!q.isEmpty()) {
            int[] dots = q.poll();
            for(int i = 0 ; i < 8 ; i++) {
                int newX = dots[1] + dx[i];
                int newY = dots[0] + dy[i];
                if(newX >= 0 && newX < w && newY >= 0 && newY < h) {
                    if(arr[newY][newX] == 1 && visited[newY][newX] == false) {
                        visited[newY][newX] = true;
                        q.add(new int[] {newY, newX});
                    }
                }
            }
        }
        count += 1; // 섬의 개수 증가
    }


    public static void main(String[] args) throws IOException {

        while(true) {
            count = 0;
            st = new StringTokenizer(br.readLine(), " ");
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());
            if(w == 0 && h == 0) {
                break;
            }

            // 배열 설정 부분 코드 작성
            arr = new int[h][w];
            visited = new boolean[h][w];
            for(int i = 0 ; i < h ; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                for(int j = 0 ; j < w ; j++) {
                    int num = Integer.parseInt(st.nextToken());
                    arr[i][j] = num;
                } 
            }

            for(int i = 0 ; i < h ; i++) {
                for(int j = 0 ; j < w ; j++) {
                    if(arr[i][j] == 1 && visited[i][j] == false) {
                        bfs(i, j);
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