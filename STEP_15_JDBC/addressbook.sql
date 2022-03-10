--계정바꾸기 (edu/1234)
select * from tab;
drop table addressbook purge;--테이블 지우기

create table addressbook( --1테이블 생성
num number primary key,
name varchar2(10) not null,
phone varchar2(15),
addr varchar2(70));


create sequence num_seq increment by 1 start with 1 nocycle nocache;--2시퀀스 생성
drop sequence num_seq;---시퀀스 지우기

--데이터 생성
insert into addressbook(num,name,phone,addr) values(num_seq.nextval,'aaa','010-111-1111','서울');
insert into addressbook(num,name,phone,addr) values(num_seq.nextval,'bbb','010-222-2222','울릉도');
insert into addressbook(num,name,phone,addr) values(num_seq.nextval,'ccc','010-333-3333','제주도');

select * from addressbook;