package family;

public class MainEx {
	public static void main(String[] args) {
//		Family[] ob = new Family[3];
//		ob[0] = new Father("홍길동");
//		ob[1] = new Mother("홍길동");
//		ob[2] = new Son("홍길동");

		Family[] ob = new Family[] { new Father("홍길동"),
									 new Father("홍패티"), 
									 new Son("홓로로") 
								   };

		for (Family family : ob) {
			System.out.println(family.toString());
		}

//		for (int i = 0; i < ob.length; i++) {
//			System.out.println(ob[i].toString());
//		}
	}
}
