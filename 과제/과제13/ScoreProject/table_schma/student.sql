drop table student purge;

create table student( 
mid   number PRIMARY KEY,
name  varchar2(15) NOT NULL,
kor number,
eng number,
mat number
);

create sequence m_mid increment by 1 start with 1 nocycle nocache

insert into student(mid,name,kor,eng,mat) values(m_mid.nextval,'민들래',90,88,75);
insert into student(mid,name,kor,eng,mat) values(m_mid.nextval,'진달래', 80,88,65);

select * from student;