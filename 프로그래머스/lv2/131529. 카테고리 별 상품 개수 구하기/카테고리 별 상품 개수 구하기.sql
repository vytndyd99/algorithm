-- 코드를 입력하세요
SELECT left(PRODUCT_CODE, 2) as CATEGORY, count(*) as PRODUCT
from PRODUCT p
group by CATEGORY
order by CATEGORY