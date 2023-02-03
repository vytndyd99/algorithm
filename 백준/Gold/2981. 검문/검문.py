import sys
import math

N = int(sys.stdin.readline())

arr = []

for i in range(N):
    num = int(sys.stdin.readline())
    arr.append(num)

arr.sort() # 오름차순 정렬

nums = []

for i in range(1, len(arr)):
    dif = arr[i] - arr[i - 1]
    nums.append(dif)

gcdNum = nums[0]

for i in range(1, len(nums)):
    gcdNum = math.gcd(gcdNum, nums[i])

answer = []

for i in range(2, int(math.sqrt(gcdNum)) + 1):
    if(gcdNum % i == 0):
        answer.append(i)
        answer.append(gcdNum // i)

answer.append(gcdNum)

answer = list(set(answer))

answer.sort()

for s in answer:
    print(s, end=" ")