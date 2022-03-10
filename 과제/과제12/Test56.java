package 과제12;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Scanner;

/*
 * [문제56] Hashtable 컬렉션을 이용하여 다음 프로그램을 작성하시오

(1)클래스명 : PhoneBook
- phone : String
- address : String
+ PhoneBook(phone:String,address:String)
+ toString():String      ==> 연락처와 주소의 출력문자열을 리턴한다

(2)사용데이터
    key            value
    ----------------------------------
    홍길동         123-4567   서울
    이몽룡         345-3345   대구
    임꺽정         123-7890   부산

(2)조건
    1) main()메서드에서 Hashtable클래스로 ht객체를 만들어 데이터를 추가한다
        (이때, key는 홍길동이고  value는 123-4567,서울 이다)
    2) 제네릭스를 이용한다
 */
class PhoneBook {
	private String phone;
	private String address;

	public PhoneBook() {
		// TODO 자동 생성된 생성자 스텁
	}

	public PhoneBook(String phone, String address) {
		super();
		this.phone = phone;
		this.address = address;
	}

	@Override
	public String toString() {
		// TODO 자동 생성된 메소드 스텁
		return "연락처 : " + phone + "\n주소 : " + address;
	}
}

class Test56 {

	public static void main(String[] args) {
		Hashtable<String, String> ht = new Hashtable<String, String>();
		Scanner sc = new Scanner(System.in);
		String name;

		ht.put("홍길동", "123-4567   서울");
		ht.put("이몽룡", "345-3345   대구");
		ht.put("임꺽정", "123-7890   부산");

		PhoneBook[] pb = new PhoneBook[3];
		Iterator<String> Keys1 = ht.keySet().iterator();
		for (int i = 0; i < pb.length; i++) {
			String key = Keys1.next();
			int idx = ht.get(key).indexOf(" ");
			pb[i] = new PhoneBook(ht.get(key).substring(0, idx), ht.get(key).substring(idx + 1));
		}

		System.out.print("찾는 사람을 입력하세요 : ");
		name = sc.nextLine();
		Iterator<String> Keys2 = ht.keySet().iterator();
		if (ht.get(name) != null) {
			for (PhoneBook phoneBook : pb) {
				String key = Keys2.next();
				if (key.equals(name)) {
					System.out.println(phoneBook.toString());
				}
				
			}
		} else {
			System.out.println("찾는 사람이 없습니다.");
		}

	}
}
