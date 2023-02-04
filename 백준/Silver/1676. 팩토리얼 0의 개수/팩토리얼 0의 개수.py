import sys
import math

N = int(sys.stdin.readline())

facNum = math.factorial(N)

count = 0 # 0의 개수

for i in range(len(str(facNum)) - 1, -1, -1):
    if(str(facNum)[i] == "0"):
        count += 1
    else:
        break

print(count)