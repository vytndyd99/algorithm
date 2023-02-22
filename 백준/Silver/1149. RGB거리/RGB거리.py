import sys

N = int(sys.stdin.readline())

prices = []

for i in range(N):
    red, green, blue = map(int, sys.stdin.readline().split(" "))
    prices.append((red, green, blue))

sumPrices = [prices[0]]

for i in range(1, N):
    sum0 = min(sumPrices[i - 1][1], sumPrices[i - 1][2]) + prices[i][0]
    sum1 = min(sumPrices[i - 1][0], sumPrices[i - 1][2]) + prices[i][1]
    sum2 = min(sumPrices[i - 1][0], sumPrices[i - 1][1]) + prices[i][2]
    sumPrices.append((sum0, sum1, sum2))

print(min(sumPrices[N - 1]))
