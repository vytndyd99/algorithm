import sys

N , K = map(int, sys.stdin.readline().split(" "))

arr = []

for i in range(N): # 배열 만들기
    arr.append(i + 1) 

idx = K - 1 # k값 설정

ans = [] # 요세푸스 순열 정답 배열

while(len(arr) > 1): # 배열의 크기가 1보다 클때 동안 반복문 진행
    ans.append(arr[idx]) # 요세푸스 순열 추가
    del arr[idx] # 원래 배열에 요세푸스 순열추가된 값은 제거
    idx = (idx - 1 + K) % len(arr) # 없어진 값으로 인해 인덱스를 -1 하고, k만큼 더하고, 남은 arr 배열 크기만큼 나머지를 구하기 (인덱스 범위를 벗어나면 안되니까)
ans.append(arr[0]) # 나머지 마지막 arr배열값을 ans 배열에 추가

print("<", end="")
if(len(ans) == 1):
    print(ans[0], end="")
else:
    for i in range(N):
        if(i == len(ans) - 1):
            print("%d" % ans[i],end="")
        else:
            print("%d," % ans[i], end=" ")
print(">", end="")