INSERT INTO stu(id, NAME, age) VALUES (1, '张无忌', 18);

INSERT INTO stu VALUES(2, '赵敏', 17, 99.9, NULL, NULL);

INSERT INTO stu VALUES(3, '张三丰', 17, 99.9, "1893-11-11", NULL);

SELECT * FROM stu;

DESC stu;

DELETE FROM stu WHERE id=1;

DELETE FROM stu;

TRUNCATE TABLE stu; -- 删除表,然后再创建一个一摸一样的空表


UPDATE stu SET age = 117 WHERE id=3;
UPDATE stu SET age=18, score=100 WHERE id=2;