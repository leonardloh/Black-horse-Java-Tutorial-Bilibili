-- 左外连接

SELECT * FROM dept;
SELECT * FROM emp;

-- 查询所有员工信息，如果员工有部门，则查询部员们名称，没有部门，则不显示部门名称
SELECT 
	t1.*, t2.name
FROM
	emp t1, dept t2
WHERE
	t1.dept_id = t2.id
	
SELECT t1.*, t2.name FROM emp t1 LEFT JOIN dept t2 ON t1.dept_id = t2.id;

SELECT t1.*, t2.name FROM emp t1 RIGHT JOIN dept t2 ON t1.dept_id = t2.id;

-- --------------------------------------------
-- 查询最高工资

SELECT MAX(salary) FROM emp;

SELECT * FROM emp WHERE emp.salary = 9000

-- 一条sql

SELECT * FROM emp WHERE emp.salary = (SELECT MAX(salary) FROM emp);

-- 查询员工工资小于平均工资的人
SELECT * FROM emp WHERE emp.salary < (SELECT AVG(salary) FROM emp);

-- 查询财务部的所有员工信息
SELECT id FROM dept WHERE NAME = "财务部" OR NAME="市场部";
SELECT * FROM emp WHERE dept_id = 3 OR dept_id=2;

SELECT * FROM emp WHERE dept_id IN (3,2);
SELECT * FROM emp WHERE dept_id IN (SELECT id FROM dept WHERE NAME = "财务部" OR NAME="市场部");
-- ----------------------------

SELECT * FROM emp WHERE emp.join_date > '2011-11-11'

SELECT * FROM dept t1, (SELECT * FROM emp WHERE emp.join_date > '2011-11-11') t2 
WHERE t1.id = t2.dept_id

SELECT * FROM emp t1, dept t2 WHERE t1.dept_id = t2.id AND t1.join_date > '2011-11-11'

