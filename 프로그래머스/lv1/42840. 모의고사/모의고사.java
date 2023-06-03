import java.util.*;

class Solution {
    public LinkedList solution(int[] answers) {
        LinkedList<Integer> answer = new LinkedList<>();
        
        int[] fir = {1,2,3,4,5}; // 1번 수포자
        int[] sec = {2,1,2,3,2,4,2,5}; // 2번 수포자
        int[] thd = {3,3,1,1,2,2,4,4,5,5}; // 3번 수포자
        
        int firAns = 0;
        int secAns = 0;
        int thdAns = 0;
        
        for(int i = 0 ; i < answers.length ; i++) {
            for(int j = 1 ; j <= 3 ; j++) {
                if(j == 1) {
                    if(answers[i] == fir[i % 5]) {
                        firAns += 1;
                    }
                }
                else if(j == 2) {
                    if(answers[i] == sec[i % 8]) {
                        secAns += 1;
                    }
                }
                else if(j == 3) {
                    if(answers[i] == thd[i % 10]) {
                        thdAns += 1;
                    }
                }
            }
        }
        
        int maxSolve = 0;
        
        if(maxSolve < firAns) {
            maxSolve = firAns;
        }
        
        if(maxSolve < secAns) {
            maxSolve = secAns;
        }
        
        if(maxSolve < thdAns) {
            maxSolve = thdAns;
        }
        
        for(int i = 1 ; i <= 3 ; i++) {
            if(i == 1) {
                if(maxSolve == firAns) {
                    answer.add(i);
                }
            }
            else if(i == 2) {
                if(maxSolve == secAns) {
                    answer.add(i);
                }
            }
            else if(i == 3) {
                if(maxSolve == thdAns) {
                    answer.add(i);
                }
            }
        }
        
        
        
        return answer;
    }
}