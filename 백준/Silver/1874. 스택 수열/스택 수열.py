import sys

N = int(sys.stdin.readline())

stack = []
ans = []

count = 1
for i in range(N):
    num = int(sys.stdin.readline())
    while(count <= num):
        stack.append(count)
        count += 1
        ans.append("+")
    if(stack[-1] == num):
        stack.pop()
        ans.append("-")
    else:
        find = False
        break
    find = True

if(not find):
    print("NO")
else:
    for s in ans:
        print(s)