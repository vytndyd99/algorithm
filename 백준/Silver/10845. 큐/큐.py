import sys

N = int(sys.stdin.readline())

arr_q = []

for i in range(N):
    S = sys.stdin.readline().rstrip()
    if(S == "pop"):
        if(len(arr_q) == 0):
            print(-1)
        else:
            print(arr_q.pop(0))
    elif(S == "size"):
        print(len(arr_q))
    elif(S == "empty"):
        if(len(arr_q) == 0):
            print(1)
        else:
            print(0)
    elif(S == "front"):
        if(len(arr_q) == 0):
            print(-1)
        else:
            print(arr_q[0])
    elif(S == "back"):
        if(len(arr_q) == 0):
            print(-1)
        else:
            print(arr_q[len(arr_q) - 1])
    else:
        arr_q.append(S.split(" ")[1])