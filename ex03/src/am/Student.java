package am;

public class Student {
	//필드(속성)
	String no;
	String name;
	String juso;
	String phone;
	
	//생성자
	public Student() {
		
	}
	
	//생성자3
	public Student(String no, String name, String juso, String phone) {
		super();
		this.no = no;
		this.name = name;
		this.juso = juso;
		this.phone = phone;
	}


	//메서드
	public void print() {
		System.out.printf("학번:%s\n이름:%s\n주소:%s\n전화:%s\n",
				no,name,juso,phone);
	}
	
	//생성자2
	public Student(String no, String name) {
		//super();
		this.no = no;
		this.name = name;
	}
}
