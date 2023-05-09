// Created on iPad.

import java.util.*;
import java.io.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static int N, K;
    private static int sec;
    private static int findX, findY;
    private static int maxVirus = Integer.MIN_VALUE;
    private static int[][] arr;
    private static boolean[][] visited;
    private static int[] dx = {0, 0, 1, -1};
    private static int[] dy = {1, -1, 0, 0};

    private static void bfs(LinkedList<int[]> dots, int virus) {
        while(!dots.isEmpty()) {
            int[] dot = dots.poll();
            for(int i = 0 ; i < 4 ; i++) {
                int newY = dot[0] + dy[i];
                int newX = dot[1] + dx[i];
                if(newX >= 0 && newX < N && newY >= 0 && newY < N) {
                    if(arr[newY][newX] == 0 && visited[newY][newX] == false) {
                        visited[newY][newX] = true;
                        arr[newY][newX] = virus;
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        arr = new int[N][N];
        visited = new boolean[N][N];

        for(int i = 0; i < N ; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0 ; j < N ; j++) {
                int num = Integer.parseInt(st.nextToken());
                arr[i][j] = num;
            }
        }

        st = new StringTokenizer(br.readLine(), " ");
        sec = Integer.parseInt(st.nextToken());
        findX = Integer.parseInt(st.nextToken()) - 1;
        findY = Integer.parseInt(st.nextToken()) - 1;

        for(int i = 0 ; i < sec ; i++) { // 우선 sec초 만큼 진행하기
            for(int j = 1 ; j <= K ; j++) { // 바이러스의 최대 크기 만큼 bfs진행하기
                
                LinkedList<int[]> dots = new LinkedList<>(); // 바이러스의 좌표가 담긴 리스트
                for(int a = 0 ; a < N ; a++) {
                    for(int b = 0 ; b < N ; b++) {
                        if(arr[a][b] == j) {
                            dots.add(new int[] {a, b});
                        }
                    }
                }

                bfs(dots, j); // 좌표를 담은 리스트와 바이러스 크기를 매개변수로 넣어 bfs 실행하기

            }
            if(arr[findX][findY] != 0) {
                break;
            }
        }

        bw.write(Integer.toString(arr[findX][findY]));
        

        
        bw.flush();
        br.close();
        bw.close();

    }
}