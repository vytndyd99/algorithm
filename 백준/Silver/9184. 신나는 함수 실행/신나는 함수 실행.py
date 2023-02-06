import sys

arr = [[[0 for _ in range(21)] for _ in range(21)] for _ in range(21)]

def w(a, b, c):
    if(a <= 0 or b <= 0 or c <= 0): # 하나라도 0보다 작거나 같으면 1 리턴
        return 1
    if(a > 20 or b > 20 or c > 20): # 하나라도 20보다 크면 w(20,20,20) 리턴
        return w(20, 20, 20)
    if(arr[a][b][c]): # 배열 arr[a][b][c] 값이 존재(0은 False 나머지는 True)한다면 그값을 바로 리턴
        return arr[a][b][c]
    if(a < b and  b < c): # a < b < c이면 arr[a][b][c] 값을 집어넣고 반환하기
        arr[a][b][c] = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c)
        return arr[a][b][c]
    # 모든 조건을 만족하지 않을때 도달하는 곳
    arr[a][b][c] = w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1)
    return arr[a][b][c]


while(True):
    a, b, c = map(int, sys.stdin.readline().split(" "))
    if(a == -1 and b == -1 and c == -1):
        break
    print("w(" + str(a) + ", " + str(b) + ", " + str(c) + ") = " + str(w(a, b, c)))