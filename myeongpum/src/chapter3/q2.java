package chapter3;

import java.util.Scanner;

/*
 * 키보드로부터 임의의 문자를 입력받고 그 문자보다 알파벳 순위가 낮은 모든 문자를
 * 출력하는 프로그램을 작성하라.
 */
public class q2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		char ch = in.next().charAt(0);
		
		if(ch >= 65 && ch <= 90) {
			int sub = ch - 64;
			for(int i=0; i<sub; i++) {
				for(int j=65; j<=ch-i; j++) {
					System.out.print((char)j);
				}
				System.out.println("");
			}
		}
		else if(ch >= 97 && ch <= 122) {
			int sub = ch - 96;
			for(int i=0; i<sub; i++) {
				for(int j=97; j<=ch-i; j++) {
					System.out.print((char)j);
				}
				System.out.println("");
			}
		}
		
		in.close();
	}
}
