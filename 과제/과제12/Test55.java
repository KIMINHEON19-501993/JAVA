package 과제12;

import java.util.HashMap;
import java.util.Iterator;

/*
 * [문제 55] HashMap컬렉션을 이용하여 다음 자료를 추가하시오
(1)클래스명 : Harrypotter
   -num:int
   -firstname:String
   -lastname:String
   +Harrypotter()
   +Harrypotter(num:int,firstname:String,lastname:String)
   +toString():String
   +getter

(2) 사용데이터
     key        value
    ------------------------------------- 
     101        해리           포터
     102        론              위즐리
     103        헤르미온느  그레인져

(2)조건
   1) main()함수에서 HashMap클래스로 hm객체를  만들어 데이터를 추가한다
       (이때, key는 101이고  value는 101, 해리, 포터 이다)
   2) 제네릭스를 이용한다
 */
class Harrypotter {
	private int num;
	private String firstname;
	private String lastname;

	public Harrypotter() {
		// TODO 자동 생성된 생성자 스텁
	}

	public Harrypotter(int num, String firstname, String lastname) {
		super();
		this.num = num;
		this.firstname = firstname;
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		// TODO 자동 생성된 메소드 스텁
		return super.toString();
	}

	public int getNum() {
		return num;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

}

class Test55 {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(101, "해리 포터");
		hm.put(102, "론 위즐리");
		hm.put(103, "헤르미온느 그레인져");
		
		Harrypotter[] hr = new Harrypotter[3];
		Iterator<Integer> keys = hm.keySet().iterator();
		
		for (int i = 0; i < hr.length; i++) {
			Integer key = keys.next();	
			int idx = hm.get(key).indexOf(" ");
			hr[i] = new Harrypotter(key, hm.get(key).substring(0,idx), hm.get(key).substring(idx+1));			
		}
		
		
		System.out.println("성\t\t이름");
		System.out.println("-------------------------------------");
		for (Harrypotter harrypotter : hr) {
			System.out.println(harrypotter.getFirstname() + "\t\t" + harrypotter.getLastname());
		}
		
	}
}
