import sys
import collections

N = int(sys.stdin.readline())

lines = int(sys.stdin.readline())

graph = [[] for i in range(N + 1)]

visited = [False for i in range(N + 1)]

for i in range(lines):
    a, b = map(int, sys.stdin.readline().split(" "))
    graph[a].append(b)
    graph[b].append(a)

count = 0 # 바이러스에 걸린 컴퓨터수

def BFS(start):
    global count
    count += 1
    visited[start] = True
    q = collections.deque([start])
    while q:
        dot = q.popleft()
        for s in graph[dot]:
            if(visited[s] == False):
                visited[s] = True
                count += 1
                q.append(s)


BFS(1)

print(count - 1)