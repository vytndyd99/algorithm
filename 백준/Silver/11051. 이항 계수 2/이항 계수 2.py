import sys
import math

N, K = map(int, sys.stdin.readline().split(" "))

num = math.factorial(N) // (math.factorial(K) * math.factorial(N - K)) % 10007

print(num)