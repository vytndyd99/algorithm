import sys

N, M = map(int, sys.stdin.readline().split(" "))

arr_N = [[0] * M for i in range(N)]
arr_M = [[0] * M for i in range(N)]

count = 0

for k in range(2):
    for i in range(N):
        arr = list(map(int, sys.stdin.readline().split(" ")))
        if(count == 0):
            for j in range(M):
                arr_N[i][j] = arr[j]
        else:
            for j in range(M):
                arr_M[i][j] = arr[j]
    count += 1

for i in range(N):
    for j in range(M):
        if(j == M - 1):
            print(arr_N[i][j] + arr_M[i][j])
        else:
            print(arr_N[i][j] + arr_M[i][j] , end=" ")
        