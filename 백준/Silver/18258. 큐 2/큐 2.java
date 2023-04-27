import java.util.*;
import java.io.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static int N;
    private static Deque<Integer> q = new LinkedList<>();

    private static void push(int num) {
        q.add(num);
    }
    
    private static int pop() {
        if(q.isEmpty()) {
            return -1;
        }
        else {
            return q.poll();
        }
    }

    private static int size() {
        int size = q.size();
        return size;
    }

    private static int empty() {
        if(q.isEmpty()) {
            return 1;
        }
        else {
            return 0;
        }
    }

    private static int front() {
        if(q.isEmpty()) {
            return -1;
        }
        else {
            return q.peek();
        }
    }

    private static int back() {
        if(q.isEmpty()) {
            return -1;
        }
        else {
            return q.peekLast();
        }
    }
    

    public static void main(String[] args) throws IOException {
            
        N = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < N ; i++) {
            String command = br.readLine();
            if(command.equals("pop")) {
                bw.write(Integer.toString(pop()));
                bw.write("\n");
            }
            else if(command.equals("size")) {
                bw.write(Integer.toString(size()));
                bw.write("\n");
            }
            else if(command.equals("empty")) {
                bw.write(Integer.toString(empty()));
                bw.write("\n");
            }
            else if(command.equals("front")) {
                bw.write(Integer.toString(front()));
                bw.write("\n");
            }
            else if(command.equals("back")) { 
                bw.write(Integer.toString(back()));
                bw.write("\n");
            }
            else {
                String[] commands = command.split(" ");
                int num = Integer.parseInt(commands[1]);
                push(num);
            }
        }


        bw.flush();
        br.close();
        bw.close();
    }
} 