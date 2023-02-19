import itertools

def solution(brown, yellow):
    answer = []
    abSum = (brown - 4) // 2
    abMul = yellow
    arr = []
    for i in range(1, abSum):
        if(i * (abSum - i) == abMul):
            arr.append((i, abSum - i))
    arr.sort(key = lambda x : -x[0])
    a = arr[0][0] + 2
    b = arr[0][1] + 2
    answer.append(a)
    answer.append(b)
    return answer