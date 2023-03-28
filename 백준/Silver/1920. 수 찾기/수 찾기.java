import java.util.*;
import java.io.*;

public class Main{

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st; 
    private static int[] arr, findArr;

    private static void binaryFun(int target) throws IOException{
        int start = 0;
        int end = arr.length - 1;
        boolean check = false;
        while(start <= end) {
            int mid = (start + end) / 2;
            if(arr[mid] == target) {
                check = true;
                break;
            }
            else if(arr[mid] > target) {
                end = mid - 1;
                continue;
            }
            else if(arr[mid] < target) {
                start = mid + 1;
                continue;
            }
        }
        if(check) {
            bw.write(Integer.toString(1));
        }
        else {
            bw.write(Integer.toString(0));
        }
        bw.write("\n");
    }



    public static void main(String[] args) throws IOException{

        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");

        arr = new int[N];

        for(int i = 0 ; i < N ; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");

        findArr = new int[M];

        for(int i = 0 ; i < M ; i++) {
            findArr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0 ; i < M ; i++) {
            binaryFun(findArr[i]);
        }


        bw.flush();

        br.close();
        bw.close();
    }
}