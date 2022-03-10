package 과제13;
/*
 * [문제 59] 다음 프로그램을 작성하시오
(1) 프로젝트명 : MemberProject
(2) 테이블명: member
   컬럼명 :     idx     숫자, 기본키
                   name  가변형(15),널값허용안함
                   phone 가변형(15)
   시퀀스 : mp_idx (1부터 1씩증가)
   입력자료 :  강호동  010-123-4567
                   홍길동  011-789-4561

(3)구조
   MemberProject
      src 
        table_schma
               member.sql
        common
               MyConnectionPool.java
        com.edu.view
               MemberMain.java   <---main()메서드
	 		   MemberView.java  
        com.edu.entity
              MemberEntity.java
        com.edu.dao
              MemberDAO.java
        com.edu.controller
              MemberController.java     

(4)조건
     1) MemberMain : 입력 코드를 완성한다
         menu()는 MemberMain에서 만들고, 모든 결과 출력은 MemberView에서 한다       
     2) MemberEntity 
            -idx:int    
            -name:String    
            -phone:String
            +MemberEntity()
            +MemberEntity(idx:int,name:String,phone:String)
            +getter & setter
      3) MemberController
            +MemberController() 
            +getMemberList():void
            +getMember(name:String):void            
            +insertMember(ob:MemberEntity):void             
            +deleteMember(name:String):void
      4) MemberDAO 
            +getMemberList():ArrayList<MemberEntity>      ==> 전체보기
            +getMember(name:String):MemberEntity          ==> 찾기
            +insertMember(ob:MemberEntity):int                ==> 추가
            +deleteMember(name:String):int                       ==> 삭제 
 */
public class Test59 {
	public static void main(String[] args) {
		//                       --MemberProject--
	}
}
