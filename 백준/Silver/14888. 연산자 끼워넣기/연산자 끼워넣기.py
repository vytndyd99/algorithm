import sys
sys.setrecursionlimit(10 ** 8)

N = int(sys.stdin.readline())

nums = list(map(int, sys.stdin.readline().split(" ")))

# +, -, *, // 의 개수
functions = list(map(int, sys.stdin.readline().split(" "))) 

maxNum = -1000000000 # 최댓값 설정
minNum = 1000000000  # 최솟값 설정
ans = nums[0]

def Tracking(deep, plus, minus, mul, div, ans):
    global maxNum, minNum
    if(deep == N):
        if(maxNum < ans):
            maxNum = ans
        if(minNum > ans):
            minNum = ans
        return
    if(plus > 0):
        Tracking(deep + 1, plus - 1, minus, mul, div, ans + nums[deep])
    if(minus > 0):
        Tracking(deep + 1, plus, minus - 1, mul, div, ans - nums[deep])
    if(mul > 0):
        Tracking(deep + 1, plus, minus, mul - 1, div, ans * nums[deep])
    if(div > 0):
        if(ans >= 0):
            Tracking(deep + 1, plus, minus, mul, div - 1, int(ans / nums[deep]))
        else:
            Tracking(deep + 1, plus, minus, mul, div - 1, -int(abs(ans) / nums[deep]))
        

Tracking(1, functions[0], functions[1], functions[2], functions[3], ans)

print(maxNum)
print(minNum)