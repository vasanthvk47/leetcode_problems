# Write your MySQL query statement below
select u.unique_id as unique_id ,e.name as name from Employees as e
LEFT JOIN EmployeeUNI  as u on e.id=u.id;