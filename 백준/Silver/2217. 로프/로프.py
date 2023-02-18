import sys

N = int(sys.stdin.readline())

maxWeights = []

for i in range(N):
    weight = int(sys.stdin.readline())
    maxWeights.append(weight)

maxWeight = 0 # 최대 중량 설정
maxWeights.sort(reverse=True)

for i in range(N):
    if(maxWeight < maxWeights[i] * (i + 1)):
        maxWeight = maxWeights[i] * (i + 1)

print(maxWeight)