def solution(clothes):
    answer = 1
    Dic = {}
    for s in clothes:
        if s[1] not in Dic:
            Dic[s[1]] = 1
        else:
            Dic[s[1]] += 1
    for key, value in Dic.items():
        answer *=  (value + 1)
    return (answer - 1)