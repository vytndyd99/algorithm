import sys

n = int(sys.stdin.readline())

nums = list(map(int, sys.stdin.readline().split(" ")))

x = int(sys.stdin.readline())

startIdx = 0
endIdx = len(nums) - 1

count = 0

nums.sort()

while(startIdx < endIdx):
    sumNum = nums[startIdx] + nums[endIdx]
    if(sumNum > x):
        endIdx -= 1
    elif(sumNum < x):
        startIdx += 1
    else:
        count += 1
        startIdx += 1
        endIdx -= 1

print(count)
