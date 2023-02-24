import sys
import math

L = int(sys.stdin.readline())

s = sys.stdin.readline().rstrip()

sumNum = 0

for i in range(len(s)):
    sumNum += (ord(s[i]) - 96) * (int(math.pow(31, i)) % 1234567891)

print(sumNum)