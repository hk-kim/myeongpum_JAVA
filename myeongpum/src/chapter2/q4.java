package chapter2;

import java.util.Scanner;

/*
 * 369������ ������ �ۼ��غ���. 1~99������ ������ Ű����κ��� �Է¹ް� ������
 * 3,6,9 �� �ϳ��� �ִ� ���� "�ڼ�¦"�� ����ϰ� �� �� �ִ� ���� "�ڼ�¦¦"��
 * ����ϴ� ���α׷��� �ۼ��϶�. ���� ��� Ű����� �Էµ� ���� 13�� ��� "�ڼ�¦"��
 * 36�� ��� "�ڼ�¦¦"�� ����ϸ� �ȴ�.
 */
public class q4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int val = in.nextInt();
		int cnt = 0;
		
		int f_num = val/10;
		if(f_num == 3 || f_num == 6 || f_num == 9)
		{
			cnt++;
		}
		
		int s_num = val%10;
		if(s_num == 3 || s_num == 6 || s_num == 9)
		{
			cnt++;
		}
		
		if(cnt == 1) {
			System.out.println("�ڼ�¦");
		}
		else if(cnt == 2)
		{
			System.out.println("�ڼ�¦¦");
		}
			
	}
	
}
