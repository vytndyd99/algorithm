# Created on iPad.
import sys
import collections

dx = [0, 0, -1, 1]
dy = [1, -1, 0, 0]


R, C, T = map(int, sys.stdin.readline().split(" "))

arr = []

# 배열값 입력하는 부분
for j in range(R):
    nums = list(map(int, sys.stdin.readline().split(" ")))
    arr.append(nums)

second = 0 # 확산시간 정의

# 개념 : 방향을 싱히좌우로 변할 수 있도록 만들고, i + 1 번째 값을 temp에 저장하고, i + 1 에 i 값을 넣기
# 오 : 1 왼 : 2 상 : 3 하 : 4

#  반시계방향으로 도는함수 
def reverseTimeDir(dot):
    count = 0 # 도는 횟수
    global newArr, dust
    y, x = dot
    width = C # 가로길이
    height = y + 1 # 세로길이
    transY, transX = dot
    if(transX == C - 1):
        transY -= 1
        dir = 3
    else:
        transX += 1
        dir = 1
    temp = newArr[transY][transX]
    while(True):
        if(count == 2 * width + 2 * (height - 2) - 2):
            dust -= temp
            break

        # 모서리 부분 처리
        if(transX == C - 1 and transY == y): # 오른쪽에서 위쪽으로 방향바꾸는 구간
            dir = 3
        elif(transX == C - 1 and transY == 0): # 위쪽에서 왼쪽으로 방향을 바꾸는 구간
            dir = 2
        elif(transX == 0 and transY == 0): # 왼쪽에서 아래로 방향을 바꾸는 구간
            dir = 4
        elif(transX == 0 and transY == y): # 아래에서 오른쪽으로 방향을 바꾸는 구간
            dir = 1

        # 구간별 arr값 변경 진행
        if(dir == 1): # 오른쪽
            temp, newArr[transY][transX + 1] = newArr[transY][transX + 1], temp 
            transX += 1
            if(count == 0):
                newArr[transY][transX - 1] = 0
        elif(dir == 2): # 왼쪽
            temp, newArr[transY][transX - 1] = newArr[transY][transX - 1], temp
            transX -= 1
            if(count == 0):
                newArr[transY][transX + 1] = 0
        elif(dir == 3): # 상
            temp, newArr[transY - 1][transX] = newArr[transY - 1][transX], temp
            transY -= 1
            if(count == 0):
                newArr[transY + 1][transX] = 0
        elif(dir == 4): # 하
            temp, newArr[transY + 1][transX] = newArr[transY + 1][transX], temp
            transY += 1
            if(count == 0):
                newArr[transY - 1][transX] = 0
       
        # 실행횟수 카운트    
        count += 1

# 시계방향으로 도는 함수
def timeDir(dot):
    count = 0 # 도는 횟수
    global newArr, dust
    y, x = dot
    width = C # 가로길이
    height = R - y # 세로길이
    transY, transX = dot
    if(transX == R - 1):
        transY += 1
        dir = 4
    else:
        transX += 1
        dir = 1
    temp = newArr[transY][transX]
    while(True):
        if(count == 2 * width + 2 * (height - 2) - 2):
            dust -= temp
            break

        # 모서리 부분 처리
        if(transX == C - 1 and transY == y): # 오른쪽에서 아래로 방향바꾸는 구간 
            dir = 4
        elif(transX == C - 1 and transY == R - 1): # 아래에서 왼쪽으로 방향바꾸는 구간
            dir = 2
        elif(transX == 0 and transY == R - 1): # 왼쪽에서 위로 방향바꾸는 구간
            dir = 3
        elif(transX == 0 and transY == y): # 위에서 오른쪽으로 방향 바꾸는 구간
            dir = 1

        # 구간별 arr값 변경 진행
        if(dir == 1): # 오른쪽
            temp, newArr[transY][transX + 1] = newArr[transY][transX + 1], temp 
            transX += 1
            if(count == 0):
                newArr[transY][transX - 1] = 0
        elif(dir == 2): # 왼쪽
            temp, newArr[transY][transX - 1] = newArr[transY][transX - 1], temp
            transX -= 1
            if(count == 0):
                newArr[transY][transX + 1] = 0
        elif(dir == 3): # 상
            temp, newArr[transY - 1][transX] = newArr[transY - 1][transX], temp
            transY -= 1
            if(count == 0):
                newArr[transY + 1][transX] = 0
        elif(dir == 4): # 하
            temp, newArr[transY + 1][transX] = newArr[transY + 1][transX], temp
            transY += 1
            if(count == 0):
                newArr[transY - 1][transX] = 0
        
       
        # 실행횟수 카운트    
        count += 1
    
    
def BFS(dots):
    global newArr
    q = collections.deque(dots)
    while q:
        count = 0
        y, x, dust = q.popleft()
        for i in range(4):
            newX = x + dx[i]
            newY = y + dy[i]
            if(newX >= 0 and newX < C and newY >= 0 and newY < R and arr[newY][newX] != -1):
                newArr[newY][newX] += dust // 5
                count += 1
        newArr[y][x] = dust - (dust // 5 * count) + newArr[y][x]
    for s in airDot:
        y, x = s[0], s[1]
        newArr[y][x] = -1

    

    
airDot = [] # 콩기청정기의 위치

dust = 0 # 미세먼지의 양

# 첫 먼지양 체크하기 (시간복잡도 때문에 처음 한번만 실행하고, 이후로는 먼지가 정화되는 수를 체크하여 빼는 형식으로 계산할 예정)
for s in arr:
    for k in s:
        if(k > 0):
            dust += k

while(second < T):
    if(second == 0):
        dots = [] # 미세먼지가 들어있는 좌표의 모음
        for j in range(R):
            for i in range(C):
                if(arr[j][i] == -1):
                    airDot.append((j,i))
                # 배열의 값이 -1인경우는 공기청정기, 0인경우는 미세먼지가 없는 경우이기에
                elif(arr[j][i] > 0):
                    dots.append((j, i, arr[j][i]))
    else:
        dots = [] # 미세먼지가 들어있는 좌표의 모음
        for j in range(R):
            for i in range(C):
                # 배열의 값이 -1인경우는 공기청정기, 0인경우는 미세먼지가 없는 경우이기에
                if(arr[j][i] > 0):
                    dots.append((j, i, arr[j][i]))

    newArr = []
    # 새로운 배열 생성 0으로 초기화된
    for s in arr:
        nums = []
        for i in range(C):
            nums.append(0)
        newArr.append(nums)

    BFS(dots)

    # 공기청정기 작동 실행
    reverseTimeDir(airDot[0])
    timeDir(airDot[1])
    second += 1

    # 바뀐 배열값을 원래배열에 저장
    for i in range(R):
        for j in range(C):
            arr[i][j] = newArr[i][j]

print(dust)