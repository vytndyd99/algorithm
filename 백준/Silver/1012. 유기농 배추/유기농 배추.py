import sys
import collections
sys.setrecursionlimit(10 ** 6)

# 상하좌우 좌표를 위해 정의
dx = [0, 0, 1, -1] 
dy = [1, -1, 0, 0]

def BFS(n, m): # 매개변수 세로좌표, 가로좌표 값
    global count
    visited[n][m] = True # 방문여부 True로 변경
    q = collections.deque([(n, m)])
    while(q): # 덱안의 리스트 값이 존재할 동안 반복문 진행
        y, x = q.popleft()
        for s in range(4): # 상하좌우 반복 4번
            newN = y + dy[s] # 세로(y좌표)
            newM = x + dx[s] # 가로(x 좌표)
            # 좌표값이 범위를 벗어나지 않고, array값이 1이며 방문여부 False일때, 방문여부 True로 변경 후 q값에 그 좌표를 집어넣기
            if(newN >= 0 and newN < N and newM >= 0 and newM < M):
                if(array[newN][newM] == 1 and visited[newN][newM] == False):
                    visited[newN][newM] = True
                    q.append((newN,newM))

T = int(sys.stdin.readline())

for i in range(T): # T번만큼 반복
    M, N, K = map(int, sys.stdin.readline().split(" "))
    array = [[0 for i in range(M)] for i in range(N)]
    visited = [[False for i in range(M)] for i in range(N)]
    count = 0 # 흰지렁이 필요 개수
    for j in range(K):
        m, n = map(int, sys.stdin.readline().split(" "))
        array[n][m] = 1
    for n in range(N):
        for m in range(M):
            if(array[n][m] == 1 and visited[n][m] == False):
                BFS(n, m)
                count += 1 # BFS가 모두 진행되면 흰지렁이 개수 하나씩 증가
            visited[n][m] = True
    print(count)