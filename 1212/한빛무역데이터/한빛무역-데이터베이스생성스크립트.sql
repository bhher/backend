#######################################################
# 교재명: 난생처음 SQL
# 저자:배은영
# 실습 DATABASE명: 한빛무역
# 작성일:2023-01-11
#######################################################


DROP DATABASE IF EXISTS 한빛무역;

CREATE DATABASE 한빛무역 DEFAULT CHARSET  utf8mb4 COLLATE  utf8mb4_general_ci;

USE 한빛무역;

CREATE TABLE 부서(
  부서번호 CHAR(2) PRIMARY KEY,
  부서명 VARCHAR(20)
 ) DEFAULT CHARSET=utf8mb4;



CREATE TABLE 사원(
  사원번호 CHAR(3) PRIMARY KEY,
  이름 VARCHAR(20),
  영문이름 VARCHAR(20),
  직위 VARCHAR(10),
  성별 CHAR(2),
  생일 DATE,
  입사일 DATE,
  주소 VARCHAR(50),
  도시 VARCHAR(20),
  지역 VARCHAR(20),
  집전화 VARCHAR(20),
  상사번호 CHAR(3),
  부서번호 CHAR(2)
  ) DEFAULT CHARSET=utf8mb4;
  
  


CREATE TABLE 고객(
   고객번호 CHAR(5) PRIMARY KEY,
   고객회사명 VARCHAR(30),
   담당자명 VARCHAR(20),
   담당자직위 VARCHAR(20),
   주소 VARCHAR(50),
   도시 VARCHAR(20),
   지역 VARCHAR(20),
   전화번호 VARCHAR(20),
   마일리지 INT
  ) DEFAULT CHARSET=utf8mb4;



CREATE TABLE 제품(
  제품번호 INT PRIMARY KEY,
  제품명 VARCHAR(50),
  포장단위 VARCHAR(30),
  단가 INT,
  재고 INT
  ) DEFAULT CHARSET=utf8mb4;




CREATE TABLE 주문(
  주문번호 CHAR(5) PRIMARY KEY,
  고객번호 CHAR(5),
  사원번호 CHAR(3),
  주문일 DATE,
  요청일 DATE,
  발송일 DATE
  ) DEFAULT CHARSET=utf8mb4;




CREATE TABLE 주문세부(
  주문번호 CHAR(5),
  제품번호 INT,
  단가 INT,
  주문수량 INT,
  할인율 FLOAT,
  PRIMARY KEY(주문번호, 제품번호)
 ) DEFAULT CHARSET=utf8mb4;




CREATE TABLE 마일리지등급(
  등급명 CHAR(1) PRIMARY KEY,
  하한마일리지 INT,
  상한마일리지 INT
  ) DEFAULT CHARSET=utf8mb4;