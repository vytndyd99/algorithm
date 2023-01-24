-- 코드를 입력하세요
select date_format(SALES_DATE,"%Y-%m-%d") as SALES_DATE, PRODUCT_ID, USER_ID, SALES_AMOUNT
from ONLINE_SALE o1
where SALES_DATE like "2022-03%"
union all 
select date_format(SALES_DATE,"%Y-%m-%d") as SALES_DATE, PRODUCT_ID, null as USER_ID, SALES_AMOUNT
from OFFLINE_SALE o2
where SALES_DATE like "2022-03%"
order by SALES_DATE, PRODUCT_ID, USER_ID