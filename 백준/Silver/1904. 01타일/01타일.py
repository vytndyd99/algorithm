import sys

N = int(sys.stdin.readline())

answers = {}

def solve(N):
    answers[1] = 1
    answers[2] = 2
    for i in range(3, N + 1):
        answers[i] = (answers[i - 1] + answers[i - 2]) % 15746
    return answers[N]

print(solve(N))
    