-- 코드를 입력하세요
select ANIMAL_ID, NAME
from ANIMAL_INS
where INTAKE_CONDITION not in ("Aged")
order by ANIMAL_ID