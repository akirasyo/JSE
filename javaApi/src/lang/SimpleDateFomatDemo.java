package lang;

import java.text.SimpleDateFormat;
import java.util.Date;

/* @ Date : 2015.06.29
 * @ Author : 구로
 * @ Story : 	Call By Value 예제 - 날짜 표현		*/
public class SimpleDateFomatDemo {
	 public static void main(String[] args) {
		 // import 단축키 : 	CTRL + SHIFT + O
		Date today = new Date();
		SimpleDateFormat date01,date02,date03,date04	;
		// MM은 월 , mm은 시간의 분
		date01= new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(date01.format(today));
		date02= new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
		System.out.println(date02.format(today));
		date03 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(date03.format(today));
		// a는 오전,오후 표시
		date04 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
		System.out.println(date04.format(today));
	}
}