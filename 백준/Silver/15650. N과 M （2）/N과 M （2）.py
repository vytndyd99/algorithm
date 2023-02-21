import sys

N, M = map(int, sys.stdin.readline().split(" "))

visited = [False for i in range(N + 1)]

answer = []

def DFS(deep, start):
    if(deep == M):
        print(" ".join(map(str, answer)))
        return
    for i in range(start, N + 1):
        if(visited[i] == False):
            visited[i] = True
            answer.append(i)
            DFS(deep + 1, i + 1)
            answer.pop()
            visited[i] = False

DFS(0, 1)