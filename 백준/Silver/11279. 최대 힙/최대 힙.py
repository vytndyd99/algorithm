import sys
import heapq

def maxHeap(heap, num): # 최대힙 넣기
    heapq.heappush(heap, (-num, num))
    return heap

N = int(sys.stdin.readline())

h = []

for i in range(N): # N번만큼 반복
    x = int(sys.stdin.readline())
    if(x == 0): # x가 0일때
        if(len(h) == 0): # 힙의 크기가 0일때
            print(0)
        else: # 최대 힙의 최댓값 출력하기
            print(heapq.heappop(h)[1]) 
    else: # x가 0이 아닐때
        maxHeap(h, x) # 원소 최대힙으로 넣기