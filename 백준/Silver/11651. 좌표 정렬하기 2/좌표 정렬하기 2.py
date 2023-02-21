import sys

N = int(sys.stdin.readline())

nums = []

for i in range(N):
    x, y = sys.stdin.readline().rstrip().split(" ")
    nums.append((int(x), int(y)))

nums.sort(key = lambda x : (x[1], x[0]))

for s in nums:
    print(s[0], s[1])