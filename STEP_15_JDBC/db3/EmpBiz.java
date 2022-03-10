package db3;

import java.util.List;

//계산이나 
public class EmpBiz {
	private int a;
	public int b;

	public void addressList() {
		// dao의 addressList 호출
		EmpDao dao = new EmpDao();
		List<EmpEntity> list = dao.addressList(); // 그림의 2

		EmpView view = new EmpView();
		view.addressList(list);
	}// end of addressList

	public void addressInsert(EmpEntity entity) {
		EmpDao dao = new EmpDao();
		int n = dao.addressInsert(entity);

		EmpView view = new EmpView();
		view.addressInsert(n);

	}

	public boolean addressSearch(String name) {
		boolean ck = false;

		EmpDao dao = new EmpDao();
		EmpEntity entity = dao.addressSearch(name);

		EmpView view = new EmpView();
		view.addressSearch(entity);

		ck = (entity != null) ? true : false;
		return ck;
	}

	public void addressUpdate(String name, String phone, String addr) {

		EmpDao dao = new EmpDao();
		int n = dao.addressUpdate(name, phone, addr);

		EmpView view = new EmpView();
		view.addressUpdate(n);
	}

	public void addressDelete(String name) {

		EmpDao dao = new EmpDao();
		int n = dao.addressDelete(name);

		EmpView view = new EmpView();
		view.addressDelete(n);
	}
}
