-- 코드를 입력하세요
SELECT BOOK_ID, date_format(PUBLISHED_DATE, "%Y-%m-%d") as PUBLISHED_DATE
from BOOK
where year(BOOK.PUBLISHED_DATE) = 2021 and BOOK.CATEGORY = "인문";