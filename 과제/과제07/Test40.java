package 과제07;

//[문제 40 다음 프로그램을 완성하시오
/*
(1)클래스명: Entry
   -word:String 
   +Entry()                               ==>  ***약어사전***  출력
   +Entry(word:String)        ==>  Entry()호출 
   +writeView():void              ==>  약어출력

(2)클래스명: SubEntry   ==> Entry를 상속받음
   -definition:String  
   -year:int
   +SubEntry()
   +SubEntry(word:String)     ==> Entry(String word)   호출 
   +SubEntry(word:String, definition:String, year:int)   ==> SubEntry(String word)호출
   +printView():void      ==> 원어, 시기출력

(3)Test40클래스의  main()함수에서
    SubEntry ob=new SubEntry("OOP","Object Oriented Programming", 1991);
    ob.writeView();
    ob.printView();
public class Test40 {

	public static void main(String[] args) {
		

	}
}
*/
class Entry {
	private String word;

	public Entry() {	
		System.out.println("***약어사전***");
	}

	public Entry(String word) {
		this();
		this.word = word;		
	}

	public void writeView() {
		System.out.println("약어 : " + word);
	}
}

class SubEntry extends Entry{
	private String definition;
	
	private int year;

	public SubEntry() {
		
	}

	public SubEntry(String word) {
		
		super(word);
		
	}

	public SubEntry(String word, String definition,int year) {
		this(word);
		
		this.definition = definition;
		this.year = year;
	}

	public void printView() {
		System.out.println("원어 : " + definition);
		System.out.println("시기 : " + year);
	}
}

public class Test40 {

	public static void main(String[] args) {
		SubEntry ob = new SubEntry("OOP", "Object Oriented Programming", 1991);
		ob.writeView();
		ob.printView();
	}

}
