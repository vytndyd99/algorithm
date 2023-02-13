import sys
sys.setrecursionlimit(10 ** 8)

T = int(sys.stdin.readline())

def DFS(s):
    global sumNum, count
    if(s == n):
        count += 1
        return
    if(s > n): # 합계가 n을 넘어가면 되돌아가기
        return
    DFS(s + 1) # 1 더한값
    DFS(s + 2) # 2 더한값
    DFS(s + 3) # 3 더한값


for i in range(T):
    sumNum = 0 # 합계
    count = 0 # 방법의 개수
    n = int(sys.stdin.readline())

    DFS(sumNum)

    print(count)