import java.io.*;
import java.util.*;

public class Solution {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

    private static void solution(int hour1, int hour2, int min1, int min2) throws IOException{
        int sumHour;
        int sumMin;
        
        if(min1 + min2 >= 60) {
            sumHour = (hour1 + hour2 + 1);
            if(sumHour > 12) {
                sumHour -= 12;
            }
            sumMin = min1 + min2 - 60;
        }
        else {
            sumHour = hour1 + hour2;
            if(sumHour > 12) {
                sumHour -= 12;
            }
            sumMin = min1 + min2;
        }

        bw.write(Integer.toString(sumHour) + " " + Integer.toString(sumMin));

    }

    public static void main(String[] args) throws IOException {
        
        int T = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < T ; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int hour1 = Integer.parseInt(st.nextToken());
            int min1 = Integer.parseInt(st.nextToken());
            int hour2 = Integer.parseInt(st.nextToken());
            int min2 = Integer.parseInt(st.nextToken());

            bw.write("#" + Integer.toString(i + 1) + " ");

            solution(hour1, hour2, min1, min2);

            bw.write("\n");
        }

        bw.flush();

        br.close();
        bw.close();
    }
}