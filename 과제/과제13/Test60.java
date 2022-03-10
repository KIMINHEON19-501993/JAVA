package 과제13;
/*
 * [문제 60] 다음 프로그램을 작성하시오
(1) 프로젝트명 : ScoreProject
(2) 테이블명: student
   컬럼명 :    mid     숫자, 기본키
                  name  가변형(15),널값허용안함
                  kor     숫자
	    eng    숫자
	    mat   숫자
   시퀀스 : m_mid(1부터 1씩증가)
   입력자료 :  민들래, 90, 88, 75
                   진달래, 80, 88, 65

(3)구조
  ScoreProject
     src 
        table_schma
               student.sql
        common
               JdbcTemplate.java
        com.edu.view
               StudentMain.java   <---main()메서드
	 StudentView.java  
        com.edu.entity
              Student.java
        com.edu.dao
              StudentDAO.java
        com.edu.controller
              StudentController.java     
(4)조건
     1) StudentMain : 입력 코드를 완성한다
         menu()는 StudentMain에서 만들고, 모든 결과 출력은 StudentView에서 한다       

     2) Student
            -mid:int    
            -name:String    
            -kor:int
            -eng:int
            -mat:int
            -rank:int      --순위

            +Student()
            +Student(mid:int,name:String,kor:int,eng:int,mat:int,rank:int)
            +getter & setter
            +getTot():int
            +getAvg():double
            +getGrade():char
            +getResult():String
            +toString():String      ---> 출력문장을 만들어서 리턴(getTot, getAvg,getGrade, getResult이용)

      3) StudentController
            dao:StudentDao
            view:StudentView
            +StudentController()                      --> dao, view객체의 메모리 할당
            +getStudentList():void
            +getStudent(name:String):void            
            +insertStudent(ob:Student):String     --> 국,영,수 점수가 0~100사이인지 확인한후 dao로 값 전달         
	                                                        0~100이외의 값이면 StudentMain으로
				             "입력값에 오류가 있습니다"를 리턴(유효성 검사)
            +deleteStudent(name:String):void
      4) StudentDAO 
            +getStudentList():ArrayList<Student>      ==> 전체보기
            +getStudent(name:String):Student          ==> 찾기
            +insertStudent(ob:Student):int                ==> 추가
            +deleteStudent(name:String):int              ==> 삭제 

      5) StudentView
           +insertStudent(n:int, name:String):void
           +deleteStudent(n:int, name:String):void
           +getStudentList(list:ArrayList<Student>):void
           +getStudent(ob:Student):void
      
      6) StudentMain
          sc:Scanner
          control:StudentController
          entity:Student
          +StudentMain()     -- sc, control, entity 객체의 메모리 할당 또는 초기화
          +menu():void        -- 메뉴화면 만들기  
          +main():void         -- main()에서 아래 코드만 추가하기
                  new StudentMain():menu(); 
 */
public class Test60 {
	public static void main(String[] args) {
		//------ScoreProject--------
	}
}
