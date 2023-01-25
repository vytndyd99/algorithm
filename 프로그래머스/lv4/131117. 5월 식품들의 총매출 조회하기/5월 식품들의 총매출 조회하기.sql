-- 코드를 입력하세요
select p.PRODUCT_ID, p.PRODUCT_NAME, p.PRICE * sum(o.AMOUNT) as TOTAL_SALES
from FOOD_PRODUCT p
join FOOD_ORDER o
on p.PRODUCT_ID = o.PRODUCT_ID
where date_format(o.PRODUCE_DATE,"%Y-%m-%d") like "2022-05%"
group by PRODUCT_ID
order by TOTAL_SALES desc, PRODUCT_ID