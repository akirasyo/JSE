package lang;
/* @ Date : 2015.06.29
 * @ Author : 구로
 * @ Story : 	equals() 활용 예제		*/
public class Person {
	private String ssn;	// 주민번호
	public Person(String ssn) {
		this.ssn = ssn;	//	태어나자마자 주민번호 생성
	}
	public String getSsn() {
		return ssn;
	}
	@Override
	public boolean equals(Object obj) {
		/*	Object 는 모든 데이터 타입을 의미하기 때문에
		 *  반드시 주민번호를 가지고 있는 Person 인지를
		 *  확인해야 주민번호 일치여부를 따질 수 있기 때문에
		 *  객체 캐스팅 연산자 instanceof 를 사용한다.
		 *  이런 기능을 Valudation 즉 유효성 체크라고 한다. 		 */
		boolean flag = false;	// 지역변수 초기화
		if (obj != null && obj instanceof Person) {
			/*	위 컨디션의 의미는 obj 가 null이 아니면서 Person의 인스턴스여야
			 * true를 리턴한다.			 */
			return ssn == ((Person)obj).ssn;
			/* 클래스에서 equals 를 오버라이딩 할 경우 위의 문장처럼 작용한다.!!! 	*/
		} else {
			return flag;	// false로 초기화 했으니 false 를 리턴
		}
	}
}
