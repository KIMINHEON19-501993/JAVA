package family;

public class Son extends Family implements Job {
	public Son() {
		// TODO 자동 생성된 생성자 스텁
	}

	public Son(String name) {
		super(name);
		// TODO 자동 생성된 생성자 스텁
	}

	public String toString() {
		return super.toString() + work();
	}

	@Override
	public String work() {
		return "아들은 공부를 한다.";
	}

}
