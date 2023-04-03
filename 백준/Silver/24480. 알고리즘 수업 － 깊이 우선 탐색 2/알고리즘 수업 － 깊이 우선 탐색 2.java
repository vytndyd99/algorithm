import java.util.*;
import java.io.*;

public class Main{

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    private static int[] answer;
    private static int seq = 0;

    private static void DFS(int start) {
        seq += 1;
        answer[start] = seq;

        for(int i = 0 ; i < graph.get(start).size() ;i++) {
            int newVertex = graph.get(start).get(i);
            if(answer[newVertex] == 0) {
                DFS(newVertex);
            }
        }
    }


    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine(), " ");

        int vertex = Integer.parseInt(st.nextToken());
        int edge = Integer.parseInt(st.nextToken());
        int startVertex = Integer.parseInt(st.nextToken());

        answer = new int[vertex + 1];

        for(int i = 0 ; i < vertex + 1 ; i++) {
            graph.add(new ArrayList<>());
        }

        for(int i = 0 ; i < edge ; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int fromVertex = Integer.parseInt(st.nextToken());
            int toVertex = Integer.parseInt(st.nextToken());

            graph.get(fromVertex).add(toVertex);
            graph.get(toVertex).add(fromVertex);
        }

        for(int i = 1 ; i < graph.size() ; i++) {
            Collections.sort(graph.get(i), Collections.reverseOrder());
        }    

        DFS(startVertex);

        for(int i = 1 ; i <= vertex ; i++) {
            bw.write(Integer.toString(answer[i]));
            bw.write("\n");
        }

        bw.flush();

        br.close();
        bw.close();
    }
}