package family;

public class Mother extends Family implements Job {
	public Mother() {
		// TODO 자동 생성된 생성자 스텁
	}

	public Mother(String name) {
		super(name);
		// TODO 자동 생성된 생성자 스텁
	}

	public String toString() {
		return super.toString() + work();
	}

	@Override
	public String work() {
		return "엄마는 집안일을 한다.";
	}

}
