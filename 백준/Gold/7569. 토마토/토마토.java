import java.util.*;
import java.io.*;


public class Main{

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static int[] dx = {1, -1, 0, 0, 0, 0};
    private static int[] dy = {0, 0, 1, -1, 0, 0};
    private static int[] dz = {0, 0, 0, 0, 1, -1};
    // 동 서 남 북 위 아래로 기준삼자
    private static int M, N, H;
    private static int[][][] arr;

    private static void BFS(LinkedList<int[]> start) {
        Deque<int[]> q = new LinkedList<>();
        while(!start.isEmpty()) {
            q.add(start.poll());
        }
        while(!q.isEmpty()) {
            int[] dots = q.poll();
            for(int i = 0 ; i < 6 ; i++) {
                int x = dots[2] + dx[i];
                int y = dots[1] + dy[i];
                int z = dots[0] + dz[i];
                if(x >= 0 && x < M && y >= 0 && y < N && z >= 0 && z < H) {
                    if(arr[z][y][x] == 0) {
                        arr[z][y][x] = arr[dots[0]][dots[1]][dots[2]] + 1;
                        q.add(new int[] {z, y, x});
                    }
                }
            }
        }
    }




    public static void main(String[] args) throws IOException {
        
        st = new StringTokenizer(br.readLine(), " ");
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());

        arr = new int[H][N][M];

        LinkedList<int[]> start = new LinkedList<>();

        for(int i = 0 ; i < H ; i++) {
            for(int j = 0 ; j < N ; j++) {
                st = new StringTokenizer(br.readLine(), " ");
                for(int k = 0 ; k < M ; k++) {
                    int tomato = Integer.parseInt(st.nextToken());
                    arr[i][j][k] = tomato;
                    if(tomato == 1) {
                        start.add(new int[] {i, j, k});
                    }
                }
            }
        }

        BFS(start);

        boolean flag = false;
        int minDay = 0;

        for(int i = 0 ; i < H ; i++) {
            for(int j = 0 ; j < N ; j++) {
                for(int k = 0 ; k < M ; k++) {
                    if(arr[i][j][k] == 0) {
                        flag = true;
                    }
                    if(arr[i][j][k] > minDay) {
                        minDay = arr[i][j][k];
                    }
                }
            }
        }

        if(flag) {
            bw.write(Integer.toString(-1));
        }
        else {
            bw.write(Integer.toString(minDay - 1));
        }
        


        bw.flush();

        br.close();
        bw.close();
    }
}