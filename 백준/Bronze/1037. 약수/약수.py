import sys

N = int(sys.stdin.readline())

arr = list(map(int, sys.stdin.readline().split(" ")))
arr.sort()

if(len(arr) % 2 == 0): # 짝수개일때
    print(arr[len(arr) // 2 - 1] * arr[len(arr) // 2])
else: # 홀수개일때
    print(arr[len(arr) // 2] * arr[len(arr) // 2])