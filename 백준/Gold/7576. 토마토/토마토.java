import java.util.*;
import java.io.*;


public class Main{

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static int[][] arr;
    private static int[] dx = {0, 0, 1, -1};
    private static int[] dy = {1, -1, 0, 0};
    private static int M, N;

    private static void BFS(LinkedList<int[]> dot) {
        Deque<int[]> q = new LinkedList<>();
        while(!dot.isEmpty()) {
            int[] dots = dot.poll();
            q.add(dots);
        }
        while(!q.isEmpty()) {
            int[] newDot = q.poll();
            for(int i = 0 ; i < 4 ; i++) {
                int x = newDot[1] + dx[i];
                int y = newDot[0] + dy[i];
                if(x >= 0 && x < M && y >= 0 && y < N) {
                    if(arr[y][x] == 0) {
                        arr[y][x] = arr[newDot[0]][newDot[1]] + 1;
                        q.add(new int[] {y, x});
                    }
                }
            }
        }
    }



    public static void main(String[] args) throws IOException {
        
        st = new StringTokenizer(br.readLine(), " ");
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        LinkedList<int[]> dots = new LinkedList<>();

        arr = new int[N][M];

        for(int i = 0 ; i < N ; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0 ; j < M ; j++) {
                int situation = Integer.parseInt(st.nextToken());
                arr[i][j] = situation;
                if(situation == 1) {
                    dots.add(new int[] {i, j});
                }
            }
        }

        BFS(dots);

        boolean flag = true;

        int minDay = 0; // 최소날짜 구하기
        for(int i = 0 ; i < N ; i++) {
            for(int j = 0 ; j < M ; j++) {
                if(arr[i][j] == 0) {
                    flag = false;
                }
                if(arr[i][j] > minDay) {
                    minDay = arr[i][j];
                }
            }
        }

        if(!flag) { // 안익은 토마가 하나라도 있는 경우에는
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