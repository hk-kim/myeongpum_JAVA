package chapter2;

import java.util.Scanner;

/*
 * Ű����� �Է¹��� �ֹι�ȣ���� ���ڿ��� '-'���� �и��Ͽ� �ֹι�ȣ ���ڸ��� ����ϴ� ���α׷��� �ۼ��϶�. 
 * ���� ���ڸ� ������ ������ Scanner Ŭ������ useDelimiter() �޼ҵ带 ����϶�.
 */

public class q2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in).useDelimiter("\\s|-");
		
		String ssn = in.next();
		
		System.out.println(ssn);
		
	}
}
