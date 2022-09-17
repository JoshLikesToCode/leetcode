# Write your MySQL query statement below
SELECT 
    s1.sale_date,
    s2.sold_num - s1.sold_num as diff
FROM Sales s1 JOIN Sales s2 
	ON s1.sale_date = s2.sale_date AND s1.fruit != s2.fruit
GROUP BY sale_date
ORDER BY sale_date