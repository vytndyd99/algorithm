import sys
import collections


N = int(sys.stdin.readline())

deq = collections.deque()

for i in range(1, N + 1):
    deq.append(i)

while(len(deq) > 1): # 덱의 크기가 1보다 클때동안 반복
    deq.popleft()
    num = deq.popleft()
    deq.append(num)

# 모든 과정을 거치면 한개가 남으니 그 값이 정답
print(deq[0])