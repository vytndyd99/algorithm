import sys

N = int(sys.stdin.readline())

arr = [] # 키, 몸무게 배열

for i in range(N):
    weight, height = map(int, sys.stdin.readline().split(" ")) 
    arr.append((weight, height))

answer = [] # 정답 리스트

for i in range(N):
    rank = 1 # 순위
    for j in range(N):        
        if(arr[i][0] < arr[j][0] and arr[i][1] < arr[j][1]):
            rank += 1
    answer.append(rank)

for s in answer:
    print(s, end=" ")