import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int N = Integer.parseInt(br.readLine());

            int[] sang = new int[N];

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int j = 0;

            while(st.hasMoreTokens()) {
                int num = Integer.parseInt(st.nextToken());
                sang[j] = num;
                j += 1;
            }

            int M = Integer.parseInt(br.readLine());

            st = new StringTokenizer(br.readLine(), " ");

            int[] arr = new int[M];

            for(int i = 0 ; i < M ; i++) {
                int num = Integer.parseInt(st.nextToken());
                arr[i] = num;
            }

            int[] answer = new int[M]; // 정답이 적힌 배열의 개수

            Arrays.sort(sang);

            for(int w = 0 ; w < M ; w++) {
                int leftIdx = 0;
                int rightIdx = N - 1;

                while(leftIdx <= rightIdx) {
                    int midIdx = (leftIdx + rightIdx) / 2;
                    if(sang[midIdx] == arr[w]) {
                        answer[w] = 1;
                        break;
                    }
                    else if(sang[midIdx] > arr[w]) {
                        rightIdx = midIdx - 1;
                        continue;
                    }
                    else if(sang[midIdx] < arr[w]) {
                        leftIdx = midIdx + 1;
                        continue;
                    }
                }
            }

            for(int d = 0; d < M ; d++) {
                if(d == M - 1) {
                    bw.write(Integer.toString(answer[d]));
                }
                else {
                    bw.write(Integer.toString(answer[d]));
                    bw.write(" ");
                }
                
            }

            bw.flush();
            br.close();
            bw.close();
    }
} 