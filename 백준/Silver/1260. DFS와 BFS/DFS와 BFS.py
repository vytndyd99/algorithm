import sys
sys.setrecursionlimit(10 ** 6)
import collections

# 구현 방법 : DFS, BFS 모두 구현하고, 방문여부만 0 1로 구분한뒤, 방문했을 시 그 노드 값을 차례로 임의의 배열에 집어넣은 후 이를 차례대로 출력하는 방식 사용

# DFS와 BFS 모두 구현하기

N, M, V = map(int, sys.stdin.readline().split(" "))

# 그래프 선언
graph = [[] for i in range(N + 1)]

for i in range(M):
    a, b = map(int, sys.stdin.readline().split(" "))
    graph[a].append(b)
    graph[b].append(a)

for s in graph:
    s.sort()

# 방문여부와 순서는 BFS와 DFS에 따라 결과가 다르기에 한번씩 재정의
visited = [0 for i in range(N + 1)]
DFS_ans = [] # DFS 정답

# DFS 구현 함수
def DFS(start):
    DFS_ans.append(start)
    visited[start] = 1
    for s in graph[start]:
        if(visited[s]):
            continue
        DFS(s)
DFS(V)

# BFS 나오는 부분 이기에 재정의
visited = [0 for i in range(N + 1)]
BFS_ans = [] # BFS 정답
# BFS 구현 함수

def BFS(start):
    BFS_ans.append(start)
    visited[start] = 1
    q = collections.deque([start])
    while q:
        start = q.popleft()
        for s in graph[start]:
            if(visited[s] == 0):
                visited[s] = 1
                BFS_ans.append(s)
                q.append(s)

BFS(V)

# 정답 출력
print(" ".join(map(str, DFS_ans))) # DFS 정답
print(" ".join(map(str, BFS_ans))) # BFS 정답