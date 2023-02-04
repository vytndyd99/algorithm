import sys
import math

n, m = map(int,sys.stdin.readline().split(" "))

def five(n): # 숫자 n값에서 소수 5의 지수 값을 구하는 함수 정의
    count = 0
    while(n >= 5):
        count = count + (n // 5)
        n = n // 5
    return count

def two(n):  # 숫자 n값에서 소수 2의 지수 값을 구하는 함수 정의
    count = 0
    while(n >= 2):
        count = count + (n // 2)
        n = n // 2
    return count

# (n)! / ((n - m)! * m!)

# 2의 지수 값 구하기
twoNum = two(n) - two(n - m) - two(m)

# 5의 지수 값 구하기

fiveNum = five(n) - five(n - m) - five(m)

# 2, 5의 지수 값들중 작은 값을 answer에 넣고 출력
answer = min(twoNum, fiveNum)

print(answer)