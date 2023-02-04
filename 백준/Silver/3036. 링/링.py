import sys
import math

N = int(sys.stdin.readline())


radius = list(map(int, sys.stdin.readline().split(" ")))

for i in range(1, N):
    gcdNum = math.gcd(radius[0], radius[i])
    print(str(radius[0] // gcdNum) + "/" + str(radius[i] // gcdNum))