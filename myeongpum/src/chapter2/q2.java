package chapter2;

import java.util.Scanner;

/*
 * 키보드로 입력받은 주민번호에서 문자열을 '-'으로 분리하여 주민번호 앞자리만 출력하는 프로그램을 작성하라. 
 * 구분 문자를 설정할 떄에는 Scanner 클래스의 useDelimiter() 메소드를 사용하라.
 */

public class q2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in).useDelimiter("\\s|-");
		
		String ssn = in.next();
		
		System.out.println(ssn);
		
	}
}
