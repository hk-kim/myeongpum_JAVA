package chapter3;
/*
 * Ű����κ��� 0���� ū ������ ������ �Է¹ް� �� ������ �������� ����ϰ� 
 * ���� ���� ��� �ִ� 1�� ������ ����϶�
 */
import java.util.Scanner;

public class q3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		String b_num = Integer.toBinaryString(num);
		System.out.println(b_num);
		
		int cnt = 0;
		
		for(int i=0; i<b_num.length(); i++) {
			if(b_num.charAt(i) == '1') {
				cnt ++;
			}
		}
		System.out.println("1�� ���� : " + cnt);
		in.close();
	}
}
