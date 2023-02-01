import sys

N = int(sys.stdin.readline())

xArr = list(map(int, sys.stdin.readline().split(" ")))

newArr = set(xArr) # 중복 제거
newArr = list(newArr)

newArr.sort() # 정렬

xArrdic = {} # 딕셔너리 추가

for i in range(len(newArr)):
    xArrdic[newArr[i]] = i

for s in xArr:
    print(xArrdic[s], end=" ")