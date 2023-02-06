import sys

arr = [0 for i in range(101)] # 1 부터 100 번째 까지의 길이를 저장할 배열 저장

def solve(N):
    arr[1] = 1
    arr[2] = 1
    arr[3] = 1
    arr[4] = 2
    arr[5] = 2
    for i in range(6, N + 1):
        arr[i] = arr[i - 5] + arr[i - 1] # 규칙은 i번째 길이 = i - 5번째 길이 + i + 1번째 길이
    return arr[N]

T = int(sys.stdin.readline())

for i in range(T):
    N = int(sys.stdin.readline())
    print(solve(N))
