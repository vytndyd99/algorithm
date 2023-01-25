import sys

T = int(sys.stdin.readline()) # 테스트 케이스 개수 입력

for i in range(T):
    S = sys.stdin.readline().rstrip() # 문자열 받기
    sum = 0 # 괄호의 개수 합 선언
    for s in S: 
        if(s == "("): #여는괄호 나올시 합 +1
            sum += 1
        elif(s == ")"): # 닫는괄호가 나올시 합 -1
            sum -= 1
        if(sum < 0): # 만약 닫는괄호가 여는괄호보다 더 많이 나올경우 바로 NO
            print("NO")
            break
    #여기서는 sum 값이 음수인경우는 예외처리
    if(sum > 0): 
        print("NO")
    elif(sum == 0):
        print("YES")