def solution(operations):
    answer = []
    heap = []
    for s in operations:
        if("I" in s): #insert 포함시
            nums = int(s.split(" ")[1])
            heap.append(nums)
        elif(s == "D -1"): # 최솟값 삭제
            if(len(heap) == 0):
                continue
            else:
                minNum = min(heap)
                heap.remove(minNum)
        else: # 최댓값 삭제
            if(len(heap) == 0):
                continue
            else:
                maxNum = max(heap)
                heap.remove(maxNum)
    if(len(heap) == 0):
        answer = [0, 0]
        return answer
    else:
        answer.append(max(heap))
        answer.append(min(heap))
    return answer