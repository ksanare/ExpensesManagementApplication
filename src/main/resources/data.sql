INSERT INTO user (username, password, role) VALUES ('user1', '$2a$10$XhMxe7J7yx/4NcEx6Q60HeP7ZrhHhYJmWIlK3jlYSHC/jHJk5/O3G', 'ROLE_USER');
INSERT INTO trip (destination, start_date, end_date) VALUES ('New York', '2023-06-01', '2023-06-10');
INSERT INTO expense (description, amount, trip_id) VALUES ('Hotel', 500.00, 1);