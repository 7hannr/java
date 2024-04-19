package am;

import java.util.Scanner;

public class Sub03 {
	public static void run() {
		System.out.println("주소관리");
		Scanner scan=new Scanner(System.in);
		String[] names=new String[100];
		String[] jusos=new String[100];
		String[] phones=new String[100];
		int count=0;
		
		boolean run=true;
		while(run) {
		System.out.println("***************************");
		System.out.println("1.주소등록|2.주소현황|0.종료");
		System.out.println("***************************");
		System.out.print("선택>");
		String menu=scan.nextLine();
		switch(menu) {
		case "1":
			while(true) {
			System.out.println("이름>");
			String name=scan.nextLine();
			if(name=="") {
				System.out.println("입력종료");
				break;
			}
			System.out.println("전화>");
			String phone=scan.nextLine();
			if(phone=="") {
				System.out.println("입력종료");
				break;
			}
			System.out.println("주소>");
			String juso=scan.nextLine();
			if(juso=="") {
				System.out.println("입력종료");
				break;
			}
			names[count]=name;
			jusos[count]=juso;
			phones[count]=phone;
			System.out.println(name + "주소등록");
			count=count+1;
			break;
			}
			
		case "2":
			if(count==0) {
				System.out.println("등록된주소 x");
			}else {
				for(int i=0; i<count; i++) {
					System.out.printf("%s\t%s\t\n",names[i],jusos[i],phones[i]);
				}
				System.out.println(count + "개 존재");
			}
			break;
		case "0":
			run=false;
			break;
			default:
				System.out.println("0~2선택");
		   }
		}
		System.out.println("end");
	}
}
