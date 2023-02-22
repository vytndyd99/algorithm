import sys

N = int(sys.stdin.readline())

times = []

for i in range(N):
    start, end = map(int, sys.stdin.readline().split(" "))
    times.append((start, end))

times.sort(key = lambda x : (x[1], x[0]))

start = 0
count = 0

for s in times:
    if(start <= s[0]):
        count += 1
        start = s[1]

print(count)