import sys
import collections

T = int(sys.stdin.readline())

for i in range(T):
    p = sys.stdin.readline().rstrip()
    n = int(sys.stdin.readline())
    nums = sys.stdin.readline().rstrip()
    nums = nums.strip("[]")

    # 덱의 원소가 아무것도 없는지 확인
    if(len(nums) == 0):
        nums = []
    else:
        nums = list(map(int, nums.split(",")))

    nums = collections.deque(nums)
    R = 0 # 뒤집기 횟수
    errorFlag = False # 에러인지 아닌지 확인
    startIdx = 0
    for s in p:
        if(s == "R"):
            R += 1
            if(startIdx == 0):
                startIdx = len(nums) - 1
            else:
                startIdx = 0
        elif(s == "D"):
            if(len(nums) == 0):
                errorFlag = True
                break
            else:
                if(startIdx == 0):
                    nums.popleft()
                else:
                    nums.pop()
                    startIdx -= 1
    if(errorFlag):
        print("error")
    else:
        if(R % 2 == 0):
            print("[" + ",".join(map(str, nums))  + "]")
        else:
            nums.reverse()
            print("[" + ",".join(map(str, nums))  + "]")