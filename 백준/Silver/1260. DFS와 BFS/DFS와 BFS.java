import java.util.*;
import java.io.*;

public class Main{

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    private static boolean[] visited;
    private static int[] answer;
    private static int seq = 0;

    private static void DFS(int start) {
        visited[start] = true;
        seq += 1;
        answer[seq] = start;
        for(int i = 0 ; i < graph.get(start).size() ; i++) {
            int newDot = graph.get(start).get(i);
            if(visited[newDot] == false) {
                DFS(newDot);
            }
        }
    }

    private static void BFS(int start) {
        visited[start] = true;
        seq += 1;
        answer[seq] = start;
        Deque<Integer> d = new LinkedList<>();
        d.add(start);
        while(!d.isEmpty()) {
            int dot = d.poll();
            for(int i = 0; i < graph.get(dot).size() ; i++) {
                int newDot = graph.get(dot).get(i);
                if(visited[newDot] == false) {
                    seq += 1;
                    visited[newDot] = true;
                    d.add(newDot);
                    answer[seq] = newDot;
                }
            }
        }

    }


    public static void main(String[] args) throws IOException {
        
        int N, M, V;

        st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());

        M = Integer.parseInt(st.nextToken());

        V = Integer.parseInt(st.nextToken());

        for(int i = 0 ; i <= N ; i++) {
            graph.add(new ArrayList<>());
        }

        for(int i = 0 ; i < M ; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            graph.get(start).add(end);
            graph.get(end).add(start);
        }

        for(int i = 0 ; i < graph.size() ; i++) {
            Collections.sort(graph.get(i));
        }

        //  DFS 함수 실행을 위한 초가화
        visited = new boolean[N + 1];
        answer = new int[N + 1];
        DFS(V);

        StringBuilder sb = new StringBuilder();

        for(int i = 1 ; i <= N ; i++) {
            if(answer[i] != 0) {
                sb.append(Integer.toString(answer[i]));
                sb.append(" ");
            }
        }

        bw.write(sb.toString());
        bw.write("\n");

        //  BFS 함수 실행을 위한 초기화
        seq = 0;
        visited = new boolean[N + 1];
        answer = new int[N + 1];
        BFS(V);

        sb = new StringBuilder();

        for(int i = 1 ; i <= N ; i++) {
            if(answer[i] != 0) {
                sb.append(Integer.toString(answer[i]));
                sb.append(" ");
            }
        }

        bw.write(sb.toString());

        bw.flush();

        br.close();
        bw.close();
    }
}