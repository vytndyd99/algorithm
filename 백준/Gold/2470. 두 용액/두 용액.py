import sys

N = int(sys.stdin.readline())

nums = list(map(int, sys.stdin.readline().split(" ")))

start = 0
end = len(nums) - 1

nums.sort()

ans = [] # 정답

middleSum = abs(nums[start] + nums[end]) # 절댓값의 최솟값을 구해보는것을 목표

ans.append([start, end])

while(start < end):
    sumNum = abs(nums[start] + nums[end])
    if(sumNum < middleSum):
        middleSum = sumNum
        ans.append([start, end])
    if(nums[start] + nums[end] >= 0):
        end -= 1
    else:
        start += 1
        


realAns = ans[len(ans) - 1]
realAns = [nums[realAns[0]], nums[realAns[1]]]
realAns.sort()
for s in realAns:
    print(s, end=" ")