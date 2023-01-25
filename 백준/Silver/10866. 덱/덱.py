import sys

N = int(sys.stdin.readline())

arr_d = []

for i in range(N):
    S = sys.stdin.readline().rstrip()
    #push part
    if("push_front" in S):
        arr_d.insert(0, int(S.split(" ")[1]))
    elif("push_back" in S):
        arr_d.append(int(S.split(" ")[1]))
    #pop part
    elif("pop_front" == S):
        if(len(arr_d) == 0):
            print(-1)
        else:
            print(arr_d[0])
            del arr_d[0]
    elif("pop_back" == S):
        if(len(arr_d) == 0):
            print(-1)
        else:
            print(arr_d[len(arr_d) - 1])
            del arr_d[len(arr_d) - 1]
    #size part
    elif("size" == S):
        print(len(arr_d))
    #empty part
    elif("empty" == S):
        if(len(arr_d) == 0):
            print(1)
        else:
            print(0)
    #front part
    elif("front" == S):
        if(len(arr_d) == 0):
            print(-1)
        else:
            print(arr_d[0])
    #back part
    else:
        if(len(arr_d) == 0):
            print(-1)
        else:
            print(arr_d[len(arr_d) - 1])