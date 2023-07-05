import java.util.*;
import java.io.*;

public class Solution {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static int[][] arr;
    private static boolean[][] visited;
    private static int maxLump;
    private static int[] dx = {0, 0, 1, -1};
    private static int[] dy = {1, -1, 0, 0};
    private static int size;
    
    private static void fun(int target) {
        for(int i = 0 ; i < size ; i++) {
            for(int j = 0 ; j < size ; j++) {
                if(arr[i][j] == target) {
                    arr[i][j] = 0;
                }
            }
        }
    }
    
    private static int lumpCount() {
        int lump = 0;
        
        for(int i = 0 ; i < size ; i++) {
            for(int j = 0 ; j < size ; j++) {
                if(visited[i][j] == false && arr[i][j] != 0) {
                    visited[i][j] = true;
                    bfs(new int[] {i, j});
                    lump += 1;
                }
            }
        }
        
        return lump;
    }
    
    private static void bfs(int[] dot) {
        
        Queue<int[]> q = new LinkedList<>();
        q.add(dot);
        
        while(!q.isEmpty()) {
            int[] dots = q.poll();
            int x = dots[1];
            int y = dots[0];
            for(int i = 0 ; i < 4 ; i++) {
                int newX = x + dx[i];
                int newY = y + dy[i];
                if(newX >= 0 && newX < size && newY >= 0 && newY < size) {
                    if(arr[newY][newX] != 0 && visited[newY][newX] == false) {
                        visited[newY][newX] = true;
                        q.add(new int[] {newY, newX});
                    }
                }
            }
        }
    }
    
    private static void solution(int N) {
        for(int i = 1 ; i < 101 ; i++) {
            visited = new boolean[N][N];
            fun(i);
            int lump = lumpCount();
            
            if(lump > maxLump) {
                maxLump = lump;
            }
        }
    }
    

 
    public static void main(String[] args) throws IOException{        
        
        int T = Integer.parseInt(br.readLine());
        
        for(int i = 0 ; i < T ; i++) {
            maxLump = 1;
            int N = Integer.parseInt(br.readLine());
            arr = new int[N][N];
            visited = new boolean[N][N];
            size = arr.length;
            
            for(int j = 0 ; j < N ; j++) {
                st = new StringTokenizer(br.readLine(), " ");
                for(int k = 0 ; k < N ; k++) {
                    arr[j][k] = Integer.parseInt(st.nextToken());
                }
            }
            
            solution(N);
            
            
            
            
            bw.write("#" + Integer.toString(i + 1) + " " + Integer.toString(maxLump) + "\n");
            
        }
        
        
        bw.flush();
        
        br.close();
        bw.close();
    }

}