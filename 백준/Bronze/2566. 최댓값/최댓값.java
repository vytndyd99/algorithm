import java.util.*;
import java.io.*;

public class Main{

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static int maxI, maxJ;
    private static int maxNum = -1;
    


    public static void main(String[] args) throws IOException{

        int[][] arr = new int[9][9];

        for(int i = 0 ; i < 9 ; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0 ; j < 9 ; j++) {
                int num = Integer.parseInt(st.nextToken());
                if(num > maxNum) {
                    maxNum = num;
                    maxI = i;
                    maxJ = j;
                }
            }

        }

        bw.write(Integer.toString(maxNum));
        bw.write("\n");
        bw.write(Integer.toString(maxI + 1));
        bw.write(" ");
        bw.write(Integer.toString(maxJ + 1));


        



        bw.flush();
        br.close();
        bw.close();
    }
}