import sys

max = -1 # 최댓값을 찾기 위한 값 설정

for i in range(9):
    nums = list(map(int, sys.stdin.readline().split(" ")))
    for j in range(9):
        if(nums[j] > max):
            max_row = i + 1
            max_col = j + 1
            max = nums[j]

print(max)
print(max_row, max_col)