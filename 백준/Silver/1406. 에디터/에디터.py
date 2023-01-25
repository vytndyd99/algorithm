import sys

S = sys.stdin.readline().rstrip() # 첫번째 문자열 입력

M = int(sys.stdin.readline()) # 입력할 명령어 개수

arr = [] # 초기문자

newArr = [] # 합칠 문자열

for i in range(len(S)): # 초기 문자열 배열에 입력
    arr.append(S[i])

for i in range(M):
    str = sys.stdin.readline().rstrip()
    if(str == "L"):
        if(len(arr) == 0):
            continue
        else:
            newArr.append(arr.pop())
    elif(str == "D"):
        if(len(newArr) == 0):
            continue
        else:
            arr.append(newArr[len(newArr) - 1])
            del newArr[len(newArr) - 1]
    elif(str == "B"):
        if(len(arr) == 0):
            continue
        else:
            del arr[len(arr) - 1]
    else:
        arr.append(str.split(" ")[1])

newArr.reverse()

for s in (arr + newArr):
    print(s, end="")