class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        int left = 0;
        int right = 0;
        
        for(int i = 0 ; i < s.length() ; i++) {
            if(s.charAt(i) == ')') {
                if(left == 0) {
                    answer = false;
                }
                else {
                    left -= 1;
                }
            }
            else {
                left += 1;
            }
        }
        
        if(answer) {
            if(left == right) {
                answer = true;
            }
            else {
                answer = false;
            }   
        }

        return answer;
    }
}