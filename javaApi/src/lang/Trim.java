package lang;
/* @ Date : 2015.06.29
 * @ Author : ����
 * @ Story : trim()(��������) ����		*/
public class Trim {
	public static void main(String[] args) {
		String str = "     Hello     Java     World !!                   ";
		System.out.println(str.trim());
		//	Trim() �� ���ͷ����� �յ� ������ ���ִ� ����� �Ѵ�.
		/*	�޼ҵ� ü�α�� 
		 * 	- ���ϰ��� String �̶�� String �� �޼ҵ���� �����ؼ� ����� �� �ִµ�
		 * 		�̰��� �޼ҵ� ü���̶�� �Ѵ�.		 */
		System.out.println(str.trim().replace("Java", "JSP"));
	}
}
