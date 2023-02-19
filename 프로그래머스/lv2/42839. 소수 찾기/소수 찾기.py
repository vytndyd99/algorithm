import itertools
import math

def isPrime(N):
    if(N == 0 or N == 1):
        return False
    for i in range(2, int(math.sqrt(N)) + 1):
        if(N % i == 0):
            return False
    return True

def solution(numbers):
    answer = 0
    dic = {}
    for i in range(1, len(numbers) + 1):
        for s in itertools.permutations(numbers, i):
            num = "".join(map(str, s))
            num = int(num)
            if(isPrime(num)): # 소수일때
                dic[num] = 1
    answer = len(dic)
    return answer