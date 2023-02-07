import sys

N = int(sys.stdin.readline())

sumPrices = [[0 for i in range(N)] for i in range(N)] # 가격의 합계를 나타내는 배열

for i in range(N):
    colors = list(map(int, sys.stdin.readline().split(" ")))
    sumPrices[i][0] = colors[0]
    sumPrices[i][1] = colors[1]
    sumPrices[i][2] = colors[2]

for i in range(1, N):
    sumPrices[i][0] = sumPrices[i][0] + min(sumPrices[i - 1][1], sumPrices[i - 1][2])
    sumPrices[i][1] = sumPrices[i][1] + min(sumPrices[i - 1][0], sumPrices[i - 1][2])
    sumPrices[i][2] = sumPrices[i][2] + min(sumPrices[i - 1][0], sumPrices[i - 1][1])

print(min(sumPrices[N - 1][0], sumPrices[N - 1][1], sumPrices[N - 1][2]))