select b1.CATEGORY, sum(b2.SALES) as TOTAL_SALES
from BOOK b1
join BOOK_SALES b2
on b1.BOOK_ID = b2.BOOK_ID 
where b2.SALES_DATE like "2022-01%" 
group by b1.CATEGORY
order by b1.CATEGORY
#연습