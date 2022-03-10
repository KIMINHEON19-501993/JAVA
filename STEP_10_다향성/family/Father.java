package family;

public class Father extends Family implements Job {
	public Father() {
		// TODO 자동 생성된 생성자 스텁
	}

	public Father(String name) {
		super(name);
		// TODO 자동 생성된 생성자 스텁
	}

	public String toString() {
		return super.toString() + work();
	}

	@Override
	public String work() {
		return "아빠는 나가서 일을 한다.";
	}

}
