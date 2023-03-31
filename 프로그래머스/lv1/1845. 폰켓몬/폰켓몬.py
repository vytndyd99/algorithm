def solution(nums):
    answer = 0
    numsLen = len(nums)
    newNums = set(nums)
    if(len(newNums) < numsLen):
        if(len(newNums) >= (numsLen // 2)):
            answer = numsLen // 2
        else:
            answer = len(newNums)
    else:
        answer = numsLen // 2
    return answer

# 연습용