import sys

N, K = map(int, sys.stdin.readline().split(" "))

arr = []

for i in range(1, N + 1):
    arr.append(i)

answer = [] # 요세푸스 수열이 들어갈 리스트 

i = K - 1

while(len(arr) > 0): # 요세푸스 수열 규칙
    i = i % len(arr)
    num = arr.pop(i)
    answer.append(num)
    i += (K - 1)

print("<", end="")
print(", ".join(map(str,answer)), end="")
print(">")