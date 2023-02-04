import sys

def fac(num):
    if(num == 1 or num == 0):
        return 1
    return num * fac(num - 1)

N, K = map(int, sys.stdin.readline().split(" "))

print(fac(N) // (fac(N - K) * fac(K)) )