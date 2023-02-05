import sys

def fib1(n):
    if(n == 1 or n == 2):
        return 1
    else:
        return fib1(n - 1) + fib1(n - 2)

def fib2(n, count):
    arr = [1, 1]
    for i in range(2, n):
        arr.append(arr[i - 1] + arr[i - 2])
        count += 1
    return count

N = int(sys.stdin.readline())

count = 0

print(fib1(N) , fib2(N, count))