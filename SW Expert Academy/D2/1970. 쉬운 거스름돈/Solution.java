import java.io.*;
import java.util.*;

public class Solution {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static int N;

    private static int five_0000() {
        int count = 0;

        if(N >= 50000) {
            count = N / 50000;
            N = N % 50000;
        }

        return count;
    }

    private static int one_0000() {
        int count = 0;

        if(N >= 10000) {
            count = N / 10000;
            N = N % 10000;
        }

        return count;
    }

    private static int five_000() {
        int count = 0;

        if(N >= 5000) {
            count = N / 5000;
            N = N % 5000;
        }

        return count;
    }

    private static int one_000() {
        int count = 0;

        if(N >= 1000) {
            count = N / 1000;
            N = N % 1000;
        }

        return count;
    }

    private static int five_00() {
        int count = 0;

        if(N >= 500) {
            count = N / 500;
            N = N % 500;
        }

        return count;
    }

    private static int one_00() {
        int count = 0;

        if(N >= 100) {
            count = N / 100;
            N = N % 100;
        }

        return count;
    }

    private static int five_0() {
        int count = 0;

        if(N >= 50) {
            count = N / 50;
            N = N % 50;
        }

        return count;
    }

    private static int one_0() {
        int count = 0;

        if(N >= 10) {
            count = N / 10;
            N = N % 10;
        }

        return count;
    }

    private static void solution(int sequence) throws IOException{
        int five_0000 = five_0000();
        int one_0000 = one_0000();
        int five_000 = five_000();
        int one_000 = one_000();
        int five_00 = five_00();
        int one_00 = one_00();
        int five_0 = five_0();
        int one_0 = one_0();

        bw.write("#" + Integer.toString(sequence));
        bw.write("\n");

        bw.write(Integer.toString(five_0000) + " ");
        bw.write(Integer.toString(one_0000) + " ");
        bw.write(Integer.toString(five_000) + " ");
        bw.write(Integer.toString(one_000) + " ");
        bw.write(Integer.toString(five_00) + " ");
        bw.write(Integer.toString(one_00) + " ");
        bw.write(Integer.toString(five_0) + " ");
        bw.write(Integer.toString(one_0));

    }

    public static void main(String[] args) throws IOException {
        
        int T = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < T ; i++) {
            N = Integer.parseInt(br.readLine());
            solution(i + 1);
            bw.write("\n");
        }

        bw.flush();

        br.close();
        bw.close();
    }
}