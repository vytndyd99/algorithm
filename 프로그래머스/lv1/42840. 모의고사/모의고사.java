import java.util.*;

class Solution {
    public List<Integer> solution(int[] answers) {
        List<Integer> answer = new ArrayList<>();
        
        int[] answer1 = {1,2,3,4,5};
        int[] answer2 = {2,1,2,3,2,4,2,5};
        int[] answer3 = {3,3,1,1,2,2,4,4,5,5};
        int[] oldAnswer = {0, 0, 0};
        
        for(int i = 0 ; i < answers.length ; i++) {
            int answerNum = answers[i];
            if(answer1[i % 5] == answerNum) {
                oldAnswer[0] += 1;
            }
            if(answer2[i % 8] == answerNum) {
                oldAnswer[1] += 1;
            }
            if(answer3[i % 10] == answerNum) {
                oldAnswer[2] += 1;
            }
        }
        
        int maxNum = Arrays.stream(oldAnswer).max().getAsInt();
        
        for(int i = 0 ; i < oldAnswer.length ; i++) {
            if(oldAnswer[i] == maxNum) {
                answer.add(i + 1);
            }
        }
        
        return answer;
    }
}