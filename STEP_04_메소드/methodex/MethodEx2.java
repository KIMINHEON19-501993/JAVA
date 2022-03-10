package methodex;

public class MethodEx2 {
//call by name
	
	public static int view1() {
		return 10;
	}
	public static char view2() {
		return 'A';
	}
	public static double view3() {
		return 10.1;
	}
	public static String view4() {
		return "A" + " " + "B";
	}
	public static float view5() {
		return 1.1f;
	}
	public static boolean view6() {
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(view1());
		System.out.println(view2());
		System.out.println(view3());
		System.out.println(view4());
		System.out.println(view5());
		System.out.println(view6());
		
		
	}
}
