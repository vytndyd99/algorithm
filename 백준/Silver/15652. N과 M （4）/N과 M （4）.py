import sys

N, M = map(int, sys.stdin.readline().split(" "))


answer = []

def back(depth, start):
    if(depth == M):
        print(" ".join(map(str, answer)))
        return 
    for i in range(start, N + 1):
        answer.append(i)
        back(depth + 1, i)
        answer.pop()

back(0, 1)