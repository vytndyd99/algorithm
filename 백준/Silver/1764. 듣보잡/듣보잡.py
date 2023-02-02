import sys

N, M = map(int, sys.stdin.readline().split(" "))

nArr = []

for i in range(N):
    S = sys.stdin.readline().rstrip()
    nArr.append(S)

mArr = []

for i in range(M):
    S = sys.stdin.readline().rstrip()
    mArr.append(S)

interSectionArr = list(set(nArr) & set(mArr))

interSectionArr.sort()

print(len(interSectionArr))
for s in interSectionArr:
    print(s)