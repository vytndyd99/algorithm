-- 코드를 입력하세요
SELECT F.FLAVOR 
from FIRST_HALF F, ICECREAM_INFO I
where F.FLAVOR = I.FLAVOR and F.TOTAL_ORDER > 3000 and I.INGREDIENT_TYPE = "fruit_based"

group by F.FLAVOR
order by F.TOTAL_ORDER desc