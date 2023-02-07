import sys

N, K = map(int, sys.stdin.readline().split(" "))

temArr = list(map(int, sys.stdin.readline().split(" ")))

sumArr = [0]

for i in range(1, N + 1):
    sumArr.append(temArr[i - 1] + sumArr[i - 1])

maxNum = -100000001

for i in range(len(sumArr) - K):
    if(maxNum < sumArr[i + K] - sumArr[i]):
        maxNum = sumArr[i + K] - sumArr[i]
    
print(maxNum)