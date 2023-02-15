import sys

N = int(sys.stdin.readline())

prices = [0]


arr = list(map(int, sys.stdin.readline().split(" "))) 

prices = prices + arr

dp = [0 for i in range(N + 1)] 

for i in range(1, N + 1):
    for j in range(1, i + 1):
        dp[i] = max(dp[i], dp[i - j] + prices[j])

print(dp[N])
