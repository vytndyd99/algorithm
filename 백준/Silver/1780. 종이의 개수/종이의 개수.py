import sys

N = int(sys.stdin.readline())

arr = []

for i in range(N):
    nums = list(map(int, sys.stdin.readline().split(" ")))
    arr.append(nums)

minus1 = 0 # -1로만 이루어져 있는 종이의 개수
zero = 0 # 0으로만 이루어져 있는 종이의 개수
one = 0 # 1으로만 이루어져 있는 종이의 개수

def recue(widthDot, heightDot, N):
    global minus1
    global zero
    global one
    nums = [] # 숫자들의 집합
    sumNum = 0 # 함수실행시 마다 합계를 세기위한 변수를 0으로 초기화
    if(N == 1): # 크기가 1인경우
        if(arr[heightDot][widthDot] == -1):
            minus1 += 1
        elif(arr[heightDot][widthDot] == 0):
            zero += 1
        else:
            one += 1
    else: # 크기가 1이 아닌 모든 경우일때
        for i in range(N): # 합계 구하기
            sumNum += sum(arr[heightDot + i][widthDot : widthDot + N])
            nums += arr[heightDot + i][widthDot : widthDot + N]
        arrnum = len(set(nums)) # 원소의 갯수 (겹치는거 없이)
        if(sumNum == N * N): # 이 경우는 모든 값이 1로 채워진경우
            one += 1
        elif(sumNum == N * N * (-1)): # 이 경우는 모든 값이 -1로 채워진 경우
            minus1 += 1
        else: # 모든 원소의 합이 N * N 도 아니고 N * N * -1 도 아닌경우
            if(arrnum == 1): # 원소가 0으로만 이루어져 있는 경우
                zero += 1
            else: # 위의 3가지 경우 모두 아닌경우 분할 정복 함수 실행 (총 9번)
                recue(widthDot, heightDot, N // 3)
                recue(widthDot + (N // 3), heightDot, N // 3)
                recue(widthDot + (2 * N // 3), heightDot, N // 3)
                recue(widthDot, heightDot + (N // 3), N // 3)
                recue(widthDot + (N // 3), heightDot + (N // 3), N // 3)
                recue(widthDot + (2 * N // 3), heightDot + (N // 3), N // 3)
                recue(widthDot, heightDot + (2 * N // 3), N // 3)
                recue(widthDot + (N // 3), heightDot + (2 * N // 3), N // 3)
                recue(widthDot + (2 * N // 3), heightDot + (2 * N // 3), N // 3)


recue(0, 0, N) # 함수실행

print(minus1)
print(zero)
print(one)