import sys

def recursion(s, l, r, count):
    if l >= r: 
        return (1, count)
    elif s[l] != s[r]: 
        return (0, count)
    else: 
        count += 1
        return recursion(s, l+1, r-1, count)

def isPalindrome(s, count):
    return recursion(s, 0, len(s)-1, count)

T = int(sys.stdin.readline())

for i in range(T):
    S = sys.stdin.readline().rstrip()
    print(isPalindrome(S, 1)[0], isPalindrome(S, 1)[1]) # 문자열 S와 함수호출횟수 1을 입력 (무조건 처음에는 한번 실행하기에 1부터 시작)