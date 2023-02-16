import sys
import collections


# 3차원일때 상 하 좌우 좌표 총 6개 생성
dx = [1, 0, 0, -1, 0, 0]
dy = [0, 1, -1, 0, 0, 0]
dz = [0, 0, 0, 0, 1, -1]

M, N, H = map(int, sys.stdin.readline().split(" "))

arr = [] # 좌표들의 집합

# 3차원 좌표 만드는 과정
for i in range(H):
    array = []
    for j in range(N):
            nums = list(map(int, sys.stdin.readline().split(" ")))
            array.append(nums)
    array = [array]
    arr += array

startDot = [] # 시작 좌표 저장하기

for i in range(H):
    for j in range(N):
        for k in range(M):
            if(arr[i][j][k] == 1):
                startDot.append((i, j, k)) # 1인 좌표 z, y, x 저장하기

def BFS():
    q = collections.deque(startDot)
    while q:
        z, y, x = q.popleft()
        for s in range(6):
            newZ = z + dz[s]
            newY = y + dy[s]
            newX = x + dx[s]
            if(newZ >= 0 and newZ < H and newY >= 0 and newY < N and newX >= 0 and newX < M):
                if(arr[newZ][newY][newX] == 0):
                    arr[newZ][newY][newX] = arr[z][y][x] + 1
                    q.append((newZ, newY, newX))


BFS()

flag = True # 출력값 조정

day = 0

for i in range(H):
    for j in range(N):
        for k in range(M):
            if(arr[i][j][k] == 0): # 0 값이 하나라도 있으면 실패
                flag = False
            if(day < arr[i][j][k]):
                day = arr[i][j][k]

# BFS 함수 실행 후 0값이 하나라도 존재한다면 위에 식으로 인해 flag = False가 되며, 이는 모든 토마토가 익지 못한것 이기에 -1 출력
# 그렇지 않은 상황에서 만약 배열 값중 가장 큰 값이 1이라면 이미 모든 토마토가 처음부터 익은 상황이기에 0을 출력, 두 경우 모두 아니라면 가장 일수가 큰 값에서 1을 뺀 일수를 출력하기

if(flag):
    if(day == 1):
        print(0)
    else:
        print(day - 1) 
else:
    print(-1)