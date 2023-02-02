import sys

K = int(sys.stdin.readline())

dots = [] # 방향 좌표 배열
width = [] # 가로길이 배열
height = [] # 세로길이 배열

smallArr = [] # 작은 사각형의 각 길이

# 1, 2, 3, 4 일때마다 방향을 다르게 하여 좌표를 더하기
for i in range(6):
    dir, dot = map(int, sys.stdin.readline().split(" "))
    dots.append((dir, dot))
    if(dir == 1 or dir == 2):
        width.append(dot)
    else:
        height.append(dot)

for i in range(6):
    if(dots[i][0] == dots[(i + 2) % 6][0]):
        smallArr.append(dots[(i + 1) % 6][1])

bigRec =  max(width) * max(height)

smallRec = smallArr[0] * smallArr[1] 

area = bigRec - smallRec

print(area * K)