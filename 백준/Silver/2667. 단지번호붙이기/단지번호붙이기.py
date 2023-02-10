import sys
sys.setrecursionlimit(10 ** 6)

N = int(sys.stdin.readline())

array = [list(map(int, sys.stdin.readline().rstrip())) for i in range(N)]

visited = [[False for i in range(N)] for i in range(N)]

count = 0

ans = []

# 4가지 양방향으로 추척하기 위한 좌표 설정
dx = [0, 1, 0, -1]
dy = [1, 0, -1, 0]

def DFS(j, i):
    global count
    count += 1
    visited[j][i] = True
    for s in range(4):
        newJ = j + dy[s]
        newI = i + dx[s]
        # 좌표가 리스트 범위를 벗어나면 실행 x
        if(newJ < 0 or newJ >= N or newI < 0 or newI >= N):
            continue
        # 설정한 좌표의 어레이 값이 1이고, 방문여부가 False이면 DFS함수 실행
        if(array[newJ][newI] == 1 and visited[newJ][newI] == False):
            DFS(newJ, newI)

for j in range(N):
    for i in range(N):
        count = 0
        if(array[j][i] == 1 and visited[j][i] == False):
            DFS(j,i)
            # 실행한 DFS 함수만큼 count 에 쌓여 정답에 추가
            ans.append(count)
        visited[j][i] = True

ans.sort()

print(len(ans))
for s in ans:
    print(s)