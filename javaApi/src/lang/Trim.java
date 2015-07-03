package lang;
/* @ Date : 2015.06.29
 * @ Author : 구로
 * @ Story : trim()(공백제거) 문법		*/
public class Trim {
	public static void main(String[] args) {
		String str = "     Hello     Java     World !!                   ";
		System.out.println(str.trim());
		//	Trim() 은 리터럴값의 앞뒤 공백을 없애는 기능을 한다.
		/*	메소드 체인기업 
		 * 	- 리턴값이 String 이라면 String 의 메소드들을 연결해서 사용할 수 있는데
		 * 		이것을 메소드 체인이라고 한다.		 */
		System.out.println(str.trim().replace("Java", "JSP"));
	}
}
