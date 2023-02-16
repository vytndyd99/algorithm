import sys

def recue(deepNum, index):
    if(deepNum == 6):
        print(" ".join(map(str, ans)))
        return
    for i in range(index, len(arr)):
        ans.append(arr[i])
        recue(deepNum + 1, i + 1)
        ans.pop()

while(True):
    ans = []
    arr = list(map(int, sys.stdin.readline().split(" ")))
    if(arr[0] == 0):
        break
    arr.pop(0)
    recue(0, 0)
    print()