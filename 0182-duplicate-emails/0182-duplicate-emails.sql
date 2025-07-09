# Write your MySQL query statement below
select distinct a.Email from Person as a,Person as b where a.email=b.email and a.id<b.id;