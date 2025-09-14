# Write your MySQL query statement below
select p.project_id,round(sum(E.experience_years)/count(E.employee_id),2)
 as average_years
 from Project p
 Left join Employee E
 on p.employee_id=E.employee_id
 group by project_id;