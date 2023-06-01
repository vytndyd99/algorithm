class Solution {
    
    private static int sum, count = 0;
    
    private static void dfs(int deep, int[] numbers, int target, int sum) {
        if(deep == numbers.length) {
            if(sum == target) {
                count += 1;
            }
            return;
        }
        for(int i = 0 ; i < 2 ; i++) {
            if(i == 0) { // +
                dfs(deep + 1, numbers, target, sum + numbers[deep]);
            }
            else if(i == 1) { // -
                dfs(deep + 1, numbers, target, sum - numbers[deep]);
            }
        }
    }
    
    public int solution(int[] numbers, int target) {
        
        dfs(0, numbers, target, sum);
        
        return count;
    }
}