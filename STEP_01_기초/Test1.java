package STEP_01_기초;

//각각변수를 만들어서 값을 대입하고 결과를 출력

public class Test1 {

	public static void main(String[] args) {

		String name = "강호동";
		String gender = "남자";
		double score = 85.35;

		System.out.printf("이름은 %s이며 성별은 %s이고\n입시성적은 %.2f점입니다.", name, gender, score);
	}

}
