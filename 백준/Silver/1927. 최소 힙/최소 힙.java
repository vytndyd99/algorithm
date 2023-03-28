import java.util.*;
import java.io.*;

public class Main{

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st; 
    private static PriorityQueue<Integer> minqueue = new PriorityQueue<>();



    public static void main(String[] args) throws IOException{

        int N = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < N ; i++) {
            int info = Integer.parseInt(br.readLine());
            if(info == 0) {
                if(minqueue.size() == 0) {
                    bw.write("0");
                    bw.write("\n");
                }
                else {
                    bw.write(Integer.toString(minqueue.poll()));
                    bw.write("\n");
                }
            }
            else {
                minqueue.add(info);
            }
        }


        bw.flush();
        br.close();
        bw.close();
    }
}