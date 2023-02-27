import itertools
import math

def solution(numbers):
    answer = []
    
    def check_isPrime(N):
        for i in range(2, int(math.sqrt(N)) + 1):
            if(N % i == 0):
                return False
        if(N == 0 or N == 1):
            return False
        return True
    
    nums = []
    for i in range(len(numbers)):
        num = int(numbers[i])
        nums.append(num)
    
    for i in range(1, len(nums) + 1): # 1개부터 numbers 원소의 개수만큼 선택
        for j in itertools.permutations(nums, i):
            num = int("".join(map(str, j)))
            if(check_isPrime(num)):
                answer.append(num)
    
    answer = len(set(answer))
     
    return answer