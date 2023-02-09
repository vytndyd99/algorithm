import sys

# arr1 배열 생성 과정 (N * M 배열)
N, M = map(int, sys.stdin.readline().split(" "))

arr1 = []

for i in range(N):
    nums = list(map(int, sys.stdin.readline().split(" ")))
    arr1.append(nums)

# arr2 배열 생성 과정 (M * K 배열)
M, K = map(int, sys.stdin.readline().split(" "))

arr2 = []

for i in range(M):
    nums = list(map(int, sys.stdin.readline().split(" ")))
    arr2.append(nums)

answer = []

for n in range(N): 
    arr = []
    for k in range(K): 
        num = 0
        for m in range(M): 
            num += arr1[n][m] * arr2[m][k]
        arr.append(num)
    answer.append(arr)

for i in range(len(answer)):
    print(" ".join(map(str, answer[i])))