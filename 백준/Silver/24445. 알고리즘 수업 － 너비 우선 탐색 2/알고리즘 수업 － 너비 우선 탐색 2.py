import sys
import collections

sys.setrecursionlimit(10 ** 6) # 재귀 횟수 제한 증가

N, M, R = map(int, sys.stdin.readline().split(" "))

graph = [[] for i in range(N + 1)]

ans = [0 for i in range(N + 1)]

seq = 1

for i in range(M):
    a, b = map(int, sys.stdin.readline().split(" "))
    graph[a].append(b)
    graph[b].append(a)

def BFS(start):
    global seq

    q = collections.deque([start]) # 처음 좌표
    ans[start] = seq
    
    while q:
        start = q.popleft()
        graph[start].sort(reverse=True)
        for s in graph[start]:
            if(ans[s] == 0):
                seq += 1
                ans[s] = seq
                q.append(s)

BFS(R)

for i in range(1, len(ans)):
    print(ans[i])