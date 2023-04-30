import java.util.*;

public class Solution {
    public List<Integer> solution(int []arr) {
        List<Integer> answer = new ArrayList<>();
        
        for(int i = 0 ; i < arr.length ; i++) {
            int num = arr[i];
            if(i == 0) {
                answer.add(num);
            }
            else {
                if(arr[i - 1] == num) {
                    continue;
                }
                else {
                    answer.add(num);
                }
            }
        }

        return answer;
    }
}