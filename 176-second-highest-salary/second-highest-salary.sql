# Write your MySQL query statement below
select max(salary) as SecondHighestSalary from EMPLOYEE
where salary < (select max(salary)from Employee);
