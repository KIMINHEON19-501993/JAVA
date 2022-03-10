package db5;

import java.util.List;

public class StudentBiz {
	public void insertStudent(StudentEntity entity) {
		StudentDao dao = new StudentDao();
		String name = null;
		int kor = entity.getKor();
		int mat = entity.getMat();
		int eng = entity.getEng();
		
		if (kor <= 100 && kor >= 0 && mat <= 100 && mat >= 00 && eng <= 100 && eng >= 0) {
			name = dao.insertStudent(entity);
		}
		StudentView view = new StudentView();
		view.insertStudent(name);
		
	}//end of insertStudent

	public void getStudent(String name) {
		StudentDao dao = new StudentDao();
		StudentEntity entity = dao.getStudent(name);

		StudentView view = new StudentView();
		view.getStudent(entity);
	}//end of insertStudent

	public void getStudentList() {
		StudentDao dao = new StudentDao();
		List<StudentEntity> list = dao.getStudentList();

		StudentView view = new StudentView();
		view.getStudentList(list);
	}//end of getStudentList
}
