import sys

N, M = map(int, sys.stdin.readline().split(" "))

numArr = list(map(int, sys.stdin.readline().split(" ")))

sumArr = [0]

for i in range(1, N + 1):
    sumArr.append(sumArr[i - 1] + numArr[i - 1])

for i in range(M):
    i, j = map(int, sys.stdin.readline().split(" "))
    sum = sumArr[j] - sumArr[i - 1]
    print(sum)
    