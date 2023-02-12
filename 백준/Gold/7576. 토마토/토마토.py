import sys
import collections

dx = [0, 0, -1, 1]
dy = [1, -1, 0, 0]

M, N = map(int, sys.stdin.readline().split(" "))

array = []

for i in range(N):
    arr = list(map(int, sys.stdin.readline().split(" ")))
    array.append(arr)

def BFS(start):
    q = collections.deque(start)
    while q:
        y, x = q.popleft()
        for s in range(4):
            newX = x + dx[s]
            newY = y + dy[s]
            if(newX >= 0 and newX < M and newY >= 0 and newY < N):
                if(array[newY][newX] == 0):
                    array[newY][newX] = array[y][x] + 1
                    q.append((newY, newX))
        


startDot = []
for j in range(N):
    for i in range(M):
        if(array[j][i] == 1):
            startDot.append((j, i)) # 1인 좌표값 (y, x) 좌표 추가

BFS(startDot)

flag = True # 출력여부 값 조정

maxNum = 0
for j in range(N):
    for i in range(M):
        if(array[j][i] == 0): # 만약 0 값이 하나라도 있을떼!
            flag = False # flag 값을 false로 지정
        if(maxNum < array[j][i]):
            maxNum = array[j][i]

# BFS 함수를 실행하고나서 0값이 하나라도 존재하면, 이는 모든 배추가 익지 못한것이기에 -1 출력
# 그렇지 않을때 상황에서 만약 배열값중에 가장 큰 값이 1이라면 이미 모든 배추가 익은 상황이기에 0을 출력, 모든 경우가 아닐때는 가장 큰값에서 1을 뺀 일수를 출력!
if(flag):
    if(maxNum == 1): # 
        print(0)
    else:
        print(maxNum - 1)
else:
    print(-1)