def solution(answers):
    answer = []
    fArr = [1,2,3,4,5] # 5
    sArr = [2,1,2,3,2,4,2,5] # 8
    tArr = [3,3,1,1,2,2,4,4,5,5] # 10
    counts = [0, 0, 0]
    
    for i in range(len(answers)):
        if(answers[i] == fArr[i % 5]):
            counts[0] += 1
        if(answers[i] == sArr[i % 8]):
            counts[1] += 1
        if(answers[i] == tArr[i % 10]):
            counts[2] += 1
    
    maxNum = max(counts)
    for i in range(len(counts)):
        if counts[i] == maxNum:
            answer.append(i + 1)
    
    return answer