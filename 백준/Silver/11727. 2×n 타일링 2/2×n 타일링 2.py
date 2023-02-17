import sys

n = int(sys.stdin.readline())

dp = [0 for i in range(1001)]

dp[1] = 1
dp[2] = 3
dp[3] = 5

if(n == 1):
    print(dp[1])
elif(n == 2):
    print(dp[2])
elif(n == 3):
    print(dp[3])
else:
    for i in range(4, n + 1):
        dp[i] = dp[i - 1] + 2 * dp[i - 2]
    print(dp[n] % 10007)