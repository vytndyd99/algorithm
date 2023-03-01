# Created on iPad.
# N 은 세로 최대, M은 가로 최대
# (y, x) 로 생각
import sys

N, M = map(int, sys.stdin.readline().split(" "))

arr = []

robot = list(map(int, sys.stdin.readline().split(" ")))

for i in range(N):
    nums = list(map(int, sys.stdin.readline().split(" ")))
    arr.append(nums)

# 청소한 칸은 -1 로 지정

def fun(y, x, dir):
    global count
    if(arr[y][x] == 0):
        arr[y][x] = -1
        count += 1
    if(right_left_up_down_check(y, x)):
        dir -= 1 
        if(dir < 0):
            dir += 4
        if(dir == 0): # 북쪽 체크
            if(arr[y - 1][x] == 0):
                y -= 1
                fun(y, x, dir)
            else:
                fun(y, x, dir)
        elif(dir == 1):  # 동쪽 체크
            if(arr[y][x + 1] == 0):
                x += 1
                fun(y, x, dir)
            else:
                fun(y, x, dir)
        elif(dir == 2): # 남쪽 체크
            if(arr[y + 1][x] == 0):
                y += 1
                fun(y, x, dir)
            else:
                fun(y, x, dir)
        elif(dir == 3): # 서쪽 체크
            if(arr[y][x - 1] == 0):
                x -= 1
                fun(y, x, dir)
            else:
                fun(y, x, dir)
    else:
        if(dir == 0): # 북쪽인경우
            if(arr[y + 1][x] != 1):
                y += 1
                fun(y, x, dir)
        elif(dir == 1): # 동쪽인경우
            if(arr[y][x - 1] != 1):
                x -= 1
                fun(y, x, dir)
        elif(dir == 2): # 남쪽인경우
            if(arr[y - 1][x] != 1):
                y -= 1
                fun(y, x, dir)
        elif(dir == 3): # 서쪽인경우
            if(arr[y][x + 1] != 1):
                x += 1
                fun(y, x, dir)
    
def right_left_up_down_check(y, x):
    # 청소를 진행하지 못하는 경우
    if((arr[y][x - 1] == -1 or arr[y][x - 1] == 1) and (arr[y][x + 1] == -1 or arr[y][x + 1] == 1) and (arr[y + 1][x] == -1 or arr[y + 1][x] == 1) and (arr[y - 1][x] == -1 or arr[y - 1][x] == 1)):
        return False
    else: # 청소를 진행할 수 있는 경우
        return True


count = 0 # 청소한 칸의 개수

y, x, dir = robot

fun(y, x, dir) # 함수 실행

print(count)