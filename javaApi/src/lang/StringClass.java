package lang;

import java.util.Arrays;

/* @ Date : 6.29
 * @ Author : 구로
 * @ Story : 	DB연동시 insert 시 사용하는 Arrays 와 split		*/
public class StringClass {
	public static void main(String[] args) {
		String fruit = "apple,banana,cherry,orange";
		String[] fruits = fruit.split(",");
		for (int i = 0; i < fruits.length; i++) {
			//System.out.print(fruits[i] + " \t ");
		}
		System.out.println("Arrays로 출력");
		//String[] fruits2 = fruit.split(",",2);	//	공백을 다 주지 않고 지정값만 줌
		//System.out.println(Arrays.toString(fruits2));
		System.out.println(Arrays.toString(fruit.split(",")));
	}
}
