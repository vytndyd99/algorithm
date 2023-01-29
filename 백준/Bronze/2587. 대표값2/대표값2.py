import sys

sum = 0

arr = [] 

for i in range(5):
    N = int(sys.stdin.readline())
    sum += N
    arr.append(N)

arr.sort()

print(sum // 5)
print(arr[5 // 2])