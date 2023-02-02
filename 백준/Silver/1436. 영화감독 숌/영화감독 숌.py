import sys

N = int(sys.stdin.readline())

i = 1
count = 0
while(True):
    if("666" in str(i)):
        count += 1
    if(count == N):
        print(i)
        break
    i += 1