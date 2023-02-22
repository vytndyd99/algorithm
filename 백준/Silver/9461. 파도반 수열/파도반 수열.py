import sys

T = int(sys.stdin.readline())

for i in range(T):
    P = [0, 1, 1, 1, 2, 2]
    N = int(sys.stdin.readline())
    for i in range(6, N + 1):
        P.append(P[i - 3] + P[i - 2])
    print(P[N])
