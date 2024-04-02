import java.util.Scanner;
public class Welcome {

		static final int NUM_BOOK =3;
		static final int NUM_ITEM =7;
		

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String[][] mBook=new String[NUM_BOOK][NUM_ITEM];
		

	
		System.out.print("당신의 이름을 입력하세요: ");
		String name = input.next();
	
		
		System.out.print("연락처를 입력하세요: ");
		int phone = input.nextInt(); //숫자만 입력
	
		
		String greeting = "Welcome to Shopping Mall!";
		String tagline = "Welcome to Book Market!!";
		
		boolean quit = false;
		
		while(!quit) {
		
			System.out.println("**************************");
			System.out.println("\t" + greeting);
			System.out.println("\t" + tagline);
			System.out.println("**************************");
			
			/*
			System.out.println("1. 고객 정보 확인하기 \t5. 장바구니에 항목 추가하기");
			System.out.println("2. 장바구니 상품 목록 보기 \t6. 장바구니의 항목 수량 줄이기");
			System.out.println("3. 장바구니 비우기 \t7. 장부구니의 항목 삭제하기");
			System.out.println("4. 영수증 표시하기 \t8. 종료");
			System.out.println("*************************");
			*/
	
			menuIntro();
			
			System.out.println("메뉴 번호를 선택하세요: ");
			int choice = input.nextInt(); //숫자만 입력
			
			if(choice < 1 || choice > 8) {
				System.out.println("1부터 8까지 숫자를 입력하세요.");
			} else {
				switch(choice) {
				case 1:
					menuGuestInfo(name, phone);
					break;
				case 2:
					menuCartItemList();
					break;
					
				case 3:
					menuCartClear();
					break;
				case 4:
					menuCartBill();
					break;
				case 5:
					menuCartAddItem();
					break;
				case 6:
					menuCartRemoveItemCount();
					break;
				case 7:
					menuCartRemoveItem();
					break;
				case 8:
				    menuCartExit();
					break;
			
				
				}//switch 끝
				
			}//if-else 끝
		}//while 끝
		
	}// main 함수 끝
	
	/** 
	 * 설명 : Print Menu
	 * 매개변수:
	 * 반환값:
	 */
	
	public static void menuIntro() {
		System.out.println("1. 고객 정보 확인하기 \t5. 장바구니에 항목 추가하기");
		System.out.println("2. 장바구니 상품 목록 보기 \t6. 장바구니의 항목 수량 줄이기");
		System.out.println("3. 장바구니 비우기 \t7. 장부구니의 항목 삭제하기");
		System.out.println("4. 영수증 표시하기 \t8. 종료");
		System.out.println("*************************");
		
	}
	
	public static void menuGuestInfo(name, phone) {
		System.out.println("1. 현재 고객 정보:");
		System.out.println("이름: " + name + "연락처: " + phone);
	}
	
	public static void menuCartItemList() {System.out.println("2. 장바구니 상품 목록 보기:");
}
	public static void menuCartClear() {System.out.println("3. 장바구니 비우기:");
}
	public static void menuCartAddItem() {System.out.println("5. 장바구니 항목 수량 추가하기:");
}
	public static void menuCartRemoveItemCount() {System.out.println("6. 장바구니 항목 수량 줄이기:");
}
	public static void menuCartRemoveItem() {System.out.println("7. 장바구니의 항목 삭제하기:");
}
	public static void menuCartBill() {System.out.println("4. 영수증 표시하기:");
}
	public static void menuCartExit() {System.out.println("8. 종료");
}
	
	/** 
	 * 설명 : 고객님 정보 출력
	 * 매개변수:
	 * - String		name  고객님의 이름
	 * - int 	    phone 휴대 전화번호
	 * 반환값:
	 */
	public static void menuExit() {
		System.out.println("8. 종료");
	}
	public static void BookList(String[][]book) {
		
		book[0][0] ="ISBN1234";
		book[0][1] ="쉽게 배우는 JSP 웹 프로그래밍";
		book[0][2] ="27000";
		book[0][3] ="송미영";
		book[0][4] ="단계별로 쇼핑몰을 구현하며 배우는 JSP 웹 프로그래밍";
		book[0][5] ="IT 전문서";
		book[0][6] ="2018/10/08";
		
		book[1][0] ="ISBN1235";
		book[1][1] ="안드로이드 프로그래밍";
		
		book[1][2] ="33000";
		book[1][3] ="우재남";
		book[1][4] ="실습 단계별 명쾌한 멘토링!";
		book[1][5] ="IT전문서";
		
		book[1][6] ="2022/01/22";
		book[2][0] ="ISBN1236";
		book[2][1] ="스크래치";
		book[2][2] ="22000";
		book[2][3] ="고광일";
		book[2][4] ="컴퓨팅 사고력을 키우는 블록 코딩";
		book[2][5] ="컴퓨터 입문";
		book[2][6] ="2019/06/10";
		
		
		
	}
		
	
				


	
	
} //Welcome 클래스 끝 */
