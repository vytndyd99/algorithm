
import java.util.*;
import java.io.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st; 
    private static int[][][] arr;
    private static boolean[][][] visited;
    private static int[] dx = {1, 0, -1, 0, 0, 0};
    private static int[] dy = {0, 1, 0, -1, 0, 0};
    private static int[] dz = {0, 0,0 ,0 , 1, -1};
    private static int day = 0;

    private static void bfs(Queue<int[]> q) {
        int M = arr[0][0].length;
        int N = arr[0].length;
        int H = arr.length;
        while(!q.isEmpty()) {
            int dot[] = q.poll();
            int x = dot[2];
            int y = dot[1];
            int z = dot[0];
            for(int i = 0 ; i < 6 ; i++) {
                int newX = x + dx[i];
                int newY = y + dy[i];
                int newZ = z + dz[i];
                if(newX >= 0 && newX < M && newY >= 0 && newY < N && newZ >= 0 && newZ < H) {
                    if(visited[newZ][newY][newX] == false && arr[newZ][newY][newX] == 0) {
                        visited[newZ][newY][newX] = true;
                        arr[newZ][newY][newX] = arr[z][y][x] + 1;
                        q.add(new int[] {newZ, newY, newX});
                    }
                }
            }
        }
    }
      
    

    public static void main(String[] args) throws IOException{
        
        st = new StringTokenizer(br.readLine(), " ");

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());

        arr = new int[H][N][M];
        visited = new boolean[H][N][M];

        Queue<int[]> q = new LinkedList<>();

        for(int i = 0 ; i < H ; i++) {
            for(int j = 0 ; j < N ; j++) {
                st = new StringTokenizer(br.readLine(), " ");
                for(int k = 0 ; k < M ; k++) {
                    int num = Integer.parseInt(st.nextToken());

                    if(num == 1) {
                        q.add(new int[] {i, j, k});
                    }
                    arr[i][j][k] = num;
                }
            }
        }

        bfs(q);


        boolean flag = true;

        for(int i = 0 ; i < H ; i++) {
            for(int j = 0 ; j < N ; j++) {
                for(int k = 0 ; k < M ; k++) {
                    if(arr[i][j][k] > day) {
                        day = arr[i][j][k];
                    }
                    if(arr[i][j][k] == 0) {
                        flag = false;
                        break;
                    }
                }
            }
        }

        if(flag) {     
                bw.write(Integer.toString(day - 1));
        }
        else {
            bw.write(Integer.toString(-1));
        }
        
        
        bw.flush();
        br.close();
        bw.close();
    }

}
