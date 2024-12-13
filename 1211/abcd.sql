-- 데이터베이스 및 테이블 생성
create database if not EXISTS CelebDB;
use CelebDB;

CREATE TABLE IF NOT EXISTS celeb (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(32) NOT NULL DEFAULT '',
    birthday DATE,
    age INT,
    sex CHAR(1),
    job_title VARCHAR(32),
    agency VARCHAR(32)
);


-- 데이터 삽입
INSERT INTO celeb (name, birthday, age, sex, job_title, agency) VALUES
('아이유', '1993-05-16', 29, 'F', '가수, 텔런트', 'EDAM엔터테이먼트'),
('이미주', '1994-09-23', 28, 'F', '가수', '울림엔터테이먼트'),
('송강', '1994-04-23', 28, 'M', '텔런트', '나무엑터스'),
('강동원', '1981-01-18', 41, 'M', '영화배우, 텔런트', 'YG엔터테이먼트'),
('유재석', '1972-08-14', 50, 'M', 'MC, 개그맨', '안테나'),
('차승원', '1970-06-07', 48, 'M', '영화배우, 모델', 'YG엔터테이먼트'),
('이수현', '1999-05-04', 23, 'F', '가수', 'YG엔터테이먼트');