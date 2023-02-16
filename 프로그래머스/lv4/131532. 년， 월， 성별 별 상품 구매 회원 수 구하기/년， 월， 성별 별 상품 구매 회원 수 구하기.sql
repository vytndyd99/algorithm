-- 코드를 입력하세요
SELECT year(s.SALES_DATE) as YEAR, month(s.SALES_DATE) as MONTH, i.GENDER, count(distinct i.USER_ID) as USERS
from USER_INFO i
join ONLINE_SALE s
on i.USER_ID = s.USER_ID
where i.GENDER is not null
group by YEAR, MONTH, GENDER
order by YEAR, MONTH, GENDER