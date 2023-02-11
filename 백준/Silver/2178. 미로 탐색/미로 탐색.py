import sys
import collections
sys.setrecursionlimit(10 ** 6)

N, M = map(int, sys.stdin.readline().split(" "))

dx = [0, 1, 0, -1] # 여기부분 아래, 혹은 오른쪽 방향으로 우선순위하도록 맞추기
dy = [1, 0, -1, 0]

arr = [[0]]

for i in range(N):
    num1 = [0]
    num2 = list(map(int, sys.stdin.readline().rstrip()))
    arr.append(num1 + num2)
# 좌표가 1, 1부터 시작하기에 일부로 N, M이 0 0 인 자리를 생각하지 않도록 만드는 과정 진행

count = 0 # 최소의 칸수 

def BFS(y, x):
    q = collections.deque([(y, x)])
    while q:
        startY , startX = q.popleft()
        for s in range(4):
            newY = startY + dy[s]
            newX = startX + dx[s]
            if(newX > 0 and newX <= M  and newY > 0 and newY <= N):
                if(arr[newY][newX] == 1):
                    arr[newY][newX] = arr[startY][startX] + 1
                    q.append((newY,newX))

BFS(1, 1) # 좌표 1, 1부터 시작
print(arr[N][M])