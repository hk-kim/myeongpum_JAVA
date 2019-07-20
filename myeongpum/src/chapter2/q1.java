package chapter2;

import java.util.Scanner;

/* 실습문제1
 * Sanner 클래스를 이용하여 키보디ㅡ에서 영문자 한자를 입력받아 소문자이면
 * 대문자로 대문자이면 소문자로 변환하여 출력하는 프로그램을 작성하라.
 * 입력도니 문자가 영문자가 아니면 "영문자가 아닙니다"를 출력하라. * 
 */

public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);		
		String val = in.next();		
		int ch = val.charAt(0);
				
		if(ch >= 97 && ch <= 122)
		{
			ch -= 32;
			System.out.println((char)ch);
		}
		else if(ch >= 65 && ch <= 97)
		{
			ch += 32;
			System.out.println((char)ch);
		}
		else {
			System.out.println("영문자가 아닙니다.");
		}

	}

}
