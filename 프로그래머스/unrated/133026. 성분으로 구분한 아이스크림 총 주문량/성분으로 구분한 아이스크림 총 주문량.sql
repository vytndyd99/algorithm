-- 코드를 입력하세요
select INGREDIENT_TYPE, sum(TOTAL_ORDER) as TOTAL_ORDER
from FIRST_HALF f
join ICECREAM_INFO i
on f.FLAVOR = i.FLAVOR
group by i.INGREDIENT_TYPE
order by TOTAL_ORDER
#연습중ㅇㅇ