import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        for(int i = 0 ; i < scoville.length ; i++) {
            minHeap.add(scoville[i]);
        }
        
        boolean flag = true;
        
        while(flag) {
            if(minHeap.peek() >= K) {
                return 0;
            }
            answer += 1;
            int firstMin = minHeap.poll();
            int secondMin = minHeap.poll();   
            int newScoville = firstMin + (secondMin * 2);
            minHeap.add(newScoville);
            if(minHeap.peek() >= K) {
                flag = false;
            }
            else {
                if(minHeap.size() == 1) {
                    return -1;
                }
            }
        }
        
        
        
        return answer;
    }
}