import sys
import collections

N, K = map(int, sys.stdin.readline().split(" "))

answers= [0 for i in range(100001)]

def BFS(N):
    q = collections.deque([N])
    while(q):
        dot = q.popleft()
        if(dot == K):
            break
        for i in (dot - 1, dot + 1, dot * 2):
            if(i >= 0 and i <= 100000 and answers[i] == 0):
                answers[i] = answers[dot] + 1
                q.append(i)


BFS(N)
print(answers[K])