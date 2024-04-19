package pm;

import java.util.*;

public class Sub01 {
	public static void run() {
		Scanner scan=new Scanner(System.in);
		// TODO Auto-generated method stub
			ArrayList<String> names=new ArrayList<>();
			names.add("홍길동");//숫자못들어감 string 있어서//데이터 입력
			names.add("심청이");
			names.add("강감찬");
			names.add("성춘향");
			names.add("이몽룡");
			
			names.remove(1);//데이터 삭제
			
			for (int i=0;i<names.size();i++) {//데이터 전체출력
				String name=names.get(i);
				System.out.println(name);
			}	
			//이름검색
			while(true) {
			System.out.print("검색할이름>");
			String sname=scan.nextLine();
			if(sname=="") {
				System.out.println("검색종료");
				break;
			}
			int index=-1;
			//boolean find=false;
			for(int i=0;i<names.size();i++) {
				String name=names.get(i);
				if(sname.equals(name)) {
					index=i+1;
					//find=true;
					System.out.println("존재");
				}
			}
			if(index==-1) {
				System.out.println("존재하지않습니다");
			}else {
				System.out.println(index + "번째 존재함");
			}
		}
	}
}
