-- 코드를 입력하세요
select WAREHOUSE_ID, WAREHOUSE_NAME, ADDRESS, ifnull(FREEZER_YN, "N") as FREEZER_YN
from FOOD_WAREHOUSE
where ADDRESS like "경기도%"
order by WAREHOUSE_ID
#연습중입니다