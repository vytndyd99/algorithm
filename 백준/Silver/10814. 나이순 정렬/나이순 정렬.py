import sys

N = int(sys.stdin.readline())

arr = []

for i in range(N):
    age, name = map(str, sys.stdin.readline().split(" "))
    age = int(age)
    arr.append((age, name.rstrip(), i)) # i 는 가입순서를 의미

arr.sort(key = lambda x : (x[0], x[2])) # 조합순서 첫번째 나이순, 두번째 가입순

for s in arr:
    print(s[0], s[1])