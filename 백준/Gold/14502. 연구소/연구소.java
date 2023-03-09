import java.util.*;
import java.io.*;

class virus {
    int y;
    int x;

    public virus(int y, int x) {
        this.y = y;
        this.x = x;
    }
}

public class Main {
    private static int[][] originalArr;
    private static int[] dx = {0, 0, 1, -1};
    private static int[] dy = {1, -1, 0, 0};
    private static int maxCount = -1;
    private static int height, width;
    // private static int[][] arr;

    public static void DFS(int deep) {
        if(deep == 3) {
            BFS();
            return;
        }
        for(int i = 0 ; i < height ; i++) {
            for(int j = 0 ; j < width ; j++) {
                if(originalArr[i][j] == 0) {
                    originalArr[i][j] = 1;
                    DFS(deep + 1);
                    originalArr[i][j] = 0;
                }
            }
        }
        
    }

    public static void BFS() {
        Queue<virus> q = new LinkedList<>();

        int[][] arr = new int[height][width];
        for(int a = 0 ; a < height ; a++) {
            for(int b = 0 ; b < width ; b++) {
                arr[a][b] = originalArr[a][b];
                if(arr[a][b] == 2) {
                    q.add(new virus(a, b));
                }
            } 
        }
        while(!q.isEmpty()) {
            virus array = q.poll();
            int Y = array.y;
            int X = array.x;
            for(int i = 0 ; i < 4 ; i++) {
                int newX = X + dx[i];
                int newY = Y + dy[i];
                if(newX >= 0 && newX < width && newY >= 0 && newY < height && arr[newY][newX] == 0) {
                    arr[newY][newX] = 2;
                    q.add(new virus(newY, newX));
                }
            }
        }
        countNum(arr);
    }
    

    public static void countNum(int[][] arr) {
        int count = 0;
        for(int i = 0 ; i < height ; i++) {
            for(int j = 0 ; j < width ; j++) {
                if(arr[i][j] == 0) {
                    count += 1;
                }
            }
        }
        maxCount = Math.max(count, maxCount);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");

        height = Integer.parseInt(st.nextToken());
        width = Integer.parseInt(st.nextToken());

        originalArr = new int[height][width];

        for(int i = 0 ; i < height ; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int j = 0;
            while(st.hasMoreTokens()) {
                int Num = Integer.parseInt(st.nextToken());
                originalArr[i][j] = Num;
                j += 1;
            }
        }

        DFS(0);

        bw.write(Integer.toString(maxCount));
        bw.flush();
        br.close();
        bw.close();
    }
}