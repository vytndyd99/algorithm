import sys

N = int(sys.stdin.readline())

i = 1

while(i < 1000001):
    nums = str(i)
    sum = 0
    for j in range(len(nums)):
        sum += int(nums[j])
    sum += int(nums)
    if(sum == N):
        break
    i += 1

if(i == 1000001):
    print(0)
else:
    print(i)