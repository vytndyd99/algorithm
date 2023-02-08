import sys

N = int(sys.stdin.readline())

arr = []

for i in range(N):
    nums = list(map(int, sys.stdin.readline().rstrip())) 
    arr.append(nums)

answer = "" # 정답


def recue(widthDot, hegithDot, N): # 매개변수를 가로시작점, 세로시작점, 크기 로 결정
    global answer
    sumNum = 0 # 합계를 항상 0으로 초기화
    if(N == 1): # 크기가 1일때 조건
        if(arr[hegithDot][widthDot] == 1):
            answer += "1"
        elif(arr[hegithDot][widthDot] == 0):
            answer += "0"
    else: # 크기가 1이아닌 나머지 조건일때
        for i in range(N): # 모든 리스트의 값들의 합
            sumNum += sum(arr[hegithDot + i][widthDot : widthDot + N])
        if(sumNum == N * N): # 배열 원소값이 모두 1인경우
            answer += "1" 
        elif(sumNum == 0): # 배열 원소값이 모두 0인경우
            answer += "0"
        else: # 1과 0이 섞인경우에는 분할정복 함수 실행
            answer += "("
            recue(widthDot, hegithDot, N // 2) # 왼쪽 위 
            recue(widthDot + N // 2, hegithDot, N // 2) #오른쪽 위
            recue(widthDot, hegithDot + N // 2, N // 2) # 왼쪽 아래
            recue(widthDot + N // 2, hegithDot + N // 2, N // 2) # 오른쪽 아래
            answer += ")"

recue(0,0,N) # 분할 정복 함수 실행 (처음시작좌표 + 크기)

print(answer)