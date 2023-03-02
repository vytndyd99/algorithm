import sys
import collections

dx = [0, 0, 1, -1]
dy = [1, -1, 0, 0]

height, width = map(int, sys.stdin.readline().split(" "))

visited = [[False for i in range(width)] for i in range(height)]

arr = []

for i in range(height):
    nums = list(map(int, sys.stdin.readline().split(" ")))
    arr.append(nums)

hour = 0

def TrueToFalse():
    for i in range(height):
        for j in range(width):
            visited[i][j] = False

def check_cheese():
    count = 0
    for i in range(height):
        for j in range(width):
            if(arr[i][j] == 1):
                count += 1
    return count

def BFS(y, x):
    global cheeseCount
    global hour
    while(cheeseCount > 0):
        hour_count.append((hour, cheeseCount))
        cheeses = []
        q = collections.deque([(y, x)])
        while q:
            y, x = q.popleft()
            visited[y][x] = True
            for i in range(4):
                newy = y + dy[i]
                newx = x + dx[i]
                if(newx >= 0 and newx < width and newy >= 0 and newy < height):
                    if(visited[newy][newx] == False and arr[newy][newx] == 0):
                        visited[newy][newx] = True
                        q.append((newy, newx))
                    if(arr[newy][newx] == 1 and visited[newy][newx] == False):
                        visited[newy][newx] = True
                        cheeses.append((newy, newx))
        cheeseCount = cheeseCount - len(cheeses)
        hour += 1
        y, x = 0, 0
        TrueToFalse()
        for s in cheeses:
            ansY, ansX = s
            arr[ansY][ansX] = 0
    
hour_count = [] # 시간대에 치즈의 개수를 담은 배열 생성

cheeseCount = check_cheese()

BFS(0, 0) # 0, 0 좌표부터 시작

print(hour_count[len(hour_count) - 1][0] + 1) # 시간
print(hour_count[len(hour_count) - 1][1]) # 끝나는 시간의 1시간전의 치즈조각 개수