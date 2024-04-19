package product;
import java.util.*;

import sale.Sub;

public class Main {

	public static void main(String[] args) {
			      boolean run = true;
			      Scanner scanner = new Scanner(System.in);
			      ProductDAO dao=new ProductDAO();
			      
			      while(run) {
			         System.out.println("\n=======================================");
			         System.out.println("1.등록|2.조회|3.목록|4.삭제|5.수정|6.매출관리|0.종료");
			         System.out.println("=========================================");
			         System.out.println("선택>");
			         String menu= scanner.nextLine();
			         switch(menu) {
			         case "6" :
			        	 
			        	 Sub.run();
			        	 break;
			         	case "5" :
			         		System.out.print("수정할상품 코드>");
			         		String code5=scanner.nextLine();
			         		ProductVO vo5=dao.read(code5);
			         		if(vo5.getCode()==null) {
			         			System.out.println(code5+"존재하지않음");
			         		}else {
			         			System.out.print("이름:"+vo5.getName()+">");
			         			String name5=scanner.nextLine();
			         			if(!name5.equals(""))vo5.setName(name5);
			         			
			         			while(true) {
				         			System.out.print("상품단가:"+vo5.getPrice()+">");
				         			String price5=scanner.nextLine();
				         			if(price5.equals("")) {//엔터친경우
				         				break;
				         			}
				         			if(isNumber(price5)) {//숫자친경우
				         				vo5.setPrice(Integer.parseInt(price5));
				         				break;
				         			}
			         			}//가격입력 while
			         			System.out.println(vo5.toString());
			         			System.out.print("정말로수정?(y)?");
			         			String sel5=scanner.nextLine();
			         			if(sel5.equals("Y")||sel5.equals("y")) {
			         				//수정
			         				dao.update(vo5);
			         				System.out.println("수정완료!");
			         			}else {
			         				System.out.println("수정취소");
			         			}
			         		}
			        	 break;
			            case "1" :
			            	ProductVO vo1=new ProductVO();
			            	vo1.setCode(dao.getCode());
			            	System.out.println("상품코드:"+vo1.getCode());
			            	System.out.print("상품이름>");
			            	String name1=scanner.nextLine();
			            	if(name1=="") {
			            		System.out.println("상품등록취소");
			            		break;
			            	}else {
			            		vo1.setName(name1);
			            	}
			            	while(true) {
				            	System.out.println("가격>");
				            	String price1=scanner.nextLine();
				            	if(price1=="") {
				            		System.out.println("상품등록취소");
				            		break;
				            	}
				            	if(isNumber(price1)) {
				            		vo1.setPrice(Integer.parseInt(price1));
				            		dao.insert(vo1);
				            		System.out.println("완료!");
				            		break;
				            	}
			            	}
			            	System.out.println(vo1.toString());
			               break;
			            case "2" :
			            	while(true) {
				            	System.out.print("조회할상품코드>");
				            	String code2=scanner.nextLine();
				            	if(code2=="") {
				            		System.out.println("조회작업취소");
				            		break;
				            	}
				            	ProductVO vo2=dao.read(code2);
				            	if(vo2.getCode()==null) {
				            		System.out.println(code2+"존재하지않음");
				            	}else {
				            	System.out.println(vo2.toString());
				            	}
			            	}
			               break;
			            case "3" :
			            	ArrayList<ProductVO> array=dao.list();
			            	for(ProductVO vo:array) {
			            		System.out.println(vo.toString());
			            	}
			               break;
			            case "4" :
			            	System.out.print("delete code>");
			            	String code4=scanner.nextLine();
			            	ProductVO vo4=dao.read(code4);
			            	if(vo4.getCode()==null) {
			            		System.out.println(code4 + "번상품이 존재하지않음");
			            	}else {
			            		System.out.println(vo4.toString());
			            		System.out.print("정말로삭제하실래요(y)?");
			            		String sel=scanner.nextLine();
			            		if(sel.equals("Y")||sel.equals("y")) {
			            			if(dao.delete(code4)) {
			            				System.out.println("상품정보삭제완료");
			            			}else {
			            				System.out.println("상품정보삭제실패");
			            			}
			            		}else {
			            			System.out.println("취소");
			            		}
			            	}
			               break;
			            case "0" :
			               System.out.println("프로그램을 종료합니다.");
			               run = false;
			               break;
			            default:
			               System.out.println("0~4 메뉴를 입력하세요!");
			               break;
			         }//switch   
			      }//while
			   }//method
				public static boolean isNumber(String str) {
					try {
						Integer.parseInt(str);
						return true;
					}catch(Exception e) {
						System.out.println("new number");
						return false;
					}
				}
			}//class
