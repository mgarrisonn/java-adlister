USE adlister_db;

DESCRIBE user;

TRUNCATE user;

INSERT INTO user (username, email, password)
VALUES ('adlister_user', 'adlsister_user@email.com', 'password');

