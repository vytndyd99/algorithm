def solution(progresses, speeds):
    answer = []
    day = 0 # 처음 날짜
    finishNum = 0
    while(True):
        count = 0
        for i in range(len(progresses)):
            progresses[i] += speeds[i]
        day += 1
        for j in range(finishNum, len(progresses)):
            if(progresses[j] >= 100):
                finishNum += 1
                count += 1
            else:
                break 
        if(count > 0):
            answer.append(count)
        if(finishNum == len(progresses)):
            break
            
    return answer