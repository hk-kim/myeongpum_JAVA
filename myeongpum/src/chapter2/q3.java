package chapter2;
/*
 * Ű���忡�� ������ �� ���� �׼��� �Է¹޾� ���� ����, �� ����, õ ����, 500��¥��
 * ����, 100��¥�� ����, 50��¥�� ����, 10��¥�� ����, 1��¥�� ���� �� �� ���� ��ȯ
 * �Ǵ��� ����϶�.
 */

import java.util.Scanner;

public class q3 {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		int val = in.nextInt();
		int cnt = 0;
		int flag = 0;
		for (int i = 50000; i >= 1;) {
			cnt = val / i;
			System.out.println(i + "���� : " + cnt);

			val = val - cnt * i;

			if (flag % 2 == 0 && i > 10) {
				i /= 5;
			} else if (flag % 2 == 1 && i > 10) {
				i /= 2;
			} else if (i <= 10) {
				i /= 10;
				flag += 2;
				continue;
			}

			flag++;

		}

	}
}
