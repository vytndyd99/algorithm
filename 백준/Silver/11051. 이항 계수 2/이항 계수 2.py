import sys
import math

def com(n, k):
    return math.factorial(n) // (math.factorial(n - k) * math.factorial(k))

N, K = map(int, sys.stdin.readline().split(" "))

print(com(N, K) % 10007)