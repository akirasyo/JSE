package lang;

import test.CardVO;

/*	import ����Ű : CTRL + SHIFT + O	*/
/* @ Date : 6.26
 * @ Author : ����
 * @ Story : 		*/
public class ObjectClass {
	public static void main(String[] args) {
		/* toString() : �ؽ��ڵ�(��ü �ּҰ�)�� �����ϴ� �޼ҵ�.
		 * 				���� �Ϲ� ��ü������ �̸� �������̵� �ؼ� �����		 */
		CardVO card1 = new CardVO("��Ʈ", 6);
		System.out.println(card1);
	}
}