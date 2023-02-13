import sys
sys.setrecursionlimit(10 ** 6)

def solution(numbers, target):
    answer = 0
    sumNum = -numbers[0] 
    
    def DFS(deep, sumNum):
        nonlocal answer
        if(deep == len(numbers)):
            if(sumNum == target):
                answer += 1
            return
        DFS(deep + 1, sumNum + numbers[deep])
        DFS(deep + 1, sumNum - numbers[deep])
    
    DFS(1, sumNum)
    sumNum = numbers[0]
    DFS(1, sumNum)
    return answer