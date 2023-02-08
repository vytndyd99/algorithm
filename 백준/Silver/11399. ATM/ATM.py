import sys

N = int(sys.stdin.readline())

Parr = list(map(int, sys.stdin.readline().split(" ")))

Parr.sort() # 오름차순 정렬

answer = 0

for i in range(N):
    answer += sum(Parr[0 : i + 1])

print(answer)