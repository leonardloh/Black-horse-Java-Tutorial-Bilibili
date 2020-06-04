CREATE TABLE student(
id INT,
NAME VARCHAR(20),
age INT,
sex VARCHAR(5),
address VARCHAR(100),
math INT,
english INT
)

INSERT INTO student (id, NAME, age, sex, address, math, english) VALUES (1, 'mayun', 55, 'm', 'hangzhou', 66, 78), 
(2, 'mahuateng', 45, 'm', 'shenzhen',98,87),(3, 'majintao', 55, 'm', 'hongkong',56,77), (4, 'liu yan', 20, 'f', 'hunan', 76,65),
(5, 'liu qing', 20, 'm', 'hunan',86,NULL), (6, 'liu de hua', 57, 'm', 'hongkong',99,99), (7, 'made', 22, 'f', 'hongkong',99,99),
(9, 'madexiya', 18, 'm', 'nanjing',56,65);

SELECT * FROM student;

-- 查询 姓名 和 年龄

SELECT NAME, age FROM student;
SELECT address FROM student;

-- 去除重复的结果集
SELECT DISTINCT address FROM student;

-- 计算 math 和 english 分数之和
SELECT NAME, math, english, math+english FROM student;

-- 如果有 null 参与计算，计算结果都为null
SELECT NAME, math, english, math + IFNULL(english,0) FROM student;

-- 起别名
SELECT NAME, math, english,  math + IFNULL(english,0) AS total FROM student;
SELECT NAME, math 数学, english 英语,  math + IFNULL(english,0) 总分 FROM student;

-- -------------------------------------------------------------------------------------

SELECT * FROM student;

-- 查询年龄大于 20
SELECT * FROM student WHERE age > 20; 

-- 查询年龄等于20
SELECT * FROM student WHERE age=20;

-- 查询年龄不等于20
SELECT * FROM student WHERE age!=20;

-- 查询年龄大于等于20 小于等于30
SELECT * FROM student WHERE age>=20 && age <=30; -- 不推荐 &&
SELECT * FROM student WHERE age>=20 AND age <=30; -- and
SELECT * FROM student WHERE age BETWEEN 20 AND 30;

-- 查询年龄22岁, 18岁， 25岁的信息
SELECT * FROM student WHERE age=22 OR age=18 OR age =25;
SELECT * FROM student WHERE age IN(22,28,25)
 
 
 -- 查询英语 为 null
SELECT * FROM student WHERE english =NULL; -- 不对的， null 不能用 = / != 判断
SELECT * FROM student WHERE english IS NULL;
 
  -- 查询英语不为 null
SELECT * FROM student WHERE english IS NOT NULL;
  
-- --------------------------------------------------------
-- 查询 姓马 的有哪些
SELECT * FROM student WHERE NAME LIKE 'ma%';

-- 查询 姓名第二个是 'hua'的人
SELECT * FROM student WHERE NAME LIKE '%hua%';

-- --------------------------------------------------------

-- 排序
SELECT * FROM student ORDER BY math -- asc
SELECT * FROM student ORDER BY math DESC -- desc

-- 按照数学成绩排名， 如果数学成绩一样， 按照英语成绩排名
SELECT * FROM student ORDER BY math ASC, english ASC;

-- --------------------------------------------------------
-- union function

SELECT COUNT(english) FROM student;
SELECT COUNT(IFNULL(english,0)) FROM student;

SELECT COUNT(*) FROM student;


SELECT MAX(math) FROM student;
SELECT MIN(math) FROM student;

SELECT SUM(math) FROM student;
SELECT AVG(math) FROM student;

-- --------------------------------------------------------
-- groupby

-- 按照性别分组，分别查询男、女同学的平均分
SELECT sex, AVG(math) FROM student GROUP BY sex;

-- 按照性别分组，分别查询人数
SELECT sex, AVG(math), COUNT(id) FROM student GROUP BY sex;

-- 按照性别分组，分别查询人数, 要求分数低于70分，不参与分组
SELECT sex, AVG(math), COUNT(id) FROM student WHERE math>70 GROUP BY sex;

-- 按照性别分组，分别查询人数, 要求分数低于70分，不参与分组, 分组之后， 人数要大于2人
SELECT sex, AVG(math), COUNT(id) FROM student WHERE math>70 GROUP BY sex HAVING COUNT(id)>2;

SELECT sex, AVG(math), COUNT(id) 人数 FROM student WHERE math>70 GROUP BY sex HAVING 人数>2;

-- --------------------------------------------------------
-- limit

-- 每页显示3条记录
SELECT * FROM student LIMIT 0,3; -- page 1
SELECT * FROM student LIMIT 3,3; -- page 2
SELECT * FROM student LIMIT 6,3; -- page 2
-- 公式： 开始的索引 = （当前的页码 - 1） * 每页显示的条数
-- LIMIT 是 mysql 的方言
