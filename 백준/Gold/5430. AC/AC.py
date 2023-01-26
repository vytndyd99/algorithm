import sys

T = int(sys.stdin.readline())

for i in range(T):
    ans = True # error의 여부
    flagReverse = 0 # 뒤집기 카운트
    p = sys.stdin.readline().rstrip()
    n = int(sys.stdin.readline())
    arr = sys.stdin.readline().rstrip()
    # 주어진 arr값을 정수형 배열로 변경하는 과정
    if(n == 0): # n값이 0이면 빈배열 선언
        arr = []
    else: 
        arr = arr.strip("[""]")
        arr = arr.split(",")
        for i in range(len(arr)):
            arr[i] = int(arr[i])
    for j in range(len(p)):
        if(p[j] == "D"): # D함수 해결과정
            if(len(arr) == 0): # 만약 배열길이가 0이면
                ans = False # ans 거짓을 반환
                break
            else:
                if(flagReverse % 2 == 0): # 리버스 실행횟수가 홀수이면 뒤에서부터, 짝수이면 앞에서부터 삭제
                    del arr[0]
                else:
                    del arr[len(arr) - 1]
        else:
            flagReverse += 1
    if(ans): # 리버스는 홀수번은 1번만, 짝수번은 실행 x 시간복잡도를 줄이기 위해
        if(flagReverse % 2 == 1):
            arr.reverse()
        if(len(arr) == 0):
            print("[]")
        elif(len(arr) == 1):
            print("[%d]" % arr[0])
        else:
            for i in range(len(arr)):
                if(i == 0):
                    print("[%d," % arr[i], end="")
                elif(i == len(arr) - 1):
                    print("%d]" % arr[i])
                else:
                    print("%d," % arr[i], end="")
    else:
        print("error")