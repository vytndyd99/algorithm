import sys

sys.setrecursionlimit(10 ** 6) # 재귀 횟수 제한 늘리기

# N : 정점, M : 간선, R : 시작 정점
N, M, R = map(int, sys.stdin.readline().split(" "))

graph = [[] for i in range(N + 1)]
ans = [0 for i in range(N + 1)]
seq = 1

for i in range(M):
    a, b = map(int, sys.stdin.readline().split(" "))
    graph[a].append(b)
    graph[b].append(a)

for s in graph:
    s.sort()

def DFS(start):
    global seq
    ans[start] = seq
    for to_v in graph[start]:
        if(ans[to_v]):
            continue
        seq += 1
        DFS(to_v)

DFS(R)
for i in range(1, len(ans)):
    print(ans[i])