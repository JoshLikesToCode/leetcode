# Write your MySQL query statement below
SELECT A.teacher_id, COUNT(distinct A.subject_id) AS cnt
FROM Teacher A
JOIN Teacher B ON A.teacher_id = B.teacher_id AND A.subject_id != B.subject_id
GROUP BY A.teacher_id;