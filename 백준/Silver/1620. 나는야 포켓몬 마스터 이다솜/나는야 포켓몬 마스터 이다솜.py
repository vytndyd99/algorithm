import sys

N, M = map(int, sys.stdin.readline().split(" "))

dic = {}

for i in range(1, N + 1):
    monster = sys.stdin.readline().rstrip()
    dic[monster] = i

revDic = {}

for key, value in dic.items():
    revDic[value] = key

for i in range(M):
    word = sys.stdin.readline().rstrip()
    if(word.isdigit() == True):
        
        print(revDic[int(word)])
    else:
        print(dic[word])