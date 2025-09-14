# Write your MySQL query statement below
select S.student_id,S.student_name, Su.subject_name,count(E.student_id) as attended_exams
from Students S
cross join subjects Su
left JOIN Examinations E
on S.student_id =E.student_id
and Su.subject_name=E.subject_name
group by S.student_id ,Su.subject_name,S.student_name
order by S.student_id ,Su.subject_name,S.student_name;