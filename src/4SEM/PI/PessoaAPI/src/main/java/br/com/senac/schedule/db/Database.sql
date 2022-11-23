CREATE DATABASE PersonAPI;
USE PersonAPI;

CREATE TABLE person(
    id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(36),
    last_name VARCHAR(36),
    email VARCHAR(200),
    created_at DATETIME,
    is_active BOOL
);

SELECT * FROM person;