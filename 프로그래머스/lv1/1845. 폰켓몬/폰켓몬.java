import java.util.*;
import java.io.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int count = nums.length / 2;
        
        // 인트형 리스트를 리스트형으로 바꾸고, set 자료구조로 바꾸어 중복을 제거후, 다시 리스트형으로 변환
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < nums.length ; i++) {
            list.add(nums[i]);
        }
        Set<Integer> set = new HashSet<>(list);
        List<Integer> newList = new ArrayList<>(set);
        
        int newListSize = newList.size();
        
        if(count <= newListSize) {
            answer = count;
        }
        else {
            answer = newListSize;
        }
        
        return answer;
    }
}