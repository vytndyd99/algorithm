import java.util.*;

class Solution {
    public List<Integer> solution(int[] prices) {
        List<Integer> answer = new ArrayList<>();
        
        for(int i = 0 ; i < prices.length ; i++) {
            int sec = 0;
            int price = prices[i];
            if(i != prices.length - 1) {
                for(int j = i + 1 ;  j < prices.length ; j++) {
                    if(price <= prices[j]) {
                        sec += 1;
                    }
                    else {
                        sec += 1;
                        break;
                    }
                }
                answer.add(sec);
            }
            else {
                answer.add(0);
            }
        }
        
        return answer;
    }
}