-- 코드를 입력하세요
select count(USER_ID)
from USER_INFO
where JOINED like "2021%" and AGE >= 20 and AGE <= 29