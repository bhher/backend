-- 데이터베이스 및 테이블 생성
use CelebDB;

-- 부모 테이블 (예: 팀 정보)
CREATE TABLE Team (
    team_id INT AUTO_INCREMENT PRIMARY KEY,  -- Primary Key
    team_name VARCHAR(50) NOT NULL,
    city VARCHAR(50),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- 자식 테이블 (예: 선수 정보)
CREATE TABLE Player (
    player_id INT AUTO_INCREMENT PRIMARY KEY,  -- Primary Key
    player_name VARCHAR(50) NOT NULL,
    position VARCHAR(20),
    age INT,
    team_id INT,  -- Foreign Key
    FOREIGN KEY (team_id) REFERENCES Team(team_id) ON DELETE CASCADE
    -- ON DELETE CASCADE 팀삭제시 , 해당 팀에 속한 선수들도 자동으로 삭제 됩니다.
);



-- 팀 데이터 삽입
INSERT INTO Team (team_name, city) VALUES
('Lions', 'Seoul'),
('Tigers', 'Busan'),
('Bears', 'Incheon');

-- 선수 데이터 삽입 (참조 키 포함)
INSERT INTO Player (player_name, position, age, team_id) VALUES
('Kim Minsoo', 'Pitcher', 25, 1), -- Lions 팀 (team_id = 1)
('Lee Joon', 'Catcher', 28, 1),  -- Lions 팀
('Park Sungwoo', 'Batter', 30, 2), -- Tigers 팀 (team_id = 2)
('Choi Hyunwoo', 'Pitcher', 24, 3); -- Bears 팀 (team_id = 3)
