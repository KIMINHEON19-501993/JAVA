package inheritance;

public class SubTest extends SuperTest{
	private int age;
	private double score;

	public SubTest() {
		super();
		// TODO 자동 생성된 생성자 스텁
	}

	public SubTest(String name, String addr, int age, double score) {
		super(name, addr);
		this.age = age;
		this.score = score;
		
	}
	@Override
	public String toString() {
		
		return super.toString() +"나이는 " + age + "세 이고 점수는 " + score +"점 입니다.";
	}

	public static void main(String[] args) {
		SuperTest ob1 = new SuperTest("뽀로로","대흥동");
		System.out.println(ob1);
		
		SubTest ob2 = new SubTest("크롱", "대현동", 23, 85.4);
		System.out.println(ob2);
	}

}
