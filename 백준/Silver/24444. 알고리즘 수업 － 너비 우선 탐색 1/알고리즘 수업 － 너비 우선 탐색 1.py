import sys
import collections
sys.setrecursionlimit(10 ** 8)

N, M, R = map(int, sys.stdin.readline().split(" "))

graph = [[] for i in range(N + 1)]

visited = [False for i in range(N + 1)]

ans = [0 for i in range(N + 1)]

for i in range(M):
    a, b = map(int, sys.stdin.readline().split(" "))
    graph[a].append(b)
    graph[b].append(a)

for s in graph:
    s.sort()

seq = 0

def BFS(start):
    global seq
    seq += 1
    ans[start] = seq
    visited[start] = True
    q = collections.deque([start])
    while q:
        dot = q.popleft()
        for s in graph[dot]:
            if(visited[s] == False):
                visited[s] = True
                seq += 1
                ans[s] = seq
                q.append(s)

BFS(R)

for i in range(1, N + 1):
    print(ans[i])