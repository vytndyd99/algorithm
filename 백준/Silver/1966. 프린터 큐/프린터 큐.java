// created by Ipad
import java.util.*;
import java.io.*;

public class Main{

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static Deque<Integer> priority;



    public static void main(String[] args) throws IOException{

        int T = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < T ; i++) {
            priority = new LinkedList<>();
            st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine(), " ");
            while(st.hasMoreTokens()) {
                priority.add(Integer.parseInt(st.nextToken()));
            }

           int count = 1;
            
            //peek 는 맨앞에 값 확인용, poll은 맨 앞에값 빼버리기
            while(true) {
                int maxPriority = Collections.max(priority);
                if(priority.peek() == maxPriority) {
                    if(M == 0) {
                        break;
                    }
                    else {
                        priority.poll();
                        M = ((M - 1) + priority.size()) % priority.size();
                        count += 1;
                    }
                }
                else {
                    int num = priority.peek();
                    priority.poll();
                    priority.addLast(num);
                    M = ((M - 1) + priority.size()) % priority.size();
                }   
            }
            bw.write(Integer.toString(count));
            bw.write("\n"); 
        
        }

        bw.flush();

        br.close();
        bw.close();
    }
}