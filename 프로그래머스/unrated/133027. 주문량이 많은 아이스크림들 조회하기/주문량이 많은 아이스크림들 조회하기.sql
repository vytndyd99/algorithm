select f.FLAVOR
from FIRST_HALF f
join JULY j
on f.FLAVOR = j.FLAVOR
group by f.FLAVOR
order by sum(f.TOTAL_ORDER) + sum(j.TOTAL_ORDER) desc
limit 3
#연습용중