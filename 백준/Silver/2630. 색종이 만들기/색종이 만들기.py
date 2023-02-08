import sys

N = int(sys.stdin.readline())

arr = [[0 for i in range(N)] for i in range(N)] 

for i in range(N):
    arr[i] = list(map(int, sys.stdin.readline().split(" ")))

whiteP = 0
blueP = 0

def recue(widthDot, heightDot, N): # 가로의 시작점, 세로의 시작점, 사각형의 크기를 매개변수로 지정
    global blueP
    global whiteP
    sumNums = 0 # 배열안의 숫자들의 합
    if(N == 1): # 사각형의 크기가 1일때는 따로 빼서 고려
        if(arr[heightDot][widthDot] == 1):
            blueP += 1
        else:
            whiteP += 1
    else: # 사각형의 크기가 1이 아닌 모든 경우
        for i in range(N): # 배열의 모든 합 구하기
            sumNums += sum(arr[heightDot + i][widthDot : widthDot + N])
        if(sumNums == N * N): # 파란색 종이 조건
            blueP += 1
        elif(sumNums == 0): # 하얀색 종이 조건
            whiteP += 1
        else: # 조건 충족이 아닐때마다 4번씩 분할하여 함수실행
            recue(widthDot, heightDot, N // 2)
            recue(widthDot + N // 2, heightDot, N // 2)
            recue(widthDot, heightDot + N // 2, N // 2)
            recue(widthDot + N // 2, heightDot + N // 2, N // 2)

recue(0, 0, N)

print(whiteP)
print(blueP)