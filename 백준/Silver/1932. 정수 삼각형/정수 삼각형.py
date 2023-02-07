import sys

# 각 길이의 값을 배열에 집어넣는 과정

N = int(sys.stdin.readline())

lenArr = [[0 for j in range(i + 1)] for i in range((N))]

for i in range(N):
    S = list(map(int, sys.stdin.readline().split(" ")))
    for j in range(len(lenArr[i])):
        lenArr[i][j] = S[j]

for i in range(1, N): # 첫번째줄(0번째 줄)은 선택할것이 없기에 넘기기
    for j in range(len(lenArr[i])):
        if(j == 0):
            # 여기서는 왼쪽 값만 더하는 경우
            lenArr[i][j] = lenArr[i - 1][j] + lenArr[i][j]
        elif(j == len(lenArr[i]) - 1):
            # 여기서는 오른쪽 끝값만 더하는 경우인데, i - 1 번째 길이는 i번째보다 인덱스가 하나 적기에 lenArr[i - 1][j - 1]을 이용
            lenArr[i][j] = lenArr[i - 1][j - 1] + lenArr[i][j]
        else:
            # 여기서는 왼쪽, 오른쪽 끝도 아닌경우이기에 i - 1 번째 줄의 값들중 양쪽 값들을 비교하여 큰 값을 더하는 규칙을 이용
            lenArr[i][j] = max(lenArr[i - 1][j - 1], lenArr[i - 1][j]) + lenArr[i][j]

print(max(lenArr[N - 1])) # 합계의 가장 큰 값을 출력