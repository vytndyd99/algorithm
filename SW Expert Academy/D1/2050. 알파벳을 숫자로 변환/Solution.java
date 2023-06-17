import java.io.*;
import java.util.*;

public class Solution {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static int[] arr;

    private static void alphaToNum(String alphabet) {
        for(int i = 0 ; i < alphabet.length() ; i++) {
            int num = (int)alphabet.charAt(i) - 96; // a는 아스키코드로 바꾸면 97이기에 96을 빼어 a를 1로 시작
            arr[i] = num;
        }
    }

    private static void printAlpha() throws IOException{
        for(int i = 0 ; i < arr.length ; i++) {
            bw.write(Integer.toString(arr[i]));
            if(i != arr.length - 1) {
                bw.write(" ");
            }
        }
    }

    public static void main(String[] args) throws IOException {
        
        String alphabet = br.readLine();

        arr = new int[alphabet.length()];

        alphaToNum(alphabet.toLowerCase());

        printAlpha();



        bw.flush();

        br.close();
        bw.close();
    }
}