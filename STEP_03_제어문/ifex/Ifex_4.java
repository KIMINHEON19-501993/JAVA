package ifex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*--중첩 if문을 이용하여 작성
 * 3개 과목의 점수를 입력받아 합격, 불합격을 출력
 * 3개의 과목이 전부 40 이상 이어야 하고 평균의 60점 이상 일때 "합격" 출력
 * 평균이 60점이 넘지만 1개의 과목이라도 40점을 넘지 못하면 과락
 * 평균이 60점을 넘지 못하면 불합격
 * 
 * 국어점수 입력 : 100
 * 영어점수 입력 : 100
 * 수학점수 입력 : 100
 * 결과 : 합격
 *  
 * 국어점수 입력 : 100
 * 영어점수 입력 : 100
 * 수학점수 입력 : 30
 * 결과 : 합격
 * 
 * 국어점수 입력 : 40
 * 영어점수 입력 : 40
 * 수학점수 입력 : 40
 * 결과 : 합격
*/
public class Ifex_4 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int kor;
		int eng;
		int mat;
		int tot;
		double avg;

		System.out.print("국어 점수를 입력 하시오 :");
		kor = Integer.parseInt(br.readLine());
		System.out.print("영어 점수를 입력 하시오 :");
		eng = Integer.parseInt(br.readLine());
		System.out.print("수학 점수를 입력 하시오 :");
		mat = Integer.parseInt(br.readLine());

		tot = kor + eng + mat;
		avg = tot / 3.0;
		
		if (avg >= 60) {
			if (kor >= 40 && eng >= 40 && mat >= 40) {
				System.out.println("합격 입니다.");
			} else {
				System.out.println("과락으로 불합격 입니다.");
			}
		} else {
			System.out.println("불합격 입니다.");
		}

	}

}
