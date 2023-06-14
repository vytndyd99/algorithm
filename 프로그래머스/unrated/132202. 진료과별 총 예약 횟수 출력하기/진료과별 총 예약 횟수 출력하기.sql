select MCDP_CD as "진료과코드", count(MCDP_CD) as "5월예약건수"
from APPOINTMENT
where APNT_YMD like "2022-05%"
group by MCDP_CD
order by count(MCDP_CD), MCDP_CD
#연습용