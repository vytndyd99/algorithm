import sys

N = int(sys.stdin.readline())

arr = list(map(int, sys.stdin.readline().split(" ")))

sums = [arr[0]]

for i in range(1, N):
    sums.append(max(sums[i - 1] + arr[i], arr[i]))

print(max(sums))