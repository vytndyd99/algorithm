import sys
import heapq

heap = []

def absHeap(heap, num):
    if(num >= 0):
        heapq.heappush(heap, (num, num))
    else:
        heapq.heappush(heap, (-num, num))

N = int(sys.stdin.readline())

for i in range(N):
    func = int(sys.stdin.readline())
    if(func == 0):
        if(len(heap) == 0):
            print(0)
        else:
            print(heapq.heappop(heap)[1])
    else:
        absHeap(heap, func)
