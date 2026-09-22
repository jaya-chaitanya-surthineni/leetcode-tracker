# Write your MySQL query statement below
SELECT name  AS Customers FROM customers c  LEFT JOIN Orders o ON c.id=o.customerID WHERE o.customerID IS NULL;