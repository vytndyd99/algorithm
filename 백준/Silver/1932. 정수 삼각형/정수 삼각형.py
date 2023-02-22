import sys

n = int(sys.stdin.readline())

nums = []

for i in range(n):
    num = list(map(int, sys.stdin.readline().split(" ")))
    nums.append(num)

numSum = [[nums[0][0]]]

for i in range(1, n):
    sumNums = [] # 합의 리스트
    for j in range(len(nums[i])):
        if(j == 0): # 왼쪽 끝에 있는 경우
            sumNums.append(numSum[i - 1][j] + nums[i][j])
        elif(j == len(nums[i]) - 1): # 오른쪽 끝에 있는 경우
            sumNums.append(numSum[i - 1][j - 1] + nums[i][j])
        else: # 왼쪽과 오른쪽 끝 이 아닌 경우
            sumNums.append(max(numSum[i - 1][j - 1], numSum[i - 1][j]) + nums[i][j])
    numSum.append(sumNums)

print(max(numSum[n - 1]))