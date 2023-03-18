import java.util.*;
import java.io.*;

public class Main{
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static int count = 0;
    private static int[] arr;
    private static int N;
    
    private static boolean check(int deep) {
        for(int i = 0 ; i < deep ; i++) {
            if(arr[i] == arr[deep]) {
                return false;
            }
            if(Math.abs(i - deep) == Math.abs(arr[i] - arr[deep])) {
                return false;
            }
        }
        return true;
    }

    private static void N_Queen(int deep) {
        if(deep == N) {
            count += 1;
            return;
        }
        for(int i = 0 ; i < N ; i++) {
            arr[deep] = i;
            if(check(deep)) {
                N_Queen(deep + 1);
                arr[deep] = 0;
            }
        }
    }


    public static void main(String[] args) throws IOException{
        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        N_Queen(0);
        bw.write(Integer.toString(count));
        bw.flush();

        br.close();
        bw.close();
        
    }
}