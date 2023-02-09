import sys
import collections
sys.setrecursionlimit(10 ** 6)

# 접근방법 : BFS로 풀고, 노드를 방문할때마다 감염된 컴퓨터의 갯수 늘리기

com = int(sys.stdin.readline()) # 컴퓨터의 개수 (정점의 개수)
comLines = int(sys.stdin.readline()) # 컴퓨터와 연결되어 있는 선의 개수 (간선)
graph = [[] for i in range(com + 1)] # 그래프
visited = [0 for i in range(com + 1)] # 방문 여부 확인

for i in range(comLines): # 간선을 그래프에 추가
    a, b = map(int, sys.stdin.readline().split(" "))
    graph[a].append(b)
    graph[b].append(a)

def BFS(start):
    count = 0 # 감염된 컴퓨터의 개수
    d = collections.deque([start])
    visited[start] = 1 # 처음 방문한 1번노드는 방문여부 체크
    while d:
        start = d.popleft()
        for s in graph[start]: 
            if(visited[s] == 0):
                visited[s] = 1
                count += 1
                d.append(s)
    return count

print(BFS(1))