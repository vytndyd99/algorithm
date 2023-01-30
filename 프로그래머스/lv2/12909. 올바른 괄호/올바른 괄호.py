def solution(s):
    answer = True
    sum = 0
    for i in range(len(s)):
        if(sum <= 0):
            if(s[i] == ")"):
                return False
        if(s[i] == "("):
            sum += 1
        else:
            sum -= 1
    if(sum == 0):
        return True
    else:
        return False
    return answer