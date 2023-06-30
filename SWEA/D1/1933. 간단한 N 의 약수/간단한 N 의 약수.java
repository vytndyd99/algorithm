import java.io.*;
import java.util.*;

public class Solution {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

    private static void solution(int N) throws IOException{
        HashSet<Integer> list = new HashSet<>();

        for(int i = 1 ; i <= (int)Math.sqrt(N) ; i++) {
            if(N % i == 0) {
                list.add(i);
                list.add(N / i);
                // list에 넣기
            }
        }

        LinkedList<Integer> sortList = new LinkedList<>(list);
        Collections.sort(sortList);

        int size = sortList.size();

        for(int i = 0 ; i < size ; i++) {
            bw.write(Integer.toString(sortList.poll()));
            if(i != size - 1) {
                bw.write(" ");
            }
        }



    }

    public static void main(String[] args) throws IOException {
        
        int N = Integer.parseInt(br.readLine());

        solution(N);



        bw.flush();

        br.close();
        bw.close();
    }
}
