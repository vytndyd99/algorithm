import sys

N, S = map(int, sys.stdin.readline().split(" "))

arr = list(map(int, sys.stdin.readline().split(" ")))

count = 0 # 조건에 적합한 부분수열의 개수

def backTracking(index, sum):
    global count
    if(index == N):
        if(sum == S):
            count += 1
        return
    else:
        backTracking(index + 1, sum + arr[index])
        backTracking(index + 1, sum)

backTracking(0,0)

if(S == 0): # 공집합 (원소중 아무것도 선택하지 않은 경우)일때는 경우의수에 해당하지 않기에 카운트 하나 빼기
    count -= 1

print(count)