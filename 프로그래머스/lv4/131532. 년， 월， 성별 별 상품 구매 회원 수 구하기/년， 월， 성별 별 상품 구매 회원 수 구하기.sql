select year(o.SALES_DATE) as YEAR, month(SALES_DATE) as MONTH, u.GENDER, count(distinct u.USER_ID) as USERS
from USER_INFO u
join ONLINE_SALE o
on u.USER_ID = o.USER_ID
group by YEAR, MONTH, u.GENDER
having gender is not null
order by YEAR, MONTH, GENDER