class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        int maxWeight = 0;
        int maxHeight = 0;
        
        for(int i = 0 ; i < sizes.length ; i++) {
            boolean flag = sizes[i][0] < sizes[i][1];
            
            if(flag) {
                int temp = sizes[i][1];
                sizes[i][1] = sizes[i][0];
                sizes[i][0] = temp;
            }
            
            if(maxWeight < sizes[i][0]) {
                maxWeight = sizes[i][0];
            }
            
            if(maxHeight < sizes[i][1]) {
                maxHeight = sizes[i][1];
            }
        }
        
        answer = maxWeight * maxHeight;
        
        return answer;
    }
}