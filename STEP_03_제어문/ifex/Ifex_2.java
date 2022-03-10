package ifex;

//중첩 if문 : if문안에 또 다른 if문이 존재
public class Ifex_2 {

	public static void main(String[] args) {
		int age = 15;
		
		if (age <= 19) {
			System.out.println("애들은 가라~");
		}else {
			if(age >= 30) {
				System.out.println("국빈관으로 가세요~");
			}
			else {
				System.out.println("어세오세요~");
			}
		}
	}

}
