import sys
import heapq

def absHeap(heap, num): # 절댓값 힙 함수 정의
    if(num < 0): # 원소의 값이 음수일경우
        otherNum = -(num)
        heapq.heappush(heap,(otherNum, num))
    else: # 0 혹은 양수일경우
        heapq.heappush(heap, (num, num)) 

N = int(sys.stdin.readline())

h = [] # 힙 배열 생성

for i in range(N):
    x = int(sys.stdin.readline())
    if(x == 0): # x가 0일때
        if(len(h) == 0): # 힙의 크기가 0이면
            print(0)
        else:
            print(heapq.heappop(h)[1])
    else:
        absHeap(h, x)