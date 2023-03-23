import java.util.*;
import java.io.*;

public class Main{

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static int N;
    private static int[][] nums;
    private static int one, zero, minus = 0;

    private static void fun(int x, int y, int size) {
        int sum = 0;
        int zeroCount = 0;
        for(int i = y ; i < y + size ; i++) {
            for(int j = x ; j < x + size ; j++) {
                sum += nums[i][j];
                if(nums[i][j] == 0) {
                    zeroCount += 1;
                }
            }
        }

        if(sum == size * size) {
            one += 1;
        }
        else if(sum == -1 * size * size) {
            minus += 1;
        }
        else if(zeroCount == size * size) {
            zero += 1;
        }
        else {
            int newSize = size / 3;
            fun(x, y, newSize);
            fun(x + newSize, y, newSize);
            fun(x + 2 * newSize, y, newSize);
            fun(x, y + newSize, newSize);
            fun(x + newSize, y + newSize, newSize);
            fun(x + 2 * newSize, y + newSize, newSize);
            fun(x, y + 2 * newSize, newSize);
            fun(x + newSize, y + 2 * newSize, newSize);
            fun(x + 2 * newSize, y + 2 * newSize, newSize);
        }
    }



    public static void main(String[] args) throws IOException{

        //  배열의 크기 및 선언
        N = Integer.parseInt(br.readLine());
        
        nums = new int[N][N];

        for(int i = 0 ; i < N ; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0 ; j < N ; j++) {
                nums[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        fun(0, 0, N);

        bw.write(Integer.toString(minus));
        bw.write("\n");
        bw.write(Integer.toString(zero));
        bw.write("\n");
        bw.write(Integer.toString(one));



        bw.flush();

        br.close();
        bw.close();
    }
}