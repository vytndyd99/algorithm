import sys

N, M = map(int, sys.stdin.readline().split())

arr = []

flag = [False] * (N + 1)

def recue(deepNum):
    if(deepNum == M):
        print(" ".join(map(str, arr)))
        return
    for i in range(1, N + 1):
        if(not flag[i]):
            flag[i] = True # 방문
            arr.append(i)
            recue(deepNum + 1)
            flag[i] = False
            arr.pop()

recue(0)