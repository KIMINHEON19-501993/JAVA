[연산자]
=  : 같다
!=,  ^=,  <> : 같지않다
>=, <=, >, < : 크거나같다,작거나같다,크다,작다
and, or, between and, in, like, is null/is not null

※ select 
select  [distinct] [컬럼1, 컬럼2.......][*][ ||연결연산자][as 별명]
from 테이블명
[where 조건절]
[order by 컬럼명 asc|desc ]

order by : 정렬
                asc  - 오름차순(생략가능)
                desc - 내림차순
컬럼명 : 숫자로도 가능
=======================================================================================
--ex1) 사원명,부서ID,입사일을 부서별로 내림차순 정렬하시오


--ex2) 사원명, 부서ID, 입사일을  부서별로 내림차순 정렬하시오
--     같은부서가 있을때는  입사일순으로 정렬하시오


--ex3) 사원들의 연봉을 구한후 연봉순으로 내림차순정렬하시오
--이 름     연 봉     
-- ---------------
--King      28800



=======================================================================================
[단일행 함수]
1. 숫자함수 : mod(나머지), round(반올림), trunc(내림), ceil(올림) 
2. 문자함수 : lower, upper, length, substr, ltrim, rtrim, trim
3. 날짜함수 : sysdate, add_month, month_between
4. 변환함수
   (1) 암시적(implict)변환:자동
       VARCHAR2 또는 CHAR    ------>     NUMBER
       VARCHAR2 또는 CHAR    ------>     DATE
       NUMBER                       ------>     VARCHAR2
       DATE                            ------>     VARCHAR2   

    (2) 명시적(explict)변환:강제
    
               TO_NUMBER         TO_DATE
                 <------               ------>
     NUMBER       CHARACTER           DATE
                 ----->                <------
                 TO_CHAR              TO_CHAR

-날짜형식-
YYYY : 네자리연도(숫자)         (ex.  2005)  
YEAR : 연도(문자)
MM : 두자리 값으로 나타낸 달    (ex.   01, 08, 12)
MONTH : 달 전체이름             (ex.   January) 
MON : 세자리 약어로 나타낸 달   (ex.   Jan)  
DY : 세자리 약어로 나타낸 요일  (ex. Mon) 
DAY : 요일전체                  (ex. Monday) 
DD : 숫자로 나타낸 달의 일      (ex. 31, 01) 

-숫자형식-
9 : 숫자를 표시
0 : 0을 강제로 표시
$ : 부동$기호를 표시
L : 부동 지역통화기호 표시(한국,일본...)
.  : 소수점출력
,  : 천단위 구분자 출력

5. 그룹(집합)함수 : avg, sum, max, min, count
6. 기타함수 : nvl, dcode, case
=======================================================================================
--ex1)  이름을 소문자로 바꾼후 검색
--'Higgins'사원의 사원번호,이름,부서번호를 검색하시오
select employee_id, last_name, DEPARTMENT_ID
from employees
where lower(last_name) = 'Higgins';
--ex2) 10을 3으로 나눈 나머지 구하시오(mod)
select mod(10,3)
from dual; -- 가상 테이블
--ex3) 35765.357을 반올림(round)
select round(35765.357,2) from dual;
select round(35765.357,0) from dual;
select round(35765.357,-2) from dual;
--ex4) 35765.357을 내림(trunc)
select trunc(35765.357,2) from dual;
select trunc(35765.357,0) from dual;
select trunc(35765.357,-2) from dual;
--ex5) concat('문자열1','문자열2') : 문자열의 결합(문자열1+문자열2)
select concat('a','b') from dual;

--ex6) length('문자열')  : 문자열(캐릭터)의 길이
--     lengthb('문자열') : 문자열(BYTE)의 길이
  
--     사용예)  엘리트 , 엘리트
--                          char(20)           varchar2(20)
--           length           14                  3            <---- 엘리트
--           lengthb          20                  9            <---- 엘리트


--     사용예)  elite , elite
--                          char(20)           varchar2(20)
--           length           20                  5             <---- elite
--           lengthb          20                  5             <---- elite

create table text (
			str1 char(20),
			str2 varchar2(20)
			);
insert into text(str1,str2) values('엘리트','엘리트');
insert into text(str1,str2) values('elite','elite');
commit

select * from tab;
select * from text;
select length(str1),length(str2) from text where str1='엘리트';     --14   3
select lengthb(str1),lengthb(str2) from text where str1='엘리트';    --20   9

select length(str1),length(str2) from text where str1='elite';     --20   5
select lengthb(str1),lengthb(str2) from text where str1='elite';   --20   5

--ex7) 
select length('korea') from dual;
select length('한국') from dual;
select lengthb('korea') from dual;
select lengthb('한국') from dual;

--ex8) 지정한문자열찾기 : instr(표현식,찾는문자,[위치]) 1:앞(생략가능), -1:뒤
select instr('HelloWorld','W') from dual;---6
select instr('HelloToWorld','o',-5) from dual;
--ex9) 지정한 길이의 문자열을 추출 : substr(표현식,시작,[갯수])
select substr('I am very happy', 6, 4) from dual;
select substr('I am very happy', 6) from dual;
--ex10) employees 테이블에서 조건에 맞게 검색하시오(concat,  length)   -- 19레코드
--      조건1) 이름과 성을 연결하시오(concat)
--      조건2) 구해진 이름의 길이를 구하시오(length)
--      조건3) 성이 n으로 끝나는 사원(substr)
--employee_id        name           length
-- -----------------------------------------------
--  102              LexDeHaan       10

select employee_id, concat(first_name,last_name),
			length(concat(first_name,last_name)) "length"	
from employees
where substr(last_name,-1) = 'n';


--ex11) 임의의 값이 지정된 범위내에 어느위치 : width_bucket(표현식,최소값,최대값,구간)
--최소-최대값을 설정하고 10개의 구간을 설정후 위치찾기
--0-100까지의 구간을 나눈후 74가 포함되어있는구간을 표시하시오
select width_bucket(74,0,100,10) from dual;

--ex12) 공백제거 : ltrim(왼), rtrim(오른), trim(양쪽)
select rtrim('test       ') from dual;
--ex13) sysdate : 시스템에 설정된 시간표시
-- 2015년 1월 05일
select sysdate from dual;
 				TO_NUMBER         TO_DATE
                 <------               ------>
     NUMBER       CHARACTER           DATE
                 ----->                <------
                 TO_CHAR              TO_CHAR
                 
select to_char(sysdate,'YYYY"년" MM"월" DD"일"') as "오늘날짜" from dual;

select to_char(to_date('15/1/5'),'YYYY"년" MM"월" DD"일"') as "오늘날짜" from dual;
select to_char(to_date('15/1/5'),'YYYY"년" fmMM"월" DD"일"') as "오늘날짜" from dual;
select to_char(to_date('15/1/5'),'YYYY"년" fmMM"월" fmDD"일"') as "오늘날짜" from dual;
--ex14) add_months(date, 달수):날짜에 달수 더하기
select add_months(sysdate,5) from dual;
--ex15) last_day(date) : 해당달의 마지막날
select last_day(sysdate) from dual;
select last_day('2022-02-01') from dual;
--ex16) 오늘부터 이번달 말까지 총 남은 날수를 구하시오
select last_day(sysdate)-sysdate from dual;
--ex17) months_between(date1,date2) : 두 날짜사이의 달수
select months_between('1998-05-14',sysdate) from dual;--음수 결과
select months_between(sysdate,'1998-05-14') from dual;--양수 결과
--ex18) 암시적인 변환(자동)
desc employees

select employee_id, last_name
from employees
where department_id = '90'; --자동 형변환

select months_between('15-10-21', '2004-02-01') from dual;
--ex19) 명시적인 변환(강제)     number --> character
select last_name, to_char(salary,'L99,999.00') "  월  급  "
from employees
where last_name = 'King';
--ex20) fm형식 : 형식과 데이터가 반드시 일치해야함(fm - fm사이값만 일치)
select last_name, hire_date from employees where hire_date = '05/06/25';
select last_name, hire_date from employees where hire_date = '05/6/25';

select to_char(to_date('15-04-07'), 'YYYY-MM-DD') from dual;
select to_char(to_date('15-04-07'), 'YYYY-fmMM-DD') from dual;
select to_char(to_date('15-04-07'), 'YYYY-fmMM-fmDD') from dual;

--ex)2007-02-07에 입사한 사원을 검색하시오
select last_name, hire_date from employees where hire_date='2007-02-07';
select last_name, hire_date from employees where hire_date='2007/02/07';

select last_name, hire_date 
from employees 
where hire_date=to_char(to_date('2007-02-07'), 'YYYY-MM-DD');

select last_name, hire_date 
from employees 
where to_char(hire_date, 'YY-MM-DD')=to_char(to_date('07/02/07'), 'YY-MM-DD');

select last_name, hire_date 
from employees 
where to_char(hire_date, 'YY-MM-DD')=to_char(to_date('07/02/07'), 'YYYY-MM-DD'); --결과 안나옴

select last_name, hire_date 
from employees 
where to_char(hire_date, 'YYYY-MM-DD')=to_char(to_date('07/02/07'), 'YYYY-fmMM-DD'); --결과 안나옴
--ex21) RR, YY형식

   (반환일:현재년도의 세기)                  지정한연도(뒤 두자리)
                                -----------------------------------------------------
                                         0 - 49                      50 - 99     
   ===================================================================================
   현재연도 (뒤 두자리)    0 - 49     반환일의 현재세기       반환일의 이전세기
                            ----------------------------------------------------------
                            50 - 99    반환일의 다음세기      반환일의 현재세기


   예)  현재년도            지정한날짜          RR형식            YY형식
        -----------------------------------------------------------------
           1995           27-oct-95         1995			2095       
           1995           27-oct-17         1995			2015       
           2001           27-oct-17         2001			2001   
           2001           27-oct-95         2001			2001

select to_char(to_date('97/9/30', 'YY-MM-DD'), 'YYYY-MM-DD') from dual;--2097
select to_char(to_date('97/9/30', 'RR-MM-DD'), 'RRRR-MM-DD') from dual;--1997
select to_char(to_date('57/9/30', 'YY-MM-DD'), 'YYYY-MM-DD') from dual;--2057
select to_char(to_date('57/9/30', 'RR-MM-DD'), 'RRRR-MM-DD') from dual;--1957

select to_char(to_date('1903/9/30', 'YY-MM-DD'), 'YYYY-MM-DD') from dual;--1903
select to_char(to_date('1903/9/30', 'RR-MM-DD'), 'RRRR-MM-DD') from dual;--1903 
           
--ex22)
select to_char(to_date('97/9/30', 'YY-MM-DD'), 'YYYY-MM-DD') from dual;
select to_char(to_date('97/9/30', 'RR-MM-DD'), 'RRRR-MM-DD') from dual;
--ex23)2005년 이후에 고용된 사원을 찾으시오
--last_name     hire_date
------------------------------------
--King           17-Jan-1987
--Kochhar        21-sep-1989
--Whalen         17-sep-1987
select last_name, to_char(hire_date,'DD-MON-YYYY')
from employees
where hire_date > '2005-01-01';

select last_name, hire_date 
from employees 
where hire_date > to_char(to_date('2005-01-01'), 'YYYY-MM-DD');

--**그룹함수    
--ex24) count(컬럼명), max(컬럼명), min(컬럼명),avg(컬럼명),sum(컬럼명) 함수
--employees테이블에서 급여의 최대,최소,평균,합을 구하시오
--조건) 평균은 소수이하절사, 합은 세자리 마다 콤마찍고 \(통화기호)표시
select count(salary), max(salary),min(salary),
		trunc(avg(salary)),
		to_char(sum(salary), 'L99,999,999')
from employees;

--ex25) 커미션을 받지 않는 사원의 인원수를 구하시오
select count(*)
from employees
where commission_pct is null;

--ex26) employees테이블에서 없는부서포함해서,총 부서의 수를 구하시오(답 : 12개)
--      (nvl사용)  : nvl(컬럼명, 바꿀값) --null 값이 나올때 무었으로 바꿀것인가
select count(distinct nvl(department_id,0))
from employees;

select distinct department_id from employees;
select distinct nvl(department_id,0) from employees;
--문제) 다음조건을 출력하시오
--        조건1) 사원이름, 급여, 커미션, 연봉을 출력하시오
--        조건2) 연봉 = 급여*12 + (급여*12)*커미션으로 한다
--        조건3) 커미션을 받지 않는경우에는 0으로 표시한다
select last_name as "사원이름", salary as "급여", 
		nvl(commission_pct,0) as "커미션",(salary*12)+((salary*12)*nvl(commission_pct,0)) as "연봉"
from employees
		

--ex27) ① decode(표현식,검색1,결과1,검색2,결과2....[default])
--        : 표현식과 검색을 비교하여 결과 값을 반환 다르면 default
--        ② case  [value]  when  표현식  then   구문1
--                         when  표현식  then   구문2
--                                                 :
--                         else  구문3
--            end

--ex28)업무 id가 'SA_MAN' 또는 ‘SA_REP'이면 'Sales Dept' 그 외 부서이면 'Another'로 표시
--조건) 분류별로 오름차순정렬
--        직무          분류
--       --------------------------
--       SA_MAN    Sales Dept
--       SA_REP      Sales Dept
--       IT_PROG    Another
select job_id 직무,
	decode(job_id, 'SA_MAN', 'Sales Dept', 'SA_REP', 'Sales Dept', 'Another')
from employees
order by 2;

select job_id as "직무",
	case job_id when 'SA_MAN' then 'Sales Dept' 
				when 'SA_REP' then 'Sales Dept' 
				else 'Another'
				end as "분류"
from employees;
--ex28) 급여가 10000미만이면 초급, 20000미만이면 중급 그 외이면 고급을 출력하시오 
--      조건1) 컬럼명은  '구분'으로 하시오
--      조건2) 제목은 사원번호, 사원명, 구  분
--      조건3) 구분(오름차순)으로 정렬하고, 구분값이 같으면 사원명(오름차순)으로 정렬하시오
select employee_id "사원번호", last_name "사원명",
												case  when 10000 > salary then '초급'
														when 20000 > salary then '중급'
														else '고급'
														end as "구   분"
from employees
order by 3 asc,2 asc;



--rank함수 : 전체값을 대상으로 순위를 구함
--rank(표현식) within group(order by 표현식)     ---> 부분
--rank() over(쿼리파티션)                                ---> 전체순위를 표시

--ex29)급여가 3000인 사람의 상위 급여순위를 구하시오
select salary from employees order by 1;

select rank(3000) within group(order by salary desc)
from employees;
--ex30)전체사원의 급여순위를 구하시오
select last_name "이름", salary "급여", rank() over(order by salary desc)"rank"
from employees;

--first_value함수 : 정렬된 값 중에서 첫번째값 반환
--first_value(표현식) over(쿼리파티션)

--ex31)전체사원의 급여와 함께 각부서의 최고급여를 나타내고 비교하시오
=================================================================================================
--[문제1] 사원테이블에서 사원번호, 이름, 급여, 커미션, 연봉을 출력하시오
--        조건1) 연봉은 $ 표시와 세자리마다 콤마를 사용하시오
--        조건2) 연봉 = 급여 * 12 + (급여 * 12 * 커미션) 
--        조건3) 커미션을 받지 않는 사원도 포함해서 출력하시오
select * from employees;
select EMPLOYEE_ID "사원번호", first_name ||' '|| last_name "이름" ,salary "급여", 
		commission_pct "커미션", (salary*12)+((salary*12)*nvl(commission_pct,0)) as "연봉"
from employees



--[문제2] 매니저가 없는 사원의 매니저id를, 1000으로 표시
--        조건1) 제목은 사원번호,이름,매니저ID
--        조건2) 모든 사원을 표시하시오       
--                사원번호     이름       매니저ID
--	          ---------------------------------
--	           100           King        1000 

select EMPLOYEE_id "사원번호", first_name ||' ' || last_name "이름",nvl(manager_id,1000) "매니저ID"
from EMPLOYEES

--[문제3] 급여가  7000이상이면 '고급'  3000이상이면 '중급'  3000미만이면 '초급'을 출력
--          grade별로 오름차순 정렬하시오  
--                last_name        salary       grade
--              --------------------------------------------
--                 King               24000      고급

select last_name,salary,
					case when salary > 7000 then '고급'
						 when salary > 3000 then '중급'
						 else '초급'
						 end as "grade"
from EMPLOYEES
order by 3
