package lang;
/* @ Date : 2015.06.29
 * @ Author : ����
 * @ Story : 	equals() Ȱ�� ����		*/
public class Person {
	private String ssn;	// �ֹι�ȣ
	public Person(String ssn) {
		this.ssn = ssn;	//	�¾�ڸ��� �ֹι�ȣ ����
	}
	public String getSsn() {
		return ssn;
	}
	@Override
	public boolean equals(Object obj) {
		/*	Object �� ��� ������ Ÿ���� �ǹ��ϱ� ������
		 *  �ݵ�� �ֹι�ȣ�� ������ �ִ� Person ������
		 *  Ȯ���ؾ� �ֹι�ȣ ��ġ���θ� ���� �� �ֱ� ������
		 *  ��ü ĳ���� ������ instanceof �� ����Ѵ�.
		 *  �̷� ����� Valudation �� ��ȿ�� üũ��� �Ѵ�. 		 */
		boolean flag = false;	// �������� �ʱ�ȭ
		if (obj != null && obj instanceof Person) {
			/*	�� ������� �ǹ̴� obj �� null�� �ƴϸ鼭 Person�� �ν��Ͻ�����
			 * true�� �����Ѵ�.			 */
			return ssn == ((Person)obj).ssn;
			/* Ŭ�������� equals �� �������̵� �� ��� ���� ����ó�� �ۿ��Ѵ�.!!! 	*/
		} else {
			return flag;	// false�� �ʱ�ȭ ������ false �� ����
		}
	}
}
