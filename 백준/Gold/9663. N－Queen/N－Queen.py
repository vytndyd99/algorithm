import sys

N = int(sys.stdin.readline())

count = 0 # 경우의 수

array = [0 for i in range(N)]

def check(deep):
    for i in range(deep):
        if(array[i] == array[deep]):
            return False
        if(abs(i - deep) == abs(array[i] - array[deep])):
            return False
    return True

def N_Queen(deep):
    global count
    if(deep == N):
        count += 1
        return
    else:
        for s in range(N):
            array[deep] = s
            if(check(deep)):
                N_Queen(deep + 1) 


N_Queen(0)

print(count)