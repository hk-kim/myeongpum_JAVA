package chapter3;

import java.util.Scanner;

/*
 * Ű����κ��� ������ ���ڸ� �Է¹ް� �� ���ں��� ���ĺ� ������ ���� ��� ���ڸ�
 * ����ϴ� ���α׷��� �ۼ��϶�.
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
