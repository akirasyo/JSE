package lang;
/* @ Date : 2015.06.29
 * @ Author : ����
 * @ Story : 	concat() ����	*/
/*	concat() �� ���ͷ� Ÿ���� ��������� ��ġ�� �޼ҵ� 	*/
public class Concat {
	public static void main(String[] args) {
		String str1 = "�ڹ�";
		String str2 = " �н��� ";
		String str3 = str1 + str2	;
		System.out.println(str3);
		String str4 = "API��";
		System.out.println(str1.concat(str4.concat(str2)));
	}
}