-- 코드를 입력하세요
# SELECT p.PRODUCT_CODE, p.price as SALES
# from PRODUCT p
# join OFFLINE_SALE o
# on p.PRODUCT_ID = o.PRODUCT_ID
# order by (p.price * o.SALES_AMOUNT) desc, p.PRODUCT_CODE

select p.PRODUCT_CODE, sum(o.SALES_AMOUNT * p.PRICE) as SALES
from PRODUCT p
join OFFLINE_SALE o
on p.PRODUCT_ID = o.PRODUCT_ID
group by p.PRODUCT_CODE
order by sum(o.SALES_AMOUNT * p.PRICE) desc, p.PRODUCT_CODE