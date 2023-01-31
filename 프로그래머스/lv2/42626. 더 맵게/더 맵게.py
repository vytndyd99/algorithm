import heapq

def solution(scoville, K):
    answer = 0
    heapq.heapify(scoville)
    while(scoville[0] < K):
        if(len(scoville) == 1): # 스코빌 배열의 크기가 1이면 섞는것이 불가능
            return -1
        fNum = heapq.heappop(scoville)
        sNum = heapq.heappop(scoville)
        newNum = fNum + (sNum * 2)
        heapq.heappush(scoville, newNum)
        answer += 1
    return answer