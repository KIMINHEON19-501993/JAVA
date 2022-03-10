package db1;

class DBMain {

	public static void main(String[] args) {
		DBConnection db = new DBConnection();
		
		//항목추가
		db.addressInsert("ddd","010-444-4444","거제도");
		
		db.addressInsert("eee","010-555-5555","백령도");
		
		//데이터 수정하기
//		db.addressUpdate(2,"000-000-0000","매물도");
		
//		db.addressUpdate(5,"000-000-0000","우도");
		
		//데이터 삭제	
//		db.addressDelete(1);
		
		
		//전체목록 조회
//		db.addressList();
	}

}
