import java.util.*;
import java.io.*;

public class Main{
    private static int[][] arr;
    private static boolean[][] visited; 
    private static int[] dx = {0, 0 , 1, - 1};
    private static int[] dy = {1, -1, 0, 0};
    private static int[] ans = new int[625];
    private static int height, width;

    public static int BFS(int y, int x) {
        visited[y][x] = true;
        int countHome = 1;
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] {y, x});
        while(!q.isEmpty()) {
            int[] array = q.poll();
            int Y = array[0];
            int X = array[1];
            for(int i = 0 ; i < 4 ; i++) {
                int newX = X + dx[i];
                int newY = Y + dy[i];
                if(newX >= 0 && newX < width && newY >= 0 && newY < height && visited[newY][newX] == false && arr[newY][newX] == 1) {
                    visited[newY][newX] = true;
                    countHome += 1;
                    q.offer(new int[] {newY, newX});
                }
            }
        }
        return countHome;
        
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        height = N;
        width = N;

        arr = new int[N][N];
        visited = new boolean[N][N];
        
        for(int i = 0 ; i < N ; i++) {
            String nums = br.readLine();
            for(int j = 0; j < nums.length() ; j++) {
                arr[i][j] = Character.getNumericValue(nums.charAt(j));
            }
        }

        // 총 단지수
        int count = 0;

        for(int l = 0 ; l < N ; l++) {
            for(int m = 0 ; m < N ; m++) {
                if(arr[l][m] == 1 && visited[l][m] == false) {
                    int countHome = BFS(l, m);
                    ans[count] = countHome;
                    count += 1;
                }
            }
        }
        Arrays.sort(ans);

        bw.write(Integer.toString(count));
        bw.write("\n");
        for(int k = 0 ; k < ans.length ; k++) {
            if(ans[k] != 0) {
                bw.write(Integer.toString(ans[k]));
                bw.write("\n");
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
}