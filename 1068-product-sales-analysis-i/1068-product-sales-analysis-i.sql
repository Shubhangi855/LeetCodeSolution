/* Write your PL/SQL query statement below */
select p.product_name, s.price, s.year 
from 
sales s,product p 
where p.product_id = s.product_id;