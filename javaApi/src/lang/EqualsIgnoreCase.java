package lang;
/* @ Date : 2015.06.29
 * @ Author : ����
 * @ Story : 	��ҹ��� ���� ���ִ� �޼ҵ�		*/
public class EqualsIgnoreCase {
	public static void main(String[] args) {
		System.out.println("HELLO".equals("hello")	? "����" : "�ٸ�");
		// ���ͷ� Ÿ��(String Ÿ��) �� equals �� callByValue �� ��
		// �ֳ��ϸ� ���ͷ��� ��������� �ν��ϱ� ����
		System.out.println("HELLO".equals("HELLO")	? "����" : "�ٸ�");
		System.out.println("HELLO".equalsIgnoreCase("hello")	? "����" : "�ٸ�");
	}
}
