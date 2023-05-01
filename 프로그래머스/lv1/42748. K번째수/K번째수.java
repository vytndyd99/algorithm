import java.util.*;

class Solution {
    public List<Integer> solution(int[] array, int[][] commands) {
        List<Integer> answer = new ArrayList<>();
        
        for(int i = 0 ; i < commands.length ; i++) {
            List<Integer> arr = new ArrayList<>();
            int startIdx = commands[i][0] - 1;
            int endIdx = commands[i][1];
            for(int j = startIdx ; j < endIdx ; j++) {
                arr.add(array[j]);
            }
            
            Collections.sort(arr);
            answer.add(arr.get(commands[i][2] - 1));
        }
        
        return answer;
    }
}