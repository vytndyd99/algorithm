import sys

N, M = map(int, sys.stdin.readline().split(" "))

answerArr = {} # 정답의 문자열을 딕셔너리로 구현

for i in range(N):
    S = sys.stdin.readline().rstrip()
    answerArr[S] = i # "baekjoononlinejudge : 1 .... x : N - 1 까지 저장"

answerCount = 0 # 정답의 개수

# 예외처리를 하여 딕셔너리에 존재하지 않는 문자열일시 continue로 다음으로 반복문 실행
for i in range(M):
    S = sys.stdin.readline().rstrip()
    try:
        if(answerArr[S] < N):
            answerCount += 1
    except:
        continue

print(answerCount)
    
