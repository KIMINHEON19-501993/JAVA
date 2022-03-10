package 과제11;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;



/*
 * [문제 53] 문자열변수에 "10*30*20*40*50"를 대입한후 StringTokenizer클래스를 
         이용하여 다음결과를구하시오

(1) Test53클래스 main()에서 
     String str="10*30*20*40*50";
     //나머지를 완성하시오


[결과화면]
10+30+20+40+50=150
 */

class Test53  {

	public static void main(String[] args) {
		
		String str="10*30*20*40*50";
		String rts = "";
		
		
		int sum = 0;
		StringTokenizer tokens = new StringTokenizer(str, "*");
		
		
		List<Object> list = new ArrayList<Object>();
		
//		while (tokens.hasMoreTokens()) {
//			list.add(Integer.parseInt(tokens.nextToken()));
//		}
		while (tokens.hasMoreTokens()) {
			list.add(Integer.parseInt(tokens.nextToken()));
		}
		
		for (Object object : list) {
			rts = rts + object + " + ";
			sum+= (int)object;
		}
		
		System.out.print(rts.substring(0,rts.length()-3));
		System.out.println(" = " + sum);
		
		
			
		
		
		
	}
}
