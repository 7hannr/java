package am;

public class Score {
	//필드(속성)
	String name;
	int kor;
	int eng;;
	int mat;
	
	//생성자
		public Score() {
			
		}
		public Score(String name, int kor, int eng, int mat) {
			super();
			this.name = name;
			this.kor = kor;
			this.eng = eng;
			this.mat = mat;
		}
	//메서드
		public int total() { //돌려줄값이 없을때 void in<double이큼
			int total=kor+eng+mat;
			return total;
			
		}
		
		public double avg() {
			return(kor+eng+mat)/3.;
		}
		
		public void print() {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%s\n",
					name,kor,eng,mat,total(),avg(),grade());
		}
		
		public String grade(){
		      String grade="F";
		      if (avg()>=95) {grade="A+";} 
		      else if (avg()>=90) {grade="A0";} 
		      else if (avg()>=85) {grade="B+";} 
		      else if (avg()>=80) {grade="B0";}
		      else if (avg()>=75) {grade="C+";} 
		      else if (avg()>=70) {grade="C0";} 
		      else if (avg()>=65) {grade="D+";} 
		      else if (avg()>=60) {grade="D0";} 
		      return grade;
		}
	}

