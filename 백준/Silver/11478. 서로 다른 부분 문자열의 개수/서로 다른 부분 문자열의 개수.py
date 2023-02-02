import sys

arr = [] # 문자열 S의 부분 문자열 리스트 

S = sys.stdin.readline().rstrip()

for i in range(1, len(S) + 1): # 1 ~ 문자열 S 길이만큼
    firstIdx = 0 # 첫번째 인덱스 값은 0으로 지정
    lastIdx = i # 마지막 인덱스 값은 i로 지정
    while(lastIdx <= len(S)):
        arr.append(S[firstIdx : lastIdx])
        firstIdx += 1
        lastIdx += 1

print(len(set(arr))) # 중복을 제거한 리스트 arr의 개수