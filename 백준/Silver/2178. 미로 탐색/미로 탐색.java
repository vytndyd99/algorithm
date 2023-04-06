import java.util.*;
import java.io.*;


public class Main{

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static int[] dx = {0, 0, 1, -1};
    private static int[] dy = {1, -1, 0, 0};
    private static int N, M, count;
    private static int[][] arr;
    private static boolean[][] visited;

    private static void BFS(int y, int x) {
        Deque<int[]> q = new LinkedList<>();
        visited[y][x] = true;
        q.add(new int[] {y, x});
        while(!q.isEmpty()) {
            int[] dots = q.poll();
            for(int i = 0 ; i < 4 ; i++) {
                int newX = dots[1] + dx[i];
                int newY = dots[0] + dy[i];
                if(newX >= 0 && newX < M && newY >= 0 && newY < N) {
                    if(arr[newY][newX] != 0 && visited[newY][newX] == false) {
                        visited[newY][newX] = true;
                        arr[newY][newX] = arr[dots[0]][dots[1]] + 1;
                        q.add(new int[] {newY, newX}); 
                    }
                }
            }
        }
    }



    public static void main(String[] args) throws IOException {
        
        st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N][M];
        visited = new boolean[N][M];

        for(int i = 0 ; i < N ; i++){
            String nums = br.readLine();
            for(int j = 0 ; j < nums.length() ; j++) {
                int num = nums.charAt(j) - '0';
                arr[i][j] = num;
            }
        }

        BFS(0, 0);
        
        bw.write(Integer.toString(arr[N - 1][M - 1]));

        bw.flush();

        br.close();
        bw.close();
    }
}