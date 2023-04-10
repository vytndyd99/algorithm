import java.util.*;
import java.io.*;


public class Main{

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static int[] dx = {1, 2, 2, 1, -1, -2, -2, -1};
    private static int[] dy = {2, 1, -1, -2, -2, -1, 1, 2};

    private static void BFS(int[] start, int[] end, int len) throws IOException {
        int[][] arr = new int[len][len];
        Deque<int[]> q = new LinkedList<>();
        q.add(new int[] {start[0], start[1]});
        while(!q.isEmpty()) {
            int[] dot = q.poll();
            if(dot[0] == end[0] && dot[1] == end[1]) {
                break;
            }
            for(int i = 0 ; i < 8 ; i++) {
                int x = dot[0] + dx[i];
                int y = dot[1] + dy[i];
                if(x >= 0 && x < len && y >= 0 && y < len) {
                    if(arr[y][x] == 0) {
                        arr[y][x] = arr[dot[1]][dot[0]] + 1;
                        q.add(new int[] {x, y});
                    }
                }
            }
        }
        bw.write(Integer.toString(arr[end[1]][end[0]]));
        bw.write("\n");
        

    }

    public static void main(String[] args) throws IOException {
        
        int T = Integer.parseInt(br.readLine());

        // dot배열의 첫번째값을 x좌표, 두번째값을 y좌표로 지정하자 
        for(int i = 0 ; i < T ; i++) {
            int I = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine(), " ");
            int[] startDot = new int[2];
            for(int j = 0 ; j < startDot.length ; j++) {
                startDot[j] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine(), " ");
            int[] endDot = new int[2];
            for(int j = 0 ; j < endDot.length ; j++) {
                endDot[j] = Integer.parseInt(st.nextToken());
            }

            BFS(startDot, endDot, I);
        }

        bw.flush();

        br.close();
        bw.close();
    }
}