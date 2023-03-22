import java.util.*;
import java.io.*;

public class Main{

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

    private static boolean errorCheck(Deque<Integer> arr) {
        if(arr.size() == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    private static boolean revCheck(int rev) {
        // 리버스 실행 횟수가 짝수번이면 리버스를 실행할 필요가 없기에 true를 반환
        if(rev % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }


    public static void main(String[] args) throws IOException{
        
        int T = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < T ; i++) {
            String s = br.readLine();
            int n = Integer.parseInt(br.readLine());
            String arr = br.readLine();
            String[] Arr;

            if(n > 0) {
                arr = arr.substring(1, arr.length() - 1);
                Arr = arr.split(",");
            }
            else {
                Arr = new String[0];
            }

            Deque<Integer> q = new LinkedList<>();
            for(int j = 0 ; j < Arr.length ; j++) {
                q.add(Integer.parseInt(Arr[j]));
            }
            // 함수실행과정
            int rev = 0; // 뒤집기는 시간복잡도가 크기에 개수를 세서 쩍수번 실행이면 앞에서부터, 홀수번이면 뒤에서부터 뽑기
            
            boolean error = false;

            for(int k = 0 ; k < s.length() ; k++) {
                char c = s.charAt(k);
                if(c == 'R') {
                    rev += 1;
                }
                else if(c == 'D') {
                   if(errorCheck(q)) {
                        error = true;
                        break;
                   }
                   else {
                        if(revCheck(rev)) {
                            q.poll();
                        }
                        else {
                            q.pollLast();
                        }
                   }
                }
            }

            if(error) {
                bw.write("error");
                bw.write("\n");
            }
            else {
                // 뒤집기가 필요없을때는 앞에서부터 뽑기
                StringBuilder sb = new StringBuilder("[");
                int dequeSize = q.size();
                if(rev % 2 == 0) {
                    for(int count = 0 ; count < dequeSize ; count++) {
                        if(count == dequeSize - 1) {
                            sb.append(Integer.toString(q.poll()));
                        }
                        else {
                            sb.append(Integer.toString(q.poll())).append(",");
                        }
                    }
                }
                // 뒤집기가 한번 필요할때는 뒤에서부터 뽑기,
                else {
                    for(int count = 0 ; count < dequeSize ; count++) {
                        if(count == dequeSize - 1) {
                            sb.append(Integer.toString(q.pollLast()));
                        }
                        else {
                            sb.append(Integer.toString(q.pollLast())).append(",");
                        }
                    }
                }
                sb.append("]");
                bw.write(sb.toString());
                bw.write("\n");
            }
        }


        bw.flush();

        br.close();
        bw.close();
    }
}