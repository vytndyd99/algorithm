import sys

N = int(sys.stdin.readline())

Nnums = list(map(int, sys.stdin.readline().split(" ")))

M = int(sys.stdin.readline())

Mnums = list(map(int, sys.stdin.readline().split(" ")))

Nnums.sort()

def binaryFind(arr, findNum):
    startIdx = 0
    endIdx = len(arr) - 1
    while(startIdx <= endIdx):
        midIdx = (startIdx + endIdx) // 2
        if(arr[midIdx] == findNum):
            return 1
        if(findNum < arr[midIdx]):
            endIdx = midIdx - 1
        elif(findNum > arr[midIdx]):
            startIdx = midIdx + 1
    return 0


for s in Mnums:
    print(binaryFind(Nnums, s))