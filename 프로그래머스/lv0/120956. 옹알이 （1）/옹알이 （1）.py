import re

def solution(babbling):
    answer = 0
    arr = []
    for i in range(len(babbling)):
        if("aya" in babbling[i]):
            babbling[i] = babbling[i].replace("aya", "?")
        if("ye" in babbling[i]):
            babbling[i] = babbling[i].replace("ye", "?")
        if("woo" in babbling[i]):
            babbling[i] = babbling[i].replace("woo", "?")
        if("ma" in babbling[i]):
            babbling[i] = babbling[i].replace("ma", "?")
        arr.append(babbling[i])
    for s in arr:
        s = set(s)
        if(len(s) == 1 and "?" in s):
            answer += 1
    return answer