import sys

N = int(sys.stdin.readline())

arr = [] # 단어 리스트

for i in range(N):
    S = sys.stdin.readline().rstrip()
    arr.append((S,len(S)))

arr = list(set(arr))

arr.sort(key = lambda x : (x[1], x[0]))

for arr_key, arr_value in arr:
    print(arr_key)