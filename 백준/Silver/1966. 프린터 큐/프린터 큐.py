import sys
import collections

test = int(sys.stdin.readline())

for i in range(test):
    N, M = map(int, sys.stdin.readline().split())
    priority = collections.deque(map(int, sys.stdin.readline().split()))
    chooseNum = M # 골라야하는 숫자의 번호를 저장
    count = 0 # 몇번째로 출력되는지 번호 저장
    while(len(priority) > 0):
        maxNum = max(priority) # 반복할때마다 우선순위가 제일 높은 값 저장
        if(priority[0] < maxNum): # 우선순위에서 밀린경우
            num = priority.popleft() # 맨왼쪽값빼기
            priority.append(num)
            if(chooseNum == 0): # 골라야하는 숫자의 번호가 0번이면 맨뒤로
                chooseNum = len(priority) - 1 
            else: # 아닌경우에는 자연스럽게 1빼기
                chooseNum -= 1
        elif(priority[0] == maxNum): # 우선순위인 경우
            priority.popleft() # 맨왼쪽 깂 제거 진행
            if(chooseNum == 0): # 이 값이 골라야하는 번호이면
                count += 1
                break # 반복문 탈출
            else:
                count += 1
                if(chooseNum == 0):
                    chooseNum = len(priority) - 1
                else:
                    chooseNum -= 1
    print(count)

    