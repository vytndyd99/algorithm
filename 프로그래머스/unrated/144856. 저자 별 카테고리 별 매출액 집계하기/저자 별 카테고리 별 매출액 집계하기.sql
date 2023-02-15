-- 코드를 입력하세요
SELECT b.AUTHOR_ID, a.AUTHOR_NAME, b.CATEGORY, sum(b.PRICE * s.SALES) as TOTAL_SALES
from BOOK b
join AUTHOR a
on b.AUTHOR_ID = a.AUTHOR_ID
join BOOK_SALES s
on b.BOOK_ID = s.BOOK_ID
where date_format(s.SALES_DATE, "%Y-%m-%d") like "2022-01%"
group by a.AUTHOR_ID, b.CATEGORY
order by b.AUTHOR_ID, b.CATEGORY desc