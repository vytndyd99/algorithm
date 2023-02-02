import sys

A, B = map(int, sys.stdin.readline().split(" "))

aArr = list(map(int, sys.stdin.readline().split(" ")))

bArr = list(map(int, sys.stdin.readline().split(" ")))

abArr = list(set(aArr) ^ set(bArr))

print(len(abArr))