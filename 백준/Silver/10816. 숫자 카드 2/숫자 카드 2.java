import java.util.*;
import java.io.*;

public class Main{

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st; 
    private static int[] sang, check;

    private static int upperBound(int target) {
        int begin = 0;
        int end = sang.length;

        while(begin < end) {
            int mid = (begin + end) / 2;

            if(sang[mid] <= target) {
                begin = mid + 1;
            }
            else {
                end = mid;
            }
        }
        return end;
    }

    private static int lowerBound(int target) {
        int begin = 0;
        int end = sang.length;

        while(begin < end) {
            int mid = (begin + end) / 2;

            if(sang[mid] >= target) {
                end = mid;
            }
            else {
                begin = mid + 1;
            }
        }
        return end;
    }

    private static void binaryFun(int target) throws IOException{
        int upperN, lowerN;
        lowerN = lowerBound(target);
        upperN = upperBound(target);
        bw.write(Integer.toString(upperN - lowerN));
        bw.write(" ");
    }
    



    public static void main(String[] args) throws IOException{

        int N = Integer.parseInt(br.readLine());
        sang = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0 ; i < N ; i++) {
            sang[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(sang);

        int M = Integer.parseInt(br.readLine());
        check = new int[M];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0 ; i < M ; i++) {
            int num = Integer.parseInt(st.nextToken());
            binaryFun(num);
            check[i] = num;
        }

        bw.flush();
        br.close();
        bw.close();
    }
}