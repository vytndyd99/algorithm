import sys

N = int(sys.stdin.readline())

list_A = list(map(int, sys.stdin.readline().split()))

list_A.sort()

M = int(sys.stdin.readline())

list_B = list(map(int, sys.stdin.readline().split()))

for i in range(M):
    firstIdx = 0
    lastIdx = len(list_A) - 1
    while(firstIdx <= lastIdx):
        midIdx = (firstIdx + lastIdx) // 2
        if(list_B[i] == list_A[midIdx]):
            print(1)
            break
        elif(list_B[i] < list_A[midIdx]):
            lastIdx = midIdx - 1
        else:
            firstIdx = midIdx + 1
    if(firstIdx > lastIdx):
        print(0)