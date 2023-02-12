import sys
import collections
sys.setrecursionlimit(10 ** 6)

# 풀이 방법 : 배열 크기를 받으면, 그만큼 크기의 배열을 받는다. 배열의 값은 모두 1로 고정하여 생성 (1로 받아서 다음BFS 단계로 진행할때 그전값을 누적하여 더하는 방법 사용), 그 이후 visited 방문여부 배열을 생성, 그 이후 순차적으로 BFS 방법을 사용
# dx dy 는 8가지 방법을 사용(나이트의 이동방법이 8가지 이기 때문에)

dx = [1, 2, 2, 1, -1, -2, -2, -1]
dy = [2, 1, -1, -2, -2, -1, 1, 2]

T = int(sys.stdin.readline())

def BFS(y, x):
    visited[y][x] = True
    q = collections.deque([(y, x)])
    while q:
        starty , startx = q.popleft()
        for s in range(8):
            newX = startx + dx[s]
            newY = starty + dy[s]
            if(newX >= 0 and newX < I and newY >= 0 and newY < I):
                if(visited[newY][newX] == False):
                    visited[newY][newX] = True
                    q.append((newY, newX))
                    arr[newY][newX] = arr[starty][startx] + 1

for i in range(T): # T번만큼 반복 (테스트케이스)
    I  = int(sys.stdin.readline()) # 한변의 길이
    arr = [[1 for i in range(I)] for i in range(I)] # I * I 배열 생성
    visited = [[False for i in range(I)] for i in range(I)] # 방문여부 확인 배열 생성
    startDot = list(map(int, sys.stdin.readline().split(" ")))
    endDot = list(map(int, sys.stdin.readline().split(" ")))
    BFS(startDot[1], startDot[0]) # BFS 실행
    print(arr[endDot[1]][endDot[0]] - 1)