package test;

public class CardVO {
	
	// getter , setter �� ������ �ȵǹǷ� ī���� ���̿� ���ڸ� ���ش�.
	//private String kind; // ī���� ����
	//private int num; // ī���� ����
	// ������ �غ��� ī���� ���ο� ���̴� �����ؾ� �Ѵ�.
	// �׸��� �������� �־�� �Ѵٴ� ���̰�.. �̴� ����� �����ؾ� �Ѵٴ� ���̴�.
	public static final int WIDTH=150, HEIGHT=300; //ī���� ����, ����
	private String msg;
	public String getMsg() {
		return msg;
	}
/*	public void setMsg(String msg) {
		this.msg = msg;
	}*/
	/* msg�� setMsg()�� ����ٴ� ���� ���Ƿ� �޽����� �ٲ� �� ����
	 * ���� �о���⸸ �Ѵٴ� read only�� �ǹ��Ѵ�.
	 */
	public CardVO(String kind, int num) {
		this.msg = kind + ":" + num ;
	}
}
