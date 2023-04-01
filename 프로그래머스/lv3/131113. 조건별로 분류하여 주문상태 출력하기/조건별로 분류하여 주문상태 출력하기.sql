-- 코드를 입력하세요
select ORDER_ID, PRODUCT_ID, date_format(OUT_DATE, "%Y-%m-%d") as OUT_DATE,if(OUT_DATE > "0001-01-01", if(date_format(OUT_DATE, "%Y-%m-%d") <= "2022-05-01", "출고완료", "출고대기"), "출고미정") as 출고여부
from FOOD_ORDER
order by ORDER_ID
#공주졸려