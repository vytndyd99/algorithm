import java.util.*;
import java.io.*;

public class Solution {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static int[][] arr;
    
    // 열
    private static int row() {
        int maxSum = 0;
        
        for(int i = 0 ; i < 100 ; i++) {
            int sum = 0;
            for(int j = 0 ; j < 100 ; j++) {
                sum += arr[j][i];
            }
            
            if(sum > maxSum) {
                maxSum = sum;
            }
        }
        
        return maxSum;
        
    }
    
    // 행
    private static int col() {
        int maxSum = 0;
        
        for(int i = 0 ; i < 100 ; i++) {
            int sum = 0;
            for(int j = 0 ; j < 100 ; j++) {
                sum += arr[i][j];
            }
            
            if(sum > maxSum) {
                maxSum = sum;
            }
        }
        
        return maxSum;
    }
    
    private static int rightDiagonal() {
        int sum = 0;
        
        for(int i = 0 ; i < 100 ; i++) {
            sum += arr[i][i];
        }
        
        return sum;
    }
    
    private static int leftDiagonal() {
        int sum = 0;
        
        for(int i = 0 ; i < 100 ; i++) {
            sum += arr[i][99 - i];
        }
        
        return sum;
    }
    
    // 대각선
    private static int diagonal() {
        int maxSum = 0;
        
        int rightSum = rightDiagonal();
        int leftSum = leftDiagonal();
        
        return Math.max(rightSum, leftSum);
    }


    
    private static int solution() {
        int answer = Math.max(row(), Math.max(col(), diagonal()));
        
        return answer;
        
    }
    

    /**
     * @param args
     */
    public static void main(String[] args) throws IOException{
        
        // int T = Integer.parseInt(br.readLine());
        
        for(int i = 1 ; i <= 10 ; i++) {
            int T = Integer.parseInt(br.readLine());
            
            arr = new int[100][100];
            
            for(int j = 0 ; j < 100 ; j++) {
                st = new StringTokenizer(br.readLine(), " ");
                for(int k = 0 ; k < 100 ; k++) {
                    arr[j][k] = Integer.parseInt(st.nextToken());
                }
            }
            
            int answer = solution();
            
            bw.write("#" + Integer.toString(T) + " " + Integer.toString(answer) + "\n");
            
            
            
        }
        
        
        bw.flush();
        br.close();
        bw.close();
    }

}