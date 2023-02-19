import itertools

def solution(numbers):
    answer = 0
    numbers = list(map(str, numbers)) # 문자형으로 모두 바꿔버리기
    numbers.sort(reverse = True, key = lambda x : x * 3)
    answer = "".join(map(str, numbers))
    answer = int(answer)
    answer = str(answer)
        
    return answer