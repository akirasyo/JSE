package lang;
/* @ Date : 2015.06.29
 * @ Author : ����
 * @ Story : 	equals() Ȱ�� ����		*/
public class PersonMain {
	public static void main(String[] args) {
		Person p1 = new Person("800101-1234567");
		Person p2 = new Person("800101-1234567");
		String result = "";
		result = (p1 == p2) ? "������" : "�ٸ����"	;
		//���׿�����	:	(�����) ? true �� ��� : false �� ���	;	(if-else ��� �����ϰ� ǥ���� �� ���)
		System.out.println("p1 == p2�� ��� ��� : " + result);
		//	����� �ٸ� ������� ��µǴ� ���� ���� �� �񱳰� �ƴ϶� '==' �� �����ּҰ� ���̱� �����̴�.
		result = (p1.equals(p2)) ? "���� ���" : "�ٸ� ���"	;
		//	�ּҰ� �񱳰� �ƴ� ������ �񱳸� ����
		//	�ּҰ� : call by Reference --> �ڹٿ��� ���� �ּҷ� �޸� ����
		//	������ : call by Value --> C���� ���� �޸𸮸� ����
		System.out.println("p1 == p2�� ��� ��� : " + result);
	}
}