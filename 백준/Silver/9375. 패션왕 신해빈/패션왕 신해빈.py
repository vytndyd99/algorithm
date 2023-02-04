import sys

T = int(sys.stdin.readline())

for i in range(T):

    n = int(sys.stdin.readline())
    clothes = {}
    for j in range(n):
        S = sys.stdin.readline().rstrip()
        if(S.split(" ")[1] in clothes.keys()):
            clothes[S.split(" ")[1]] += 1
        else:
            clothes[S.split(" ")[1]] = 1
    if(n == 0):
        print(0)
    else:
        sum = 1
        for num in clothes.values():
            sum *= (num + 1)
        print(sum - 1)
