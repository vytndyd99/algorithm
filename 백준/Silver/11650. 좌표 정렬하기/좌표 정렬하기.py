import sys

N = int(sys.stdin.readline()) # N개의 점 을 받기위한 N입력받기

arr = [] # 리스트 선언

for i in range(N):
    S = sys.stdin.readline().rstrip() # 좌표 입력받기
    arr.append( (int(S.split(" ")[0]), int(S.split(" ")[1]))) # 튜플형식으로 각각 두값 저장

arr = list(set(arr))

arr.sort(key = lambda x : (x[0], x[1]))

for arr_key, arr_value in arr:
    print(arr_key, arr_value)