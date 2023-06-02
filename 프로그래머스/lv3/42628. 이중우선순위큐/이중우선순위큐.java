import java.util.*;

class Solution {
    private static PriorityQueue<Integer> minq = new PriorityQueue<>(); // 최소힙
    private static PriorityQueue<Integer> maxq = new PriorityQueue<>(Collections.reverseOrder()); // 최대힙
    
    
    // 최대힙상태에서 실행
    private static void funMax() {
        int removeNum = maxq.poll();
        minq.remove(removeNum);
    }
    
    //최소힙상태에서 실행
    private static void funMin() {
        int removeNum = minq.poll();
        maxq.remove(removeNum);
    }
    
    //두 힙에서 모두 숫자 삽입
    private static void insert(int num) {
        maxq.add(num);
        minq.add(num);
    }
    
    public int[] solution(String[] operations) {
        int[] answer = {0, 0};
        
        for(int i = 0 ; i < operations.length ; i++) {
            String[] arr = operations[i].split(" ");
            String command = arr[0];
            int num = Integer.parseInt(arr[1]);
            
            // 삽입문일때
            if(command.equals("I")) {
                insert(num);
            }
            // 삭제문일때
            else if(command.equals("D")) {
                // 최대힙 삭제
                if(num == 1) {
                    if(maxq.size() < 1) {
                        continue;
                    }
                    funMax();
                }
                // 최소힙삭제
                else if(num == -1) {
                    if(minq.size() < 1) {
                        continue;
                    }
                    funMin();
                }
            }
        }
        
        
        // 큐에 아무 값이라도 하나라도 있는경우
        if(maxq.size() >= 1) {
            answer[0] = maxq.peek();
            answer[1] = minq.peek();
        } 
        
        return answer;
    }
}