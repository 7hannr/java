package pm;

import java.util.*;

public class Sub03 {
	public static void run() {
		boolean run=true;
		Scanner scan=new Scanner(System.in);
		ArrayList<String> names=new ArrayList<>();
		ArrayList<String> jusos=new ArrayList<>();
		names.add("홍길동");jusos.add("인천서구경서동");
		names.add("심청이");jusos.add("서울 강남구 압구정동");
	
		while(run) {
			System.out.println("---------------------------------------");
			System.out.println("1.주소등록|2.이름검색|3.주소목록|4.주소삭제|0.종료");
			System.out.println("---------------------------------------");
			System.out.print("선택>");
			String menu=scan.nextLine();
			switch(menu) {
			case "0":
				run=false;
				System.out.println("종료");
				break;
			case "1":
				System.out.print("이름>");
				names.add(scan.nextLine());
				System.out.print("주소>");
				jusos.add(scan.nextLine());
				System.out.println("입력완료>");
				break;
			case "3":
				for(int i=0; i<names.size(); i++) {
					System.out.printf("%s\t%s\n",names.get(i),jusos.get(i));
				}
				System.out.println(jusos.size() + "명이 존재함");
				break;
			case "2":
				while(true) {
				System.out.print("검색할이름>");
				String sname=scan.nextLine();
				if(sname=="") {
				 System.out.println("검색종료");
				 break;
				}
				boolean find=false;
				for(int i=0;i<names.size();i++) {
					String name=names.get(i);
					if(sname.equals(name)) {
						System.out.println("주소:" + jusos.get(i));
						find=true;
					}
				}
				if(!find) {
					System.out.println(sname + " 존재하지않음");
				}
			}
				break;
			case "4":
				System.out.println("삭제할이름>");
				String rname=scan.nextLine();
				boolean find=false;
				for(int i =0;i<names.size();i++) {
					String name=names.get(i);
					if(rname.equals(name)) {
						System.out.println("주소:" + jusos.get(i));
						find=true;
						System.out.print("삭제할내용(Y/y)?");
						String answer=scan.nextLine();
						if(answer.equals("Y") || answer.equals("y")) {
							names.remove(i);
							jusos.remove(i);
							System.out.println("삭제완료");
							break;
						}else {
							System.out.println("삭제취소");
						}
					}
				}
				if(find) {
					System.out.println(rname + "이(가) 존재하지않습니다");
				}
				break;
				default:
					System.out.println("0~4번메뉴선택");
			
			}
		}
	}
}