
use CelebDB;

create table snl_show(
    id int not null AUTO_INCREMENT,
    season int not null,
    episode int not null,
    broadcast_date date,
    host VARCHAR(32) not null,
    PRIMARY key(id)
);

insert into snl_show(season, episode, broadcast_date,host) values 
(8, 7, '2020-09-05','강동원'),
(8, 8, '2020-09-12', '유재석'),
(8, 9, '2020-09-19', '차승원'),
(8, 10, '2020-09-26', '이수현'),
(9, 1, '2021-09-04', '이병헌'),
(9, 2, '2021-09-11', '하지원'),
(9, 3, '2021-09-18', '제시'),
(9, 4, '2021-09-25', '조정석'),
(9, 5, '2021-10-02', '조여정'),
(9, 6, '2021-10-09', '옥주현');