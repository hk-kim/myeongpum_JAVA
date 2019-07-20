package chapter2;
/*
 * 키보드에서 정수로 된 돈의 액수를 입력받아 오만 원권, 만 원권, 천 원권, 500원짜리
 * 동전, 100원짜리 동전, 50원짜리 동전, 10원짜리 동전, 1원짜리 동전 각 몇 개로 변환
 * 되는지 출력하라.
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
			System.out.println(i + "원권 : " + cnt);

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
