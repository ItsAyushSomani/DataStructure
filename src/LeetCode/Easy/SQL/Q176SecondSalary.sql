//Write a SQL query to get the second highest salary from the Employee table.
//
//
//+----+--------+
//| Id | Salary |
//+----+--------+
//| 1  | 100    |
//| 2  | 200    |
//| 3  | 300    |
//+----+--------+
//
//
// For example, given the above Employee table, the query should return 200 as t
//he second highest salary. If there is no second highest salary, then the query s
//hould return null.
//
//
//+---------------------+
//| SecondHighestSalary |
//+---------------------+
//| 200                 |
//+---------------------+
//
// Related Topics Database
// 👍 1218 👎 585


//There is no code of Java type for this problem

select max(Salary) as SecondHighestSalary from Employee where Salary not in (select max(Salary) from Employee)

select max(salary) as SecondHighestSalary
from Employee
where salary < (select max(salary) from Employee)
