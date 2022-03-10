package test5;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentTest {

	public static void main(String[] args) throws IOException {
		  FileReader fr = new FileReader("src/test5/student.dat");
          FileWriter fw = new FileWriter("src/test5/backup.dat", true);
          Scanner sfi = new Scanner(fr);
          List<Student> list=new ArrayList<Student>();

          while (sfi.hasNextLine() == true) { // End of File
              /* 코드  작성*/
        	  
        	  String line=sfi.nextLine();
        	  StringTokenizer token=new StringTokenizer(line, "-:/");
        	  
        	  String name=null;
        	  int kor=0, eng=0, mat=0;
        	  
        	  name=token.nextToken();
        	  token.nextToken();
        	  kor=Integer.parseInt(token.nextToken());
        	  token.nextToken();
        	  eng=Integer.parseInt(token.nextToken());
        	  token.nextToken();
        	  mat=Integer.parseInt(token.nextToken());
        	  
//        	  System.out.println(name);
        	  Student stu=new Student(name, kor, eng, mat);
        	  list.add(stu);
          }
          int sumKor=0, sumEng=0, sumMat=0;
          double avgKor=0, avgEng=0, avgMat=0;
          
          for(int i=0; i<list.size();i++) {
        	  // 과목별 총합, 평균
        	  Student st=list.get(i);
        	  sumKor+=st.getKor();
        	  sumEng+=st.getEng();
        	  sumMat+=st.getMat();
          }
			/*
			for(Student st:list) {
			  // 과목별 총합, 평균
			  sumKor+=st.getKor();
			  sumEng+=st.getEng();
			  sumMat+=st.getMat();
			}
			*/
          avgKor=sumKor/list.size();
          avgEng=sumEng/list.size();
          avgMat=sumMat/list.size();
			/*
			===========================
			총학생수 =5명
			국어 총합 = 423 국어 평균= 84
			영어 총합 = 411 영어 평균= 82
			수학 총합 = 462 수학 평균= 92
			===========================
			*/
          fw.write("===========================\n");
          fw.write("총학생수 ="+list.size()+"명\n");
          fw.write("국어 총합 = "+sumKor+" 국어 평균= "+avgKor+"\n");
          fw.write("영어 총합 = "+sumEng+" 영어 평균= "+avgEng+"\n");
          fw.write("수학 총합 = "+sumMat+" 수학 평균= "+avgMat+"\n");
          fw.write("===========================");
          
          fw.close();
          sfi.close();
          fr.close();
          
          System.out.println("backup.dat파일이 생성되었습니다");
        
          
          
	}

}
