def solution(prices):
    answer = []
    for i in range(len(prices)):
        seconds = 0
        if(i == len(prices) - 1):
            answer.append(seconds)
        else:
            for j in range(i + 1, len(prices)):
                if(prices[j] >= prices[i]):
                    seconds += 1
                else:
                    answer.append(seconds + 1)
                    break
            if(len(answer) != i + 1):
                answer.append(seconds)
    return answer