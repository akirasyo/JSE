package lang;

import test.CardVO;

/*	import 단축키 : CTRL + SHIFT + O	*/
/* @ Date : 6.26
 * @ Author : 구로
 * @ Story : 		*/
public class ObjectClass {
	public static void main(String[] args) {
		/* toString() : 해시코드(객체 주소값)을 리턴하는 메소드.
		 * 				따라서 일반 객체에서는 이를 오버라이딩 해서 사용함		 */
		CardVO card1 = new CardVO("하트", 6);
		System.out.println(card1);
	}
}