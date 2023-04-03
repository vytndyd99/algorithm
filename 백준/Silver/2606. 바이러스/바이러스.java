import java.util.*;
import java.io.*;

public class Main{

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    private static int answer = 0;
    private static boolean[] visited;

    private static void BFS(int start) {
        Deque<Integer> d = new LinkedList<>();
        d.add(start);
        visited[start] = true;
        while(!d.isEmpty()) {
            int dot = d.poll();
            for(int i = 0 ; i < graph.get(dot).size() ; i++) {
                int newDot = graph.get(dot).get(i);
                if(visited[newDot] == false) {
                    answer += 1;
                    visited[newDot] = true;
                    d.add(newDot);
                }
            }
        }
    }


    public static void main(String[] args) throws IOException {

        int computer = Integer.parseInt(br.readLine());

        int edge = Integer.parseInt(br.readLine());

        visited = new boolean[computer + 1];

        for(int i = 0 ; i <= computer ; i++) {
            graph.add(new ArrayList<>());
        }

        for(int i = 0 ; i < edge ; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            graph.get(start).add(end);
            graph.get(end).add(start);
        }

        BFS(1);

        bw.write(Integer.toString(answer));

        

        bw.flush();

        br.close();
        bw.close();
    }
}