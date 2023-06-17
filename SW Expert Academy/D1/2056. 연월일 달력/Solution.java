import java.io.*;
import java.util.*;

public class Solution {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; 

    private static boolean checkDate(String date) {
        int month = Integer.parseInt(date.substring(4, 6));
        int day = Integer.parseInt(date.substring(6, 8));
        
        if(month > 12 || month == 0) {
            return false;
        }

        if(day > days[month - 1]) {
            return false;
        }
        else {
            return true;
        }
    }

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < T ; i++) {
            String date = br.readLine();
            
            boolean correctDate = checkDate(date);

            bw.write("#");
            bw.write(Integer.toString(i + 1) + " ");
            if(correctDate) {
                String year = date.substring(0, 4);
                String month = date.substring(4, 6);
                String day = date.substring(6, 8);

                bw.write(year + "/" + month + "/" + day);
            }
            else {
                bw.write(Integer.toString(-1));
            }

            bw.write("\n");
        }

        bw.flush();

        br.close();
        bw.close();
    }
}