import sys

N, K = map(int, sys.stdin.readline().split(" "))

coinArr = []

for i in range(N):
    coin = int(sys.stdin.readline())
    coinArr.append(coin)


count = 0 # 동전 개수 카운트

coinValue = len(coinArr) - 1 # 동전개수의 최소값을 위해 가장 가치가 큰 동전부터 세기

while(K > 0): # 동전 합계가 0이 될때까지
    if(coinArr[coinValue] > K): # 코인값이 현재 K값보다 크면 더 가치가 낮은 코인으로 변경
        coinValue -= 1
        continue
    count += K // coinArr[coinValue] # 코인 개수를 몫의 값으로 계속 누적합
    K = K % coinArr[coinValue] # K값은 나머지로 변경
    coinValue -= 1 # 코인밸류 하나 하락

print(count)
    
    