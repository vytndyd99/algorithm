import sys

T = int(sys.stdin.readline())

for i in range(T):
    arr = list(map(int,sys.stdin.readline().split(" ")))
    arr.sort()
    A = arr[1]
    B = arr[0]
    while(True):
        result = A % B
        if(result == 0):
            break
        A = B
        B = result
    print((arr[1] // B) * (arr[0] // B) * B)