package ex01;

import java.util.Scanner;

public class Sub07 {
	public static void run() {
		Scanner s=new Scanner(System.in);
		boolean run=true;
		while(run) {
			System.out.println("=================================================");
			System.out.println("1~100까지의 합계|2.100까지홀수합계|3.100까지 짝수합계|0.종료");
			System.out.println("=================================================");
			System.out.println("선택>");
			String menu=s.nextLine();
			switch(menu) {
			case "1":
				int sum=0;
				for(int i=1; i<=100; i=i+1) { //1씩 증가시켜서 i에저장
				//System.out.println(i);
				sum=sum+i; //i에대한 합계를 sum에다 저장
				
				}
				System.out.println("1~100까지합계:" + sum);
				break;
			case "2":
				sum=0;
				for(int i=1; i<=100; i=i+2) {
					sum=sum+i;
				}
				System.out.println("1~100까지 홀수합계:"+sum);
				break;
			case "3":
				sum=0;
				for(int i=0; i<=100; i=i+2) {
					sum=sum+i;
				}
				System.out.println("1~100 짝수합계:"+sum);
				break;
			case "0":
				System.out.println("프로그램종료");
				run=false;
			default:
				System.out.println("0~3번 메뉴를 선택하세요");
			}
			
		}
	}
}
