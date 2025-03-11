
-- Init DB
CREATE DATABASE chatdb;
USE chatdb;

CREATE TABLE user_account (
    id VARCHAR(36) PRIMARY KEY DEFAULT (UUID()),
    username VARCHAR(30) UNIQUE NOT NULL,
    user_password VARCHAR(255) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO user_account (username, user_password)
VALUES 
('nhien', 'anhnhienvodich'),
('john_doe', '123456'),
('jane_smith', 'password'),
('michael_jackson', 'qwerty'),
('emma_watson', 'letmein'),
('robert_downey', 'abc123'),
('chris_evans', '123123'),
('scarlett_johansson', 'iloveyou'),
('mark_zuckerberg', 'admin'),
('elon_musk', 'welcome'),
('bill_gates', 'monkey'),
('steve_jobs', 'football'),
('jeff_bezos', 'dragon'),
('larry_page', 'sunshine'),
('sergey_brin', 'princess'),
('tim_cook', 'password1'),
('jack_dorsey', '123qwe'),
('sundar_pichai', 'baseball'),
('satya_nadella', 'shadow'),
('linus_torvalds', '123abc'),
('richard_stallman', 'hunter2');