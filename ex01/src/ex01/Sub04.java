package ex01;

public class Sub04 {
	public static void run() {
		//산술연산자
		int num1=11;
		int num2=3;
		int sum=num1+num2;
		System.out.println(num1+ "+" + num2 + "=" + sum);
		
		int sub=num1-num2;
		System.out.println(num1+ "-" + num2 + "=" + sub);
		
		int mul=num1*num2;
		System.out.println(num1+ "*" + num2 + "=" + mul);
		
		float div=num1/(float)num2;// 정수끼리나누면 나머지 0 그래서 num2에 float을 붙여야 나머지가나옴 double도가능
		System.out.println(num1+ "/" + num2 + "=" + div);
		
		//관계연산자
		boolean result=num1>num2;
		System.out.println(num1 + "이" + num2 + "보다크다:" + result);
		
		result=num1<num2;
		System.out.println(num1 + "이" + num2 + "보다작다:" + result);
		
		result=num1==num2;
		System.out.println(num1 + "과" + num2 + "같다" + result);
		
		result=num1!=num2;
		System.out.println(num1 + "이" + num2 + "가 같지않다:" + result);
		
		//논리연산자(&&and,||or,!not)
		boolean b1=true;
		boolean b2=false;
		
		result = b1 && b2;
		System.out.println(result);
		result = b1 || b2;
		System.out.println(result);
		result = !b1;
		System.out.println(result);
		
		
		
	}

}
