import sys

stack = []

K = int(sys.stdin.readline()) # 정수 개수

for i in range(K):
    num = int(sys.stdin.readline())
    if(num == 0):
        stack.pop()
    else:
        stack.append(num)

print(sum(stack))