�� SQL��
1. ����Ÿ ���۾�(DML : Data Manipulation Language)
    : insert, update, delete, merge
2. ����Ÿ ���Ǿ�(DDL : Data Definition Language)
    : create, alter, drop, rename, truncate    
3. ����Ÿ�˻�
    : select 
4. Ʈ���������
    : commit, rollback, savepoint
5. ����Ÿ �����(DCL : Data Control Language)
    : grant,  revoke


�� select
[����]
 select [distinct] [�÷�1,�÷�2,.....][as ����][ || ������][*]
 from ���̺��
 [where ������] 

distinct : �ߺ�����
* : ���
������ : and,or,like,in,between and,is null,is not null
==================================================================================
select * from tab;              -- ���̺� ���Ȯ���ϱ�
select * from departments; 
select * from employees;    --employees���̺��� ����Ȯ���ϱ�

--ex1)employees���̺��� ��� ����� �����ȣ,�̸�(last_name),�޿� �˻�
select employee_id, last_name, salary
from employees;

--ex2)employees���̺��� ��� ����� �̸�(last_name), �Ի���(hire_date), ����ID(job_id) �� �˻�
select last_name, hire_date, job_id
from employees;
--ex3)employees���̺��� ��� ����� �̸�(last_name), ����(salary*12)�� �˻�
select last_name, salary*12
from EMPLOYEES;

--ex4)������̱�(as�� ��������)
--    employees���̺��� ��� ����� �����ȣ,�̸�(last_name),�޿� �˻�
--    ����) title �����ȣ, �̸� ,�޿��� ����Ұ�
select EMPLOYEE_id as "�����ȣ", last_name as �̸�, salary "�޿�"
from EMPLOYEES;


--ex5) employee���̺��� �����ȣ,�̸�,������ ���Ͻÿ�
--     ����1) ���� = �޿� * 12
--     ����2) ������ �����ȣ, �̸�, �������� ���
select EMPLOYEE_ID "�����ȣ", last_name "�̸�", salary*12 "����"
from EMPLOYEES;
--ex6) ���Ῥ����( || ) : �÷��� �����ؼ� ���
--    first_name��  last_name�� �����ؼ� ����Ͻÿ�
--     ��   ��
--     ------------
--     Ellen   Abel
select first_name || '   ' || last_name "��   ��"
from EMPLOYEES;


--ex7) ����ó�� ����Ͻÿ�
--   �����ȣ    ��  ��        �� ��
--   ---------------------------------------------
--    100      Steven King   288000�޷� 
select EMPLOYEE_ID "�����ȣ", first_name || '   ' || last_name as "��   ��", salary*12 || '$' as "����"
from EMPLOYEES;
--ex8) ����ó�� ����Ͻÿ� (last_name, job_id�̿�)
--     Employee  Detail
--     --------------------
--     King  is a  AD_PRES
select last_name  || '  is a  ' || job_id  "Employee  Detail"
from EMPLOYEES;

--�ߺ�����(distinct)
--ex9)employees���̺��� �μ��� ����Ͻÿ�
--    ����1)�ߺ��Ǵ� �μ��� 1���� ����Ͻÿ�
--    ����2)�μ��� ������������ �����ֽÿ�
select distinct DEPARTMENT_id
from EMPLOYEES;
--ex10) 10���μ� �Ǵ� 90���μ� ������� �̸�,�Ի���,�μ�ID�� ����Ͻÿ�
select last_name, hire_date, DEPARTMENT_ID
from EMPLOYEES
where DEPARTMENT_ID = 10 OR DEPARTMENT_ID = 90;
--���� ������ asc(��������), �������� desc

--ex11)�޿��� 2500�̻� 3500�̸��� ����� �̸�(last), �Ի���, �޿��� �˻��Ͻÿ�
x
--ex12) �޿��� 2500���� �̰ų� 3000�̻��̸鼭, 90�� �μ��� ����� �̸�, �޿�, �μ�ID�� ����Ͻÿ�. --3��
--      ����1) ������ �����, ��  ��, �μ��ڵ�� �Ͻÿ�
--      ����2) �޿��տ� $�� ���̽ÿ�
--      ����3) ������� first_name�� last_name�� �����ؼ� ����Ͻÿ�
select FIRST_NAME || '  '  || last_name AS "�����",
		'$' || SALARY AS "��  ��",
		DEPARTMENT_ID AS "�μ�ID"
from EMPLOYEES
where (SALARY <= 2500 OR SALARY >=3000) AND DEPARTMENT_ID = 90;
--ex13) 'King'����� ��� �÷��� ǥ���Ͻÿ�
select * 
from EMPLOYEES
where UPPER(LAST_NAME) = 'KING';

-- like  : ���ڸ� ����
-- '%d'      d�� ������ 
-- 'a%'      a�� �����ϴ�
-- '%test%'   test�� ���ԵǾ��ִ�
-- ��)  select * from employees where first_name like '%net%';

--ex14)����ID�� CL�� ���ԵǾ��ִ� ������� �̸�,����ID,�μ�ID�� ����Ͻÿ�
SELECT LAST_NAME, JOB_ID, DEPARTMENT_ID
FROM EMPLOYEES
WHERE JOB_ID LIKE '%CL%';
--ex15) ����ID��  IT�� �����ϴ� ������� �̸�,����ID,�μ�ID�� ����Ͻÿ�
SELECT LAST_NAME, JOB_ID, DEPARTMENT_ID
FROM EMPLOYEES
WHERE JOB_ID LIKE 'IT%';
--ex16) is null / is not null 
--Ŀ�̼��� �޴� ������� �̸��� �޿�,Ŀ�̼��� ����Ͻÿ�
SELECT LAST_NAME, SALARY,COMMISSION_PCT
FROM EMPLOYEES
WHERE COMMISSION_PCT IS NOT NULL;

--ex17)Ŀ�̼��� ���� �ʴ� ������� �̸��� �޿�,Ŀ�̼��� ����Ͻÿ�
SELECT LAST_NAME, SALARY,COMMISSION_PCT
FROM EMPLOYEES
WHERE COMMISSION_PCT IS NULL;
--ex18) in������(or�������� �ٸ�ǥ��)
--����ID��  FI_MGR�̰ų�  FI_ACCOUNT�� ������� �����ȣ,�̸�,����ID�� ����Ͻÿ�   --6��
SELECT EMPLOYEE_ID,LAST_NAME, JOB_ID
FROM EMPLOYEES
WHERE JOB_ID = 'FI_MGR' OR JOB_ID = 'FI_ACCOUNT';

SELECT EMPLOYEE_ID,LAST_NAME, JOB_ID
FROM EMPLOYEES
WHERE JOB_ID IN('FI_MGR', 'FI_ACCOUNT')
--ex19) between������(and�������� �ٸ� ǥ��) : �ʰ�,�̸������� ����Ҽ� ����
--�޿���  10000�̻�  20000������ ����� �����ȣ,�̸�,�޿��� ����Ͻÿ�   --18��
SELECT JOB_ID,LAST_NAME,SALARY
FROM EMPLOYEES
WHERE SALARY >= 10000 AND SALARY <= 20000;

SELECT JOB_ID,LAST_NAME,SALARY
FROM EMPLOYEES
WHERE SALARY BETWEEN 10000 AND 20000;

--[����1] ����ID�� 'SA_REP' �̰ų� 'AD_PRES' �̸鼭, �޿��� 15000�� �ʰ��ϴ� 
--������� �̸�,����ID,�޿��� ����Ͻÿ�
--�̸�        ����ID            ��  ��
-- --------------------------------------
--King       AD_PRES            24000��

select last_name "�̸�", job_id "����ID", salary ||'��' "��  ��" 
from EMPLOYEES
where (job_id = 'SA_REP' or job_id = 'AD_PRES') and salary >15000

------------------------------------------------------------------------------
--[����2] Employees���̺��� ����ID�� �ߺ����� �ʰ� ǥ���ϴ� ���Ǹ� �ۼ��Ͻÿ�
-- JOB_ID
-- ---------
--AC_ACCOUNT
--AC_MGR
--     :

select distinct job_id
from EMPLOYEES



-----------------------------------------------------------------------------
--[����3] �Ի����� 03���� ������� �����ȣ,�̸�,�Ի����� ǥ���Ͻÿ�
select EMPLOYEE_ID "�����ȣ", FIRST_NAME || '  '|| LAST_NAME "�̸�",
		to_char(HIRE_DATE,'YYYY-MM-DD') "�Ի���"
from EMPLOYEES
where HIRE_DATE >= '2003-01-01' and HIRE_DATE < '2004-01-01'
















