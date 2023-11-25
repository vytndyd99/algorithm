

import java.util.*;
import java.io.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static Deque<Integer> deq = new LinkedList<>();
    
    private static void solution() throws IOException {
    
        if(st.countTokens() == 1) {
            int firCmd = Integer.parseInt(st.nextToken());
            if(firCmd == 3) {
                if(!deq.isEmpty()) {
                    bw.write(Integer.toString(deq.poll()));
                }
                else {
                    bw.write(Integer.toString(-1));
                }
            }
            else if(firCmd == 4) {
                if(!deq.isEmpty()) {
                    bw.write(Integer.toString(deq.pollLast()));
                }
                else {
                    bw.write(Integer.toString(-1));
                }
            }
            else if(firCmd == 5) {
                bw.write(Integer.toString(deq.size()));
            }
            else if(firCmd == 6) {
                if(deq.isEmpty()) {
                    bw.write(Integer.toString(1));
                }
                else {
                    bw.write(Integer.toString(0));
                }
            }
            else if(firCmd == 7) {
                if(!deq.isEmpty()) {
                    bw.write(Integer.toString(deq.peek()));
                }
                else {
                    bw.write(Integer.toString(-1));
                }
            }
            else if(firCmd == 8) {
                if(!deq.isEmpty()) {
                    bw.write(Integer.toString(deq.peekLast()));
                }
                else {
                    bw.write(Integer.toString(-1));
                }
            }
            bw.write("\n");
        }
        else {
            int firCmd = Integer.parseInt(st.nextToken());
            int secCmd = Integer.parseInt(st.nextToken());
            if(firCmd == 1) {
                deq.addFirst(secCmd);
            }
            else {
                deq.add(secCmd);
            }
        }
    }
    
   
    


    public static void main(String[] args) throws IOException {
        
        int N = Integer.parseInt(br.readLine());
        
        for(int i = 0 ; i < N ; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            solution();
        }
        
        
        bw.flush();
        br.close();
        bw.close();
        
        
    }

}
