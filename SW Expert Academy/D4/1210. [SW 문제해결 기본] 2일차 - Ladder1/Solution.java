import java.util.*;
import java.io.*;

public class Solution {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static int[] dx = {0, 0, 1, -1};
    private static int[] dy = {1, -1, 0, 0};
    private static int[][] arr;
    private static boolean[][] visited;
    
    private static boolean bfs() {
        Deque<int[]> q = new LinkedList<>();
        q.add(new int[] {1, 1});
        visited[1][1] = true;
        
        while(!q.isEmpty()) {
            int[] dots = q.poll();
            int x = dots[1];
            int y = dots[0];
            for(int i = 0 ; i < 4 ; i++) {
                int newX = x + dx[i];
                int newY = y + dy[i];
                if(newX >= 0 && newX < 16 && newY >= 0 && newY < 16) {
                    if(visited[newY][newX] == false && arr[newY][newX] != 1) {
                        visited[newY][newX] = true;
                        q.add(new int[] {newY, newX});
                    }
                }
            }
        }
        
        if(visited[11][11]) {
            return true;
        }
        else {
            return false;
        }
    }
    

    /**
     * @param args
     */
    public static void main(String[] args) throws IOException{        
        
        for(int i = 1 ; i <= 10 ; i++) {
            int T = Integer.parseInt(br.readLine());
            arr = new int[16][16];
            visited = new boolean[16][16];
            
            for(int j = 0 ; j < 16 ; j++) {
                String nums = br.readLine();
                for(int k = 0 ; k < nums.length() ; k++) {
                    arr[j][k] = nums.charAt(k) - '0';
                }
                
            }
            
            boolean flag = bfs();
            
            if(flag) {
                bw.write("#" + Integer.toString(i) + " " + Integer.toString(1));
            }
            else {
                bw.write("#" + Integer.toString(i) + " " + Integer.toString(0));
            }
            
            bw.write("\n");
        }
        
        
        
        
        
        
        bw.flush();
        
        br.close();
        bw.close();
    }

}