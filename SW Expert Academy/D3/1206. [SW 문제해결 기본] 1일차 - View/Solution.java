import java.util.*;
import java.io.*;

public class Solution {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static int[] arr;
    
    private static boolean checkTrue(int height, int sequence) {
        if(height > arr[sequence - 1] && height > arr[sequence - 2] && height > arr[sequence + 1] && height > arr[sequence + 2]) {
            return true;
        }
        else {
            return false;
        }
        
    }

    
    private static int solution() {
        int answer = 0;
        
        for(int i = 0 ; i < arr.length ; i++) {
            if(arr[i] > 0) {
                for(int j = 1 ; j <= arr[i] ; j++) {
                    if(checkTrue(j, i)) {
                        answer += 1;
                    }
                }
            }
            else {
                continue;
            }
        }
        
        return answer;
    }
    

    /**
     * @param args
     */
    public static void main(String[] args) throws IOException{
        
        // int T = Integer.parseInt(br.readLine());
        for(int i = 1 ; i <= 10 ; i++) {
            int N = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine(), " ");
            
            arr = new int[N];
            
            for(int j = 0 ; j < N ; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            
            int answer = solution();
            
            bw.write("#" + Integer.toString(i) + " " + Integer.toString(answer) + "\n");
            
            
            
        }
        
        
        bw.flush();
        br.close();
        bw.close();
    }

}