package chapter2;

import java.util.Scanner;

/* �ǽ�����1
 * Sanner Ŭ������ �̿��Ͽ� Ű����ѿ��� ������ ���ڸ� �Է¹޾� �ҹ����̸�
 * �빮�ڷ� �빮���̸� �ҹ��ڷ� ��ȯ�Ͽ� ����ϴ� ���α׷��� �ۼ��϶�.
 * �Էµ��� ���ڰ� �����ڰ� �ƴϸ� "�����ڰ� �ƴմϴ�"�� ����϶�. * 
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
			System.out.println("�����ڰ� �ƴմϴ�.");
		}

	}

}
