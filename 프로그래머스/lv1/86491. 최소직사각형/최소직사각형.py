def solution(sizes):
    answer = 0
    widArr = []
    for s in sizes:
        maxNum = max(s)
        s.remove(maxNum)
        widArr.append(maxNum)
    width = max(widArr)
    height = max(sizes)[0]
    answer = width * height
    return answer