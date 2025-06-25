-- # Write your MySQL query statement below
-- select p.product_name,s.year,s.price from Sales as s
-- join Product p 
-- on p.product_id = s.product_id;


SELECT product_name, year, price
FROM Sales
NATURAL JOIN Product;
