package test;

public class CardVO {
	
	// getter , setter 가 있으면 안되므로 카드의 무늬와 숫자를 없앤다.
	//private String kind; // 카드의 무늬
	//private int num; // 카드의 숫자
	// 생각을 해보니 카드의 가로와 높이는 일정해야 한다.
	// 그말은 고정값을 주어야 한다는 뜻이고.. 이는 상수로 선언해야 한다는 뜻이다.
	public static final int WIDTH=150, HEIGHT=300; //카드의 가로, 높이
	private String msg;
	public String getMsg() {
		return msg;
	}
/*	public void setMsg(String msg) {
		this.msg = msg;
	}*/
	/* msg의 setMsg()를 지운다는 것은 임의로 메시지를 바꿀 수 없고
	 * 단지 읽어오기만 한다는 read only를 의미한다.
	 */
	public CardVO(String kind, int num) {
		this.msg = kind + ":" + num ;
	}
}
