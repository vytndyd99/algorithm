import sys
import collections

N, K = map(int, sys.stdin.readline().split(" "))

arr = [0 for i in range(100001)]

def BFS(start):
    q = collections.deque([start])
    while q:
        Dot = q.popleft()
        if(Dot == K):
            break
        for s in (Dot - 1, Dot + 1, 2 * Dot):
            if(s >= 0 and s < 100001):
                if(arr[s] == 0):
                    arr[s] = arr[Dot] + 1
                    q.append(s)

BFS(N)

print(arr[K])