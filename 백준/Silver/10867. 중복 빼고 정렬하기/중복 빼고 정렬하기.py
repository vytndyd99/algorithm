import sys

N = int(sys.stdin.readline())

arr = list(map(int, sys.stdin.readline().split()))

newArr = [] # 새로운 정렬값 중복제거

for num in arr:
    if num not in newArr:
        newArr.append(num)

newArr.sort() # 정렬

for num in newArr:
    print(num, end=" ")