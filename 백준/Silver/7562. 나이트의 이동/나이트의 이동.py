import sys
import collections

dx = [1, 2, 2, 1, -1, -2, -2, -1]
dy = [2, 1, -1, -2, -2, -1, 1, 2]

def BFS(startDot):
    q = collections.deque([startDot])
    while q:
        y, x = q.popleft()
        if((y, x) == targetDot):
            break
        for s in range(8):
            newX = x + dx[s]
            newY = y + dy[s]
            if(newX >= 0 and newX < I and newY >= 0 and newY < I):
                if(arr[newY][newX] == 0):
                    arr[newY][newX] = arr[y][x] + 1
                    q.append((newY, newX))

T = int(sys.stdin.readline())

for i in range(T):
    I = int(sys.stdin.readline())
    arr = [[0 for i in range(I)] for i in range(I)]
    
    # 앞이 y축 뒤가 x축이라 생각
    currentDot = tuple(map(int, sys.stdin.readline().split(" ")))
    targetDot = tuple(map(int, sys.stdin.readline().split(" ")))
    BFS(currentDot)
    print(arr[targetDot[0]][targetDot[1]])