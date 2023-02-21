import sys
import math

N = int(sys.stdin.readline())

count = 0

factN = str(math.factorial(N))

idx = len(factN) - 1

while(True):
    if(factN[idx] == "0"):
        count += 1
        idx -= 1
        continue
    break

print(count)