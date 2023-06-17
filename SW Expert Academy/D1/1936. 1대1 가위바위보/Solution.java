import java.io.*;
import java.util.*;

public class Solution {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

    private static void solution(int A, int B) throws IOException{

        if(A == 1) {
            if(B == 2) {
                bw.write("B");
            }
            else {
                bw.write("A");
            }
        }
        else if(A == 2) {
            if(B == 1) {
                bw.write("A");
            }
            else {
                bw.write("B");
            }
        }
        else if(A == 3) {
            if(B == 1) {
                bw.write("B");
            }
            else {
                bw.write("A");
            }

        }

    }

    public static void main(String[] args) throws IOException {
        
        st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken());

        int B = Integer.parseInt(st.nextToken());

        solution(A, B);



        bw.flush();

        br.close();
        bw.close();
    }
}