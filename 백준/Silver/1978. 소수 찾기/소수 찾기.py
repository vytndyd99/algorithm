import sys

N = int(sys.stdin.readline())

arr = list(map(int, sys.stdin.readline().split()))

count = 0 # 소수의 개수

for i in range(N):
    if(arr[i] == 1):
        continue
    elif(arr[i] == 2 or arr[i] == 3):
        count+= 1
    else:
        divCount = 0
        for j in range(1,(arr[i] // 2 + 1) + 1):
            if(arr[i] % j == 0):
                divCount += 1
        if(divCount == 1):
            count += 1;

print(count)