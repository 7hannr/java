package am;

import java.util.ArrayList;

public class Sub02 {
	public static void run() {
		ArrayList<Student> students=new ArrayList<>();
		students.add(new Student("100","홍길동","인천","010-1010-1010"));
		students.add(new Student("101","강감찬","서울","010-2020-2020"));
		students.add(new Student("102","이순신","부산","010-3030-3030"));
		
		for(Student s:students) {
			s.print();
		}
		for(int i=0;i<students.size();i++) {
			Student s=students.get(i);
			s.print();
		}
	}
}		
		
		//System.out.println("클래스란?");
		//Student s1=new Student();//생성자
		//s1.no="100";
		//s1.name="홍길동";
		//s1.juso="인천";
		//s1.phone="010-1234-5678";
		//s1.print();
		//System.out.println("====================");
		//Student s2=new Student("101","이순신");//생성자2
		//s2.juso="서울";
		//s2.phone="010-2342-3453";
		//s2.print();
		//System.out.println("====================");
		//Student s3=new Student("학번","강감찬","부산","010-2020-2020");
		//s3.print();
	
