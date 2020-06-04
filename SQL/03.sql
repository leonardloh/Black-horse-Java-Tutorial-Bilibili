SELECT * FROM dept, emp;

-- 消除无用的数据

-- 查询所有员工信息和对印的部门信息
SELECT * FROM emp,dept WHERE emp.dept_id = dept.id;

-- 查询员工表的名称，性别，部门表的名称
SELECT emp.name, emp.gender, dept.name FROM emp,dept WHERE emp.dept_id = dept.id;

SELECT 
	t1.name, 
	t1.gender, 
	t2.name
FROM 
	emp t1, 
	dept t2 
WHERE 
	t1.dept_id = t2.id;

-- 显示内连接
SELECT * FROM emp INNER JOIN dept ON emp.dept_id = dept.id;
SELECT * FROM emp JOIN dept ON emp.dept_id = dept.id;