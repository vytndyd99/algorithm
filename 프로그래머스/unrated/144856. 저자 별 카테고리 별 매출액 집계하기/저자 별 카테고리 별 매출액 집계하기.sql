select b1.AUTHOR_ID, b2.AUTHOR_NAME, b1.CATEGORY, sum(b3.SALES* b1.PRICE) as TOTAL_SALES
from BOOK b1
join AUTHOR b2
on b1.AUTHOR_ID = b2.AUTHOR_ID
join BOOK_SALES b3
on b1.BOOK_ID = b3.BOOK_ID
where b3.SALES_DATE like "2022-01%"
group by b1.AUTHOR_ID, b1.CATEGORY
order by b1.AUTHOR_ID, b1.CATEGORY desc
#Group by 연습중입니다