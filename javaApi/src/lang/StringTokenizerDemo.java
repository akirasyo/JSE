package lang;
/* @ Date : 2015.06.29
 * @ Author : 구로
 * @ Story : 	concat() 문법	*/
import java.util.StringTokenizer;

public class StringTokenizerDemo {
	public static void main(String[] args) {
		/*	문자열을 나누는데 있어서 구분자가 존재하지 않고
		 * 	공백만 있는 경우 StringTokenizer 를 사용한다.		 */
		StringTokenizer tok = new StringTokenizer("Hello Java");
		while (tok.hasMoreTokens()) {
			String token = (String)tok.nextElement();
			System.out.print("\t" + token);
		}
	}
}
