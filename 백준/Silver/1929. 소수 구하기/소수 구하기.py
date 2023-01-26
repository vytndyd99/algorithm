import sys

M, N = map(int, sys.stdin.readline().split(" "))

def isPrime(num):
    if(num == 1):
        return False
    elif(num == 2 or num == 3):
        return True;
    else:
        for i in range(2 , int(num **(1/2)) + 1):
            if(num % i == 0):
                return False
    return True

for i in range(M, N + 1):
    if(isPrime(i)):
        print(i)
        