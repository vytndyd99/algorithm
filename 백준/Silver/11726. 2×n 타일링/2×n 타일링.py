import sys

n = int(sys.stdin.readline())

counts = [0 for i in range(1001)]

if(n == 1):
    counts[1] = 1
    print(counts[1] % 10007)
elif(n == 2):
    counts[2] = 2
    print(counts[2] % 10007)
else:
    counts[1] = 1
    counts[2] = 2
    for i in range(3, n + 1):
        counts[i] = counts[i - 2] + counts[i - 1]
    print(counts[n] % 10007)
