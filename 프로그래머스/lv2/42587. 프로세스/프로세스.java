import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        Deque<Integer> q = new LinkedList<>();
        for(int i = 0 ; i < priorities.length ; i++) {
            q.add(priorities[i]);
        }
        
        while(true) {
            int maxPriority = Collections.max(q);
            if(maxPriority == q.peek()) {
                answer += 1;
                if(location == 0) {
                    break;
                }
                else {
                    q.poll();
                    location = (location - 1 + q.size()) % q.size();
                }
            }
            else {
                int num = q.poll();
                q.add(num);
                location = (location - 1 + q.size()) % q.size();
            }
        }
        
        return answer;
    }
}