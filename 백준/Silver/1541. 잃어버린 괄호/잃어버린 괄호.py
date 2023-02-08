import sys

S = sys.stdin.readline().rstrip()

Nums = []

if("-" not in S): # 마이너스가 없는 경우 ex.10+20+30+40
    Nums = S.split("+") # +로 구분하여 숫자를 나누기 ["10","20","30","40"]
    Nums = sum(list(map(int, Nums))) # ex 문자열을 숫자로 변경 후 sum 함수 실행 [10, 20, 30, 40] -> 100 
    print(Nums) #출력
else: # 마이너스가 섞여있는 경우 ex. 10-20+30+40
    Nums = S.split("-") # - 로 구분하여 숫자를 나누기  ["10", "20+30+40"]
    for i in range(len(Nums)): # i 0 ~ 1
        Nums[i] = Nums[i].split("+") # 각 어레이 마다 +로 구분하여 나누기 ex ["10", ["20","30","40"]]
        Nums[i] = sum(list(map(int, Nums[i]))) # 숫자로 변경 후 sum 함수 실행 [10, 90]
    sumNums = Nums[0] # 합계 구하기 (첫 숫자만 더하고 나머지는 빼야 최솟값을 가질 수 있음)
    for i in range(1, len(Nums)): # 반복하여 빼기
        sumNums -= Nums[i]
    print(sumNums)