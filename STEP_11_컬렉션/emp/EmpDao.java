package emp;

import java.util.ArrayList;
import java.util.List;

//DAO : 데이터베이스에서 자원을 주고 받기 위한 용도로 사용하는 클래스 (data access object)
public class EmpDao {
	List<EmpVo> list = null;   //습관
	
	public EmpDao() {
		list =  new ArrayList<EmpVo>();
		list.add(new EmpVo("뽀로로", "개발부", 1000000));
		list.add(new EmpVo("패티", "영업부", 1500000));
		list.add(new EmpVo("크롱", "총무부", 2000000));
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
