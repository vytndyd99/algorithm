import java.io.*;
import java.util.*;

public class Solution {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static int[] dx = {1, 1, 0, -1, -1, -1, 0, 1};
    private static int[] dy = {0, -1, -1, -1, 0, 1, 1, 1};

    private static boolean width(int[][] nums, int y, int x) {
        int sum = nums[y][x];

        int rightX = x + 1;
        int leftX = x - 1;

        while(rightX < 9) {
            sum += nums[y][rightX];
            rightX += 1;
        }

        while(leftX >= 0) {
            sum += nums[y][leftX];
            leftX -= 1;
        }

        if(sum == 45) {
            return true;
        }
        else {
            return false;
        }
    }

    private static boolean height(int[][] nums, int y, int x) {
        int sum = nums[y][x];

        int downY = y - 1;
        int upY = y + 1;

        while(downY >= 0) {
            sum += nums[downY][x];
            downY -= 1;
        }

        while(upY < 9) {
            sum += nums[upY][x];
            upY += 1;
        }

        if(sum == 45) {
            return true;
        }
        else {
            return false;
        }

    }

    private static boolean inside(int[][] nums, int y, int x) {
        int sum = 0;

        if(y % 3 == 0) {
            y += 1;
        }
        else if(y % 3 == 2) {
            y -= 1;
        }

        if(x % 3 == 0) {
            x += 1;
        }
        else if(x % 3 == 2) {
            x -= 1;
        }

        sum += nums[y][x];

        for(int i = 0 ; i < 8 ; i++) {
            sum += nums[y + dy[i]][x + dx[i]];
        }

        if(sum == 45) {
            return true;
        }
        else {
            return false;
        }



    }

    private static boolean solution(int[][] nums) throws IOException{
        for(int i = 0 ; i < 9 ; i++) {
            for(int j = 0 ; j < 9 ; j++) {
                if(!width(nums, i, j) || !height(nums, i, j) || !inside(nums, i, j)) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) throws IOException {
        
        int T = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < T ; i++) {
            int[][] nums = new int[9][9];
            for(int j = 0 ; j < 9 ; j++) {
                st = new StringTokenizer(br.readLine(), " ");
                for(int k = 0 ; k < 9 ; k++) {
                    nums[j][k] = Integer.parseInt(st.nextToken());
                }
            }

            if(solution(nums)) {
                bw.write("#" + Integer.toString(i + 1) + " " + "1");
            }
            else {
                bw.write("#" + Integer.toString(i + 1) + " 0");
            }

            bw.write("\n");

        }

        bw.flush();

        br.close();
        bw.close();
    }
}