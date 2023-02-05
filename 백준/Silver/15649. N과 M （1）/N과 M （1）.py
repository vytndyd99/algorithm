import sys

N, M = map(int, sys.stdin.readline().split(" "))

arr = [False for i in range(0, N + 1)] # 탐색여부 배열 생성

answers = [] # 정답 배열 생성

def back(arr, depth):
    if(depth == M): # 만약 깊이가 원하는 목표인 M까지 갔을경우 출력
        print(" ".join(map(str, answers)))
        return  # 이후 다시 되돌아가기
    for i in range(1, N + 1):
        if(arr[i] != True):
            answers.append(i)
            arr[i] = True
            back(arr, depth + 1) # 깊이 1 증가 
            answers.pop() # 여기서는 이미 출력을 하나 했기에 하나를 빼기
            arr[i] = False # 뺀 값은 방문값을 False로 다시지정

back(arr, 0)