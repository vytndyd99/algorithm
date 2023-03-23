import java.util.*;
import java.io.*;

public class Main{

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static int N;
    private static int nums[][];
    private static int blue, white = 0;
    

    private static void fun(int x, int y, int size) {
        int sum = 0;
        for(int i = y ; i < y + size ; i++) {
            for(int j = x ; j < x + size ; j++) {
                sum += nums[i][j];
            }
        }
        if(sum == size * size) {
            blue += 1;
        }
        else if(sum == 0) {
            white += 1;
        }
        else {
            fun(x, y, size / 2);
            fun(x + size / 2, y, size / 2);
            fun(x, y + size / 2, size / 2);
            fun(x + size / 2, y + size / 2, size / 2);
        }
    }



    public static void main(String[] args) throws IOException{

        N = Integer.parseInt(br.readLine());

        nums = new int[N][N];

        for(int i = 0 ; i < N ; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0 ; j < N ; j++) {
                nums[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        fun(0, 0, N);

        bw.write(Integer.toString(white));
        bw.write("\n");
        bw.write(Integer.toString(blue));

        bw.flush();

        br.close();
        bw.close();
    }
}