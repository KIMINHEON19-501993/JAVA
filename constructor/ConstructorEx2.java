package constructor;

//�����ڰ� ������ �϶� �ٸ� �������� ȣ���� ����
//this() ���
//��ü�� �ڱ��ڽ��� �����Ҷ� ����ϴ� this�� �����ڸ� ȣ���ϱ� ���� this() ���·� ���, �޼���� �ƴ�
//this() ������ ȣ���� ������ ������ ����
//������ ���ο��� �ֻ�ܿ� ��ġ �ؾ��Ѵ�.

//--------------------------------------------------------------4
public class ConstructorEx2 {

	public ConstructorEx2() {
		
		System.out.println("default constructor");//4 ��� �� ȣ���� ������ �ǵ��ư�
	}
	public ConstructorEx2(int n) {
		this("������", n);//2 this() ������ ȣ�� �Ű����� 2���ΰ� �̷� �̵�
		System.out.println(n + " constructor");//6 ��� �� ȣ���� ������ �ǵ��ư�
	}
	
	public ConstructorEx2(String str, int n) {
		this();//3. this() ������ ȣ�� �Ű����� 0���ΰ� �̷� �̵�
		System.out.println(str + " " + n +" constructor");//5 ��� �� ȣ���� ������ �ǵ��ư�
	}

	public static void main(String[] args) {
		
		new ConstructorEx2(10);//1, 7
		//1.����(�Ű����� 1���ΰ����� �̵�), 7.����
	}
}	


//--------------------------------------------------------------3
//public class ConstructorEx2 {
//
//	public ConstructorEx2() {
//		this("������", 10);//2. this()������ ȣ��, �Ű����� 2����(String,int)������ �̵�
//		System.out.println("default constructor");//6 ��� �� ȣ���� ������ �ǵ��ư�
//	}
//
//	public ConstructorEx2(String str) {
//		
//		System.out.println(str + " constructor");//4 ��� �� ȣ���� ������ �ǵ��ư�
//	}
//
//	public ConstructorEx2(String str, int n) {
//		this(str);//3.this()������ ȣ�� �Ű������� 1����(String)�� �̷� �̵�
//		System.out.println(str + " " + n +" constructor");//5 ��� �� ȣ���� ������ �ǵ��ư�
//	}
//
//	public static void main(String[] args) {
//		
//		new ConstructorEx2();//1, 7
//		//1.����, 7.����
//	}
//	


//--------------------------------------------------------------2
//	public class ConstructorEx2 {
//
//		public ConstructorEx2() {
//			this("������", 10);//2
//			System.out.println("default constructor");//6
//		}
//
//		public ConstructorEx2(String str) {
//			
//			System.out.println(str + " constructor");//4
//		}
//
//		public ConstructorEx2(String str, int n) {
//			this(str);//3
//			System.out.println(str + " " + n +" constructor");//5
//		}
//
//		public static void main(String[] args) {
//			
//			new ConstructorEx2();//1, 7
//		}
//}	


//--------------------------------------------------------------1
//public class ConstructorEx2 {
//	public ConstructorEx2() {
//		System.out.println("default constructor");//4
//	}
//
//	public ConstructorEx2(String str) {
//		this();//3
//		System.out.println(str + " constructor");//5
//	}
//
//	public ConstructorEx2(String str, int n) {
//		this(str);//2
//		System.out.println(str + " " + n +" constructor");//6
//	}
//
//	public static void main(String[] args) {
//		
//		new ConstructorEx2("������",10);//1, 7
//	}
//}
