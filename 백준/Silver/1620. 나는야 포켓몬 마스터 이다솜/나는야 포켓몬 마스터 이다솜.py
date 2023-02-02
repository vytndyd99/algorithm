import sys

N, M = map(int, sys.stdin.readline().split(" "))

pDic = {} # 포켓몬의 도감을 딕셔너리 형태로 구현

for i in range(1, N + 1):
    S = sys.stdin.readline().rstrip()
    if(ord(S[len(S) - 1]) - 32 != ord(S[len(S) - 1].upper())): # 맨 뒷자리가 대문자인경우! (아스키코드로 확인 대문자 소문자 차이 32)
        num = str(i) +","
        pDic[S] = num # 맨뒷자리가 대문자일때 콤마 표시를 통해 확인
    else:
        pDic[S] = i

pDicRev = dict(map(reversed, pDic.items())) # 포켓몬 도감 딕셔너리 키 밸류 값 반대인 사전 만들기

answer = []

for i in range(M):
    S = sys.stdin.readline().rstrip()
    if(S.isdigit()): # S가 숫자인경우 pDic 사용
        try: # 포켓몬 도감 이름 맨 뒤글자가 대문자인 경우
            print(pDicRev[S + ","])
        except: # 포켓몬 도감 이름 맨 뒷글자가 소문자인 경우
            print(pDicRev[int(S)])
    else: # S가 문자인경우 pDicRev 사용
        num = pDic[S]  
        try: # 포켓몬 도감 이름 맨 뒤글자가 대문자인 경우
            print(int(num.rstrip(",")))
        except: # 포켓몬 도감 이름 맨 뒷글자가 소문자인 경우
            print(int(num)) 