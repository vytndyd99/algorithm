import java.io.*;
import java.util.*;

public class Solution {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

    private static void solution(int a, int b) throws IOException{
        bw.write(Integer.toString(a + b));
        bw.write("\n");
        bw.write(Integer.toString(a - b));
        bw.write("\n");
        bw.write(Integer.toString(a * b));
        bw.write("\n");
        bw.write(Integer.toString(a / b));
    }

    public static void main(String[] args) throws IOException {
        
        st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());

        int b = Integer.parseInt(st.nextToken());

        solution(a, b);



        bw.flush();

        br.close();
        bw.close();
    }
}