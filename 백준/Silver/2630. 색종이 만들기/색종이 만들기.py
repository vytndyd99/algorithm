import sys

N = int(sys.stdin.readline())

arr = []

for i in range(N):
    nums = list(map(int, sys.stdin.readline().split(" ")))
    arr.append(nums)

white = 0
blue = 0

def recue(widthDot, heightDot, size):
    global white
    global blue
    sumNum = 0 # 합계확인
    if(size == 1):
        if(arr[heightDot][widthDot] == 1):
            blue += 1
        else:
            white += 1
    else:
        for i in range(size):
            sumNum += sum(arr[heightDot + i][widthDot : widthDot + size])
        if(sumNum == size * size):
            blue += 1
        elif(sumNum == 0):
            white += 1
        else:
            recue(widthDot, heightDot, size // 2)
            recue(widthDot + size // 2, heightDot, size // 2)
            recue(widthDot, heightDot + size // 2, size // 2)
            recue(widthDot + size // 2, heightDot + size // 2, size // 2)

recue(0, 0, N)

print(white)
print(blue)