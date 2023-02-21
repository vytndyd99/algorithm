import sys

N = int(sys.stdin.readline())

checkNum = list(map(int, sys.stdin.readline().split(" ")))

M = int(sys.stdin.readline())

nums = list(map(int, sys.stdin.readline().split(" ")))

dic = {}

for s in checkNum:
    dic[s] = 1

for s in nums:
    try:
        print(dic[s], end =" ")
    except:
        print(0, end=" ")