import sys
import collections

dx = [0, 0, 1, -1]
dy = [1, -1, 0, 0]

T = int(sys.stdin.readline())

def BFS(heightDot, widthDot):
    visited[heightDot][widthDot] = True
    q = collections.deque([(heightDot, widthDot)])
    while q:
        y, x = q.popleft()
        for i in range(4):
            newX = x + dx[i]
            newY = y + dy[i]
            if(newX >= 0 and newX < M and newY >= 0 and newY < N):
                if(arr[newY][newX] == 1 and visited[newY][newX] == False):
                    visited[newY][newX] = True
                    q.append((newY, newX))



for i in range(T):
    M, N, K = map(int, sys.stdin.readline().split(" "))
    arr = [[0 for i in range(M)] for j in range(N)]

    for i in range(K):
        x, y = map(int, sys.stdin.readline().split(" "))
        arr[y][x] = 1

    visited = [[False for i in range(M)] for i in range(N)]
    count = 0 # 흰지렁이 개수

    for i in range(N):
        for j in range(M):
            if(arr[i][j] == 1 and visited[i][j] == False):
                BFS(i, j)
                count += 1
    print(count)
