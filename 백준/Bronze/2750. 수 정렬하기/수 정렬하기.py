import sys

N = int(sys.stdin.readline())

Numbers = []

for i in range(N):
    Number = int(sys.stdin.readline())
    Numbers.append(Number)

Numbers.sort()

for i in range(len(Numbers)):
    print(Numbers[i])