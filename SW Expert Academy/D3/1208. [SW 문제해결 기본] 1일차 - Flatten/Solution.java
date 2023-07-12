import java.util.*;
import java.io.*;

public class Solution {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;
    private static int[] arr;
    
    private static int maxSeq() {
        int maxHeight = Arrays.stream(arr).max().getAsInt();
        int findIdx = 0;
        for(int i = 0 ; i < arr.length ; i++) {
            if(arr[i] == maxHeight) {
                findIdx = i;
                break;
            }
        }
        
        return findIdx;
    }
    
    private static int minSeq() {
        int minHeight = Arrays.stream(arr).min().getAsInt();
        int findIdx = 0;
        for(int i = 0 ; i < arr.length ; i++) {
            if(arr[i] == minHeight) {
                findIdx = i;
                break;
            }
        }
        
        return findIdx;
    }

    
    private static int solution(int count) {
        int answer;
        
        for(int i = 0 ; i < count ; i++) {
            int maxIdx = maxSeq();
            int minIdx = minSeq();
            
            arr[maxIdx] -= 1;
            arr[minIdx] += 1;
        }
        
        answer = Arrays.stream(arr).max().getAsInt() - Arrays.stream(arr).min().getAsInt();
        
        return answer;
    }
    

    /**
     * @param args
     */
    public static void main(String[] args) throws IOException{
        
        // int T = Integer.parseInt(br.readLine());
        
        for(int i = 1 ; i <= 10 ; i++) {
            arr = new int[100];
            int count = Integer.parseInt(br.readLine());
            
            st = new StringTokenizer(br.readLine(), " ");
            
            for(int j = 0 ; j < 100 ; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            
            int answer = solution(count);
            
            bw.write("#" + Integer.toString(i) + " " + Integer.toString(answer) + "\n");
            
            
            
        }
        
        
        bw.flush();
        br.close();
        bw.close();
    }

}