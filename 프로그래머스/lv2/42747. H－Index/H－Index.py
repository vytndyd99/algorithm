def solution(citations):
    arr = sorted(citations,reverse=True)
    for i in range(len(arr)):
        if i>=arr[i]:
            return i
    return len(arr)