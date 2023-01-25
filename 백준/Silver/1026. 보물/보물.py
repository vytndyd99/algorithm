import sys

N = int(sys.stdin.readline()) # 길이

A = sorted(list(map(int, sys.stdin.readline().split()))) # A 배열 생성

B = list(reversed(sorted(list(map(int, sys.stdin.readline().split()))))) # B 배엻 생성

sum = 0 # 합계 생성

for i in range(N):
    sum += A[i] * B[i]

print(sum)