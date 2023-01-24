import sys

N = int(sys.stdin.readline())
array = []

for i in range(N):
    S = sys.stdin.readline().strip()
    if(S == "top"):
        if(len(array) == 0):
            print(-1)
            continue
        else:
            print(array[len(array) - 1])
    elif(S == "pop"):
        if(len(array) == 0):
            print(-1)
            continue
        else:
            print(array[len(array) - 1])
            del array[len(array) - 1]
    elif(S == "size"):
        print(len(array))
    elif(S == "empty"):
        if(len(array) > 0):
            print(0)
        else:
            print(1)
    else:
        array.append(int(S.split(" ")[1]))
