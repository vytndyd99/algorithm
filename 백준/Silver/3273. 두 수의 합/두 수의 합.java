import java.util.*;
import java.io.*;


public class Main {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static int n, x;
    private static int[] arr;
    private static int count = 0;

    private static void find() {
        int start = 0;
        int end = n - 1;
        while(start < end) {
            int sumNum = arr[start] + arr[end];
            if(sumNum == x) {
                count += 1;
                start += 1;
                end -= 1;
            }
            else if(sumNum > x) {
                end -= 1;
            }
            else if(sumNum < x) {
                start += 1;
            }
        }
    }

    public static void main(String[] args) throws IOException {

        n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        arr = new int[n];

        for(int i = 0 ; i < n ; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        x = Integer.parseInt(br.readLine());

        Arrays.sort(arr);

        find();

        bw.write(Integer.toString(count));
    

        bw.flush();

        br.close();
        bw.close();
    }
}