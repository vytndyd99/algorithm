// created by Ipad
import java.util.*;
import java.io.*;

public class Main{

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

    private static void isTrue(String data) throws IOException {
        int left = 0;
        int right = 0;
        boolean trueFalse = false;
        for(int i = 0 ; i < data.length() ; i++) {
            char s = data.charAt(i);
            if(s == '(') {
                left += 1;
            }
            else {
                right += 1;
            }
            if(right > left) {
                break;
            }
        }
        if(right == left) {
            trueFalse = true;
        }
        if(trueFalse) {
            bw.write("YES");
            bw.write("\n");
        }
        else {
            bw.write("NO");
            bw.write("\n");
        }

    }


    public static void main(String[] args) throws IOException{

        int testCase = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < testCase ; i++) {
            String data = br.readLine();
            isTrue(data);
        }

        bw.flush();

        br.close();
        bw.close();
    }
}