import sys

N = int(sys.stdin.readline()) # 계단의 개수

scores = [0]

for i in range(N):
    score = int(sys.stdin.readline())
    scores.append(score)

sums = [0 for i in range(len(scores))] # 최댓값 설정

if(N == 1):
    sums[1] = scores[1]
    print(sums[1])
elif(N == 2):
    sums[2] = scores[1] + scores[2]
    print(sums[2])
elif(N == 3):
    sums[3] = max(scores[1] + scores[3], scores[2] + scores[3])
    print(sums[3])
else:
    sums[1] = scores[1]
    sums[2] = scores[1] + scores[2]
    sums[3] = max(scores[1] + scores[3], scores[2] + scores[3])
    for i in range(4, N + 1):
        sums[i] = max(scores[i] + scores[i - 1] + sums[i - 3], scores[i] + sums[i - 2])
    print(sums[N])