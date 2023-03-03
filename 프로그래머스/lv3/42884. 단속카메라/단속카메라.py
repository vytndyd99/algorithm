def solution(routes):
    answer = 1
    routes.sort(key = lambda x : x[0])
    startN = routes[0][0]
    endN = routes[0][1]
    for i in range(1, len(routes)):
        if(routes[i][0] >= startN and routes[i][0] <= endN):
            startN = routes[i][0]
            endN = min(routes[i][1], endN)
            continue
        else:
            answer += 1
            startN = routes[i][0]
            endN = routes[i][1]
    return answer