import sys

def istrue(n_list, m_list, i):
    firstIdx = 0
    lastIdx = len(n_list) - 1
    while(firstIdx <= lastIdx):
        midInx = (firstIdx + lastIdx) // 2
        if(m_list[i] == n_list[midInx]):
            return 1
        elif(m_list[i] < n_list[midInx]):
            lastIdx = midInx - 1
        else:
            firstIdx = midInx + 1
    return 0

N = int(sys.stdin.readline())

n_list = list(map(int, sys.stdin.readline().split()))

M = int(sys.stdin.readline())

m_list = list(map(int, sys.stdin.readline().split()))

n_list.sort()

for i in range(M):
    if(istrue(n_list, m_list, i)):
        print(1, end=" ")
    else:
        print(0, end=" ")