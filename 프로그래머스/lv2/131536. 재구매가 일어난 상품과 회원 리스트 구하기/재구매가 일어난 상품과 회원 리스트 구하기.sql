-- 코드를 입력하세요
SELECT USER_ID, PRODUCT_ID
from ONLINE_SALE O

group by USER_ID, PRODUCT_ID
having count(USER_ID) > 1
order by USER_ID, PRODUCT_ID desc