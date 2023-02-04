select date_format(SALES_DATE, "%Y-%m-%d") as SALES_DATE, PRODUCT_ID, USER_ID, SALES_AMOUNT
from ONLINE_SALE o
where SALES_DATE like "2022-03%"
union all
select date_format(SALES_DATE, "%Y-%m-%d") as SALES_DATE, PRODUCT_ID, null as USER_ID, SALES_AMOUNT
from OFFLINE_SALE off
where SALES_DATE like "2022-03%"
order by SALES_DATE, PRODUCT_ID, USER_ID