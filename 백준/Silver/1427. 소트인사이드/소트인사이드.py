import sys

N = list(map(int, sys.stdin.readline().rstrip()))

N.sort(reverse=True)

print(int("".join(map(str,N))))
