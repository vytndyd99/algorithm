import sys

N = int(sys.stdin.readline())

times = []

for i in range(N):
    startTime, endTime = map(int, sys.stdin.readline().split(" "))
    times.append((startTime, endTime))

times.sort(key = lambda x : (x[1], x[0]))

count = 1 # 회의 최대 개수

startTime = times[0][0]
endTime = times[0][1]

for i in range(1, N):
    if(times[i][0] >= endTime):
        startTime = times[i][0]
        endTime = times[i][1]
        count += 1

print(count)