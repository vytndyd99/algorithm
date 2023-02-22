import sys
import collections

N, M = map(int, sys.stdin.readline().split(" "))

q = collections.deque([])

for i in range(1, N + 1):
    q.append(i)

idx = list(map(int, sys.stdin.readline().split(" ")))

count = 0

for s in idx:
    while(q.index(s) != 0):
        if(q.index(s) < len(q) // 2 + 1):
            num = q.popleft()
            q.append(num)
            count += 1
        else:
            num = q.pop()
            q.appendleft(num)
            count += 1
    q.popleft()

print(count)
