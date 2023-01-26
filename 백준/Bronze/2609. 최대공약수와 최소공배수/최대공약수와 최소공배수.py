import sys

N1, N2 = map(int, sys.stdin.readline().split())

arr = N1, N2

if(N1 > N2):
    while(True):
        result = N1 % N2
        if(result == 0):
            max_num = N2
            break
        else:
            N1 = N2
            N2 = result
else:
    while(True):
        result = N2 % N1
        if(result == 0):
            max_num = N1
            break
        else:
            N2 = N1
            N1 = result

print(max_num) # 최대공약수
print(max_num * (arr[0] // max_num) * (arr[1] // max_num)) # 최소공배수