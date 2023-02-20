import sys
sys.setrecursionlimit(10 ** 9)

N = int(sys.stdin.readline())

visited = [0 for i in range(N + 1)]

Nodes = [[] for i in range(N + 1)]

def DFS(N):
    for s in Nodes[N]:
        if(visited[s] == 0):
            visited[s] = N
            DFS(s)

# 노드 2번 부터 N번까지 입력
for i in range(2, N + 1):
    Node1, Node2 = map(int, sys.stdin.readline().split(" "))
    Nodes[Node1].append(Node2)
    Nodes[Node2].append(Node1)

DFS(1)

for i in range(2, N + 1):
    print(visited[i])