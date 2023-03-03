import sys
import collections

dx = [0, 0, 1, -1]
dy = [1, -1, 0, 0]

H, W = map(int, sys.stdin.readline().split(" "))

heights = list(map(int, sys.stdin.readline().split(" ")))

visited = [[False for i in range(W)] for i in range(H)]

arr = []

for i in range(H):
    nums = []
    for j in range(W):
        # 높이를 기준으로 블록은 1로 빈공간은 0으로 설정
        if(i < H - heights[j]):
            nums.append(0)
        else:
            nums.append(1)
    arr.append(nums)

count = 0

# 양쪽 엣지위치는 물이 당연히 고일 수 없음
def edgeCheck(y, x):
    if(x == W - 1 or x == 0):
        return False


# 현재좌표에서 오른쪽으로 블록이 하나라도 있는지 확인
def rightCheck(y, x):
    if(edgeCheck(y, x)):
        return False
    x += 1
    while(x < W):
        if(arr[y][x] == 1):
            return True
        x += 1
        continue
    return False

# 현재좌표에서 왼쪽으로 블록이 하나라도 있는지 확인
def leftCheck(y, x):
    if(edgeCheck(y, x)):
        return False
    x -= 1
    while(x >= 0):
        if(arr[y][x] == 1):
            return True
        x -= 1
        continue
    return False

# 원리 : 현재좌표에서 0만을 탐색 (1인 블록은 탐색 x) 
# 1번 : 물이 고일 수 있는 0 -> 오른쪽체크, 왼쪽체크 함수를 이용하여 True가 나오면 이는 고일 수 있기에 카운트를 하나 더하고 방문처리 후 BFS 진행
# 2번 : 물이 고일 수 없는 0 -> 고일 수 없는 위치는 카운트처리하지않고 방문처리 후 BFS 진행
def BFS(y, x):
    global count
    # 매우중요!!! BFS 실행시 처음 좌표에 물이 고일 수 있는지 확인하는 함수 필수
    if(rightCheck(y, x) and leftCheck(y, x)):
        count += 1
    visited[y][x] = True
    q = collections.deque([(y, x)])
    while q:
        y, x = q.popleft()
        for i in range(4):
            newX = x + dx[i]
            newY = y + dy[i]
            if(newX >= 0 and newX < W and newY >= 0 and newY < H and arr[newY][newX] == 0 and visited[newY][newX] == False):
                visited[newY][newX] = True
                # 두가지로 나누기, 일반 0인지, 고일수 있는 0 인지
                if(rightCheck(newY, newX) and leftCheck(newY, newX)):
                    count += 1
                    q.append((newY, newX)) 
                else:
                    q.append((newY, newX))



# 모든 좌표에 BFS를 실행하여 벽이 일자로 막혀 두가지, 세가지, ... 로 나뉘어도 모두 실행할 수 있도록 실행
for i in range(H):
    for j in range(W):
        if(arr[i][j] == 0 and visited[i][j] == False):
            BFS(i, j)

print(count)