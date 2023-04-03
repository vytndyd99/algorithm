import java.util.*;
import java.io.*;

public class Main{

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    private static int[] answer;
    private static int seq = 0;

    private static void BFS(int start) {
        Deque<Integer> d = new LinkedList<>();
        seq += 1;
        answer[start] = seq;
        d.add(start);
        while(!d.isEmpty()) {
            int dot = d.poll();
            for(int i = 0 ; i < graph.get(dot).size() ; i++) {
                int newDot = graph.get(dot).get(i);
                if(answer[newDot] == 0) {
                    seq += 1;
                    answer[newDot] = seq;
                    d.add(newDot);
                }
            }
        }
    }


    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine(), " ");
        int N, M, R;
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        answer = new int[N + 1];

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


        BFS(R);

        for(int i = 1 ; i <= N ; i++) {
            bw.write(Integer.toString(answer[i]));
            bw.write("\n");
        }

        bw.flush();

        br.close();
        bw.close();
    }
}