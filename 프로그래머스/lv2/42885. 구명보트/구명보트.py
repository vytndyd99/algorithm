import collections

def solution(people, limit):
    answer = 0
    people.sort()
    q = collections.deque(people)
    while q:
        if(len(q) == 1):
            answer += 1
            break
        sumWeight = q[0] + q[len(q) - 1]
        if(sumWeight > limit):
            answer += 1
            q.pop()
        else:
            q.pop()
            q.popleft()
            answer += 1
    return answer