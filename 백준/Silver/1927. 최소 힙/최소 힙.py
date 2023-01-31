import heapq
import sys

N = int(sys.stdin.readline())

heap = []

for i in range(N):
    S = int(sys.stdin.readline())
    if(S == 0):
        if(len(heap) == 0):
            print(0)
        else:
            print(heap[0])
            heapq.heappop(heap)
    else:
        heapq.heappush(heap, S)