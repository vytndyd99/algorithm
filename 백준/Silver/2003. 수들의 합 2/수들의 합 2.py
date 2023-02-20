import sys

N, M = map(int, sys.stdin.readline().split(" "))

nums = list(map(int, sys.stdin.readline().split(" ")))

start = 0
end = 0
count = 0
sum = nums[end]

while(start < N):
    if(end == N - 1):
        if(sum == M):
            count += 1
        sum -= nums[start]
        start += 1
    else:
        if(sum > M):
            sum -= nums[start]
            start += 1
        elif(sum < M):
            end += 1
            sum += nums[end]
        else:
            count += 1
            if(start <= end):
                sum -= nums[start]
                start += 1
            else:
                end += 1
                sum += nums[end]
    

print(count)