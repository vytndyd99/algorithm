import sys
import collections

N, M = map(int, sys.stdin.readline().split(" "))

indexArr = list(map(int, sys.stdin.readline().split(" ")))

Arr = collections.deque([i for i in range(1, N + 1)]) # 1 ~ N까지의 배열을 덱으로 지정

count = 0 # 2, 3 함수 실행 카운트

for s in indexArr: # 찾아야 하는 값들을 모두 확인
    while(True):
        if(s == Arr[0]): 
            Arr.popleft()
            break
        else:
            if(Arr.index(s) <= (len(Arr) // 2)):
                num = Arr.popleft()
                Arr.append(num)
                count += 1
            else:
                num = Arr.pop()
                Arr.appendleft(num)
                count += 1

print(count)