import sys

N = int(sys.stdin.readline())

info = []

for i in range(N):
    regi = sys.stdin.readline().rstrip().split(" ")
    info.append((int(regi[0]), regi[1], i)) # 나이, 이름, 가입인덱스

info.sort(key = lambda x : (x[0], x[2]))

for s in info:
    print(s[0], s[1])