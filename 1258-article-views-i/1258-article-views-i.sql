SELECT author_id AS id
FROM Views
WHERE viewer_id = author_id
GROUP BY author_id
HAVING COUNT(viewer_id) >= 1
ORDER BY author_id ASC;
