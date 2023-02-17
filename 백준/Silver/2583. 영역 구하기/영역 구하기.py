import sys
import collections

M, N, K = map(int, sys.stdin.readline().split(" "))

arr = [[0 for i in range(N)] for i in range(M)] # 배열의 크기

visited = [[False for i in range(N)] for i in range(M)] # 방문 여부

dx = [0, 0, 1, -1]
dy = [1, -1, 0, 0]

ans = [] # 각 영역의 넓이

def BFS(startDot):
    q = collections.deque([startDot])
    area = 1 # 넓이
    while q:
        y, x = q.popleft()
        visited[y][x] = True
        for s in range(4):
            newX = x + dx[s]
            newY = y + dy[s]
            if(newX >= 0 and newX < N and newY >= 0 and newY < M):
                if(visited[newY][newX] == False and arr[newY][newX] == 0):
                    visited[newY][newX] = True
                    area += 1
                    q.append((newY, newX))
    ans.append(area) # 넓이값 추가

for i in range(K):
    dot = list(map(int, sys.stdin.readline().split(" ")))
    for m in range(dot[1], dot[3]):
        for n in range(dot[0], dot[2]):
            arr[m][n] = 1


for m in range(M):
    for n in range(N):
        if(visited[m][n] == False and arr[m][n] == 0):
            BFS((m, n))

print(len(ans))

ans.sort()

print(" ".join(map(str, ans)))