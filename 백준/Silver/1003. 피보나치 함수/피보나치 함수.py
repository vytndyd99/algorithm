import sys

T = int(sys.stdin.readline())

for i in range(T):
    N = int(sys.stdin.readline())
    count_zero = [1, 0, 1] # N 0 ~ 2 까지의 0 출력 개수
    count_one = [0, 1, 1] # N 0 ~ 2 까지의 1 출력 개수
    if(len(count_zero) <= N):
        for i in range(3, N + 1):
            count_zero.append(count_zero[i - 2] + count_zero[i - 1])
            count_one.append(count_one[i - 2] + count_one[i - 1])
    print(count_zero[N], count_one[N])

