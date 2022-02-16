package emp;

import java.util.ArrayList;
import java.util.List;

//DAO : �����ͺ��̽����� �ڿ��� �ְ� �ޱ� ���� �뵵�� ����ϴ� Ŭ���� (data access object)
public class EmpDao {
	List<EmpVo> list = null;   //����
	
	public EmpDao() {
		list =  new ArrayList<EmpVo>();
		list.add(new EmpVo("�Ƿη�", "���ߺ�", 1000000));
		list.add(new EmpVo("��Ƽ", "������", 1500000));
		list.add(new EmpVo("ũ��", "�ѹ���", 2000000));
	}
	public List<EmpVo> getEmpList() {
		return list;
	}
	
	public EmpVo getEmp(String ename) {	
		EmpVo vo = null;
		for (EmpVo ob : list) {
			if(ob.getEname().equals(ename)) {
				vo = ob;
			}
		}
		return vo;
	}

}
