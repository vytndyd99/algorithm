
import java.util.*;
import java.io.*;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    
    private static boolean solution(String str) {
        
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0 ; i < str.length(); i++) {
            Character c = str.charAt(i);
            Character checkChr;
            if(c.equals('(') || c.equals('[')) {
                stack.add(c);
            }
            else if(c.equals(')')) {
                if(stack.isEmpty()) {
                    return false;
                }
                checkChr = stack.peek();
                if(checkChr.equals('(')) {
                    stack.pop();
                }
                else {
                    return false;
                }
            }
            else if(c.equals(']')) {
                if(stack.isEmpty()) {
                    return false;
                }
                
                checkChr = stack.peek();
                if(checkChr.equals('[')) {
                    stack.pop();
                }
                else {
                    return false;
                }
            }
        }
        
        if(stack.isEmpty()) {
            return true;
        }
        else {
            return false;
        }
        
         
        
    }
    


    public static void main(String[] args) throws IOException {
        
        while(true) {
            String str = br.readLine();
            if(str.equals(".")) {
                break;
            }
            boolean answer = solution(str);
            if(answer) {
                bw.write("yes");
            }
            else {
                bw.write("no");
            }
            bw.write("\n");
        }
        
        
        bw.flush();
        br.close();
        bw.close();
        
        
    }

}
