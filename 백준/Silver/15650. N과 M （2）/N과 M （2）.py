import sys

N, M = map(int, sys.stdin.readline().split(" "))

visitedArr = [False for i in range(N + 1)]

answer = []

def back(arr, depth, start):
    if(depth == M):
        print(" ".join(map(str, answer)))
        return 
    for i in range(start, N + 1):
        if(arr[i] != True):
            answer.append(i)
            arr[i] = True
            back(arr, depth + 1, i + 1)
            arr[i] = False
            answer.pop()

back(visitedArr, 0, 1)