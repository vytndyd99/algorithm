-- 코드를 입력하세요
select hour(DATETIME) as HOUR, count(DATETIME) as COUNT
from ANIMAL_OUTS
group by HOUR
having HOUR >= 9 and HOUR < 20
order by HOUR
#연습용