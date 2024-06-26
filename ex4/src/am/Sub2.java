package am;

import java.util.*;

public class Sub2 {
	public static void run() {
		
		boolean run=true;
		Scanner scan=new Scanner(System.in);
		ArrayList<Juso> jusos=new ArrayList<>();
		Juso juso1=new Juso("홍길동","010-1010-2020","인천");
		jusos.add(juso1);
		juso1=new Juso("심청이","010-2020-2020","서울");
		jusos.add(juso1);
		juso1=new Juso("강감찬","010-3030-3030","부산");
		jusos.add(juso1);
		
		
		while(run) {
			System.out.println("=========================================");
			System.out.println("1.주소등록|2.주소조회|3.주소목록|4.주소삭제|0.종료");
			System.out.println("=========================================");
			System.out.println("선택>");
			String menu=scan.nextLine();
			switch(menu) {
			case "1"://주소등록
				Juso juso=new Juso();
				System.out.print("이름>");
				String name=scan.nextLine();
				juso.setName(name);
				System.out.print("주소>");
				String address=scan.nextLine();
				juso.setAddress(address);
				System.out.print("전화>");
				String phone=scan.nextLine();
				juso.setPhone(phone);
				jusos.add(juso);
				System.out.println(juso.toString()+"\n"+"완료");
				System.out.println("등록된데이터" + jusos.size());
				break;
			case "2"://주소조회
				while(true) {
					System.out.println("조회할이름>");
					String sname=scan.nextLine();
					if(sname=="") break;
					boolean find=false;
					for(Juso j:jusos) {
						if(sname.equals(j.getName())) { //이른 찾은경우
							System.out.println("주소:"+ j.getAddress());
							System.out.println("전화:"+ j.getPhone());
							find=true;
						}//if
					}//for
					if(find==false)System.out.println(sname + "xxxxxxxxxxxxx");
				}//while
				break;
			case "3"://주소목록
				for(Juso j:jusos) {
					System.out.printf("%s\t%s\t%s\n", j.getName(),j.getAddress(),j.getPhone());
				}
				System.out.println("등록된데이터" + jusos.size());
				break;
			case "4"://주소삭제
				System.out.println("삭제할이름>");
				String sname=scan.nextLine();
				boolean find=false;
				for(Juso j:jusos) {
					if(sname.equals(j.getName())) { //이른 찾은경우
						System.out.println("주소:"+ j.getAddress());
						System.out.println("전화:"+ j.getPhone());
						find=true;
						System.out.println("삭제(y)?");
						String ans=scan.nextLine();
						if(ans.equals("y") || ans.equals("Y")) {
							jusos.remove(j);
							System.out.println("완료");
							break;
						}else if (ans.equals("n") || ans.equals("N")) {
							System.out.println("삭제취소!");
						}else {
							System.out.println("취소");
						}//while
					}//if
				}//for
				if(find==false)System.out.println(sname + "xxxxxxxxxxxxx");
				break;
			case "0":
				System.out.println("end");
				run=false;
				break;
			default:
				System.out.println("0~4 choose");
			}
		}//while
	}//run
}//class
