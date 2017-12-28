-- 시퀀스 생성
create sequence scno;

-- 테이블 생성
create table soccer (
scno int primary key,
scname	nvarchar2(6)	not null,
tmname	nvarchar2(10)	not null,
tmregion	nvarchar2(2)	not null,
tmpos	char(2)	not null,
bkno	varchar(5)	not null,
birth	varchar2(10)	not null,
height	char(3)	not null,
weight	char(3)	not null,
regdate timestamp default sysdate
);

insert into soccer
(scno, scname, tmname, tmregion, tmpos, bkno, birth, height, weight)
values
(scno.nextval, '최강조', '일화천마', '성남', 'MF', '6', '90/01/24', '165', '57');

select * from soccer;
delete from soccer where scno = 32;