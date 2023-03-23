import java.util.*;
import java.io.*;

public class Main{

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static int N;
    private static int[][] nums;
    
    private static void fun(int x, int y, int size) throws IOException {
        int sum = 0;

        for(int i = y ; i < y + size ; i++) {
            for(int j = x ; j < x + size ; j++) {
                sum += nums[i][j];
            }
        }

        if(sum == size * size) {
            bw.write(Integer.toString(1));
        }
        else if(sum == 0) {
            bw.write(Integer.toString(0));
        }
        else {
            bw.write("(");
            fun(x, y, size / 2);
            fun(x + size / 2, y, size / 2);
            fun(x, y + size / 2, size / 2);
            fun(x + size / 2, y + size / 2, size / 2);
            bw.write(")");
        }
    }


    public static void main(String[] args) throws IOException{

        N = Integer.parseInt(br.readLine());

        nums = new int[N][N];

        for(int i = 0 ; i < N ; i++) {
            String numsArr = br.readLine();
            for(int k = 0 ; k < numsArr.length() ; k++) {
                nums[i][k] = Character.getNumericValue(numsArr.charAt(k));
            }
        }

        fun(0, 0, N);

        bw.flush();

        br.close();
        bw.close();
    }
}