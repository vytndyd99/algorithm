import java.util.*;
import java.io.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static int[] dx = {0, 0, 1, -1};
    private static int[] dy = {1, -1, 0, 0};
    private static int[][] arr;
    private static boolean[][] visited;
    private static int N, M;
    private static LinkedList<Integer> answer = new LinkedList<>();
    private static boolean finish;

    private static void trueToFalse() {
        visited = new boolean[N][M];
    }

    private static boolean checkCount() {
        int count = 0;
        for(int i = 0 ; i < N ; i++) {
            for(int j = 0 ; j < M ; j++) {
                if(arr[i][j] == 1) {
                    count += 1;
                }
            }
        }
        if(count == 0) {
            return false;
        }
        else {
            answer.add(count);
            return true;
        }
    }

    private static void bfs(int y, int x) {
        visited[y][x] = true;
        Deque<int[]> q = new LinkedList<>();
        q.add(new int[] {y, x});
        while(!q.isEmpty()) {
            int[] dots = q.poll();
            for(int i = 0 ; i < 4 ; i++) {
                int newX = dots[1] + dx[i];
                int newY = dots[0] + dy[i];
                if(newX >= 0 && newX < M && newY >= 0 && newY < N) {
                    if(visited[newY][newX] == false && arr[newY][newX] == 1) {
                        arr[newY][newX] = 0;
                        visited[newY][newX] = true;
                    }
                    else if(visited[newY][newX] == false && arr[newY][newX] == 0) {
                        visited[newY][newX] = true;
                        q.add(new int[] {newY, newX});
                    }
                }
            }
        }

        trueToFalse(); // 배열 방문 기록을 모두 삭제
    }




    public static void main(String[] args) throws IOException {
            
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            arr = new int[N][M];

            for(int i = 0 ; i < N ; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                for(int j = 0 ; j < M ; j++) {
                    int num = Integer.parseInt(st.nextToken());
                    arr[i][j] = num;
                }
            }

            finish = true;
            while(finish) {
                if(checkCount()) {
                    finish = true;
                }
                else {
                    finish = false;
                }
                visited = new boolean[N][M];
                bfs(0, 0);
            }

            bw.write(Integer.toString(answer.size()));
            bw.write("\n");
            bw.write(Integer.toString(answer.pollLast()));


            

            bw.flush();
            br.close();
            bw.close();
    }
}