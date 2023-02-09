import sys
sys.setrecursionlimit(10 ** 6) # 재귀 횟수 제한 풀기

N, M, R = map(int, sys.stdin.readline().split(" "))

graph = [[] for i in range(N + 1)] # 그래프 생성

ans = [0 for i in range(N + 1)] # 방문 순서 및 방문 여부 동시체크

seq = 1 # 방문 순서 

for i in range(M): # 간선
    a, b = map(int, sys.stdin.readline().split(" "))
    graph[a].append(b)
    graph[b].append(a)

for s in graph: # 그래프 안의 원소들을 내림차순으로 정렬
    s.sort(reverse=True)

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