select MEMBER_ID, MEMBER_NAME, GENDER, date_format(DATE_OF_BIRTH, "%Y-%m-%d") as DATE_OF_BIRTH
from MEMBER_PROFILE
where month(DATE_OF_BIRTH) = "03" and GENDER = "W" and TLNO is not null
order by MEMBER_ID
#연습중입니다