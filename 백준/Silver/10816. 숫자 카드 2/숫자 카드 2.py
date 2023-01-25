import sys
import collections

N = int(sys.stdin.readline())

N_arr = list(map(int, sys.stdin.readline().split()))

M = int(sys.stdin.readline())

M_arr = list(map(int, sys.stdin.readline().split()))

new_Dic = collections.Counter(N_arr)

for num in M_arr:
    if(num in new_Dic):
        print(new_Dic[num], end=" ")
    else:
        print(0, end=" ")