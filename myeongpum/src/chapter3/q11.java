package chapter3;

import java.util.Scanner;

/*
 * �迭�� �ݺ����� �̿��Ͽ� ���α׷��� �ۼ��غ���. Ű���忡�� ������ �� ���� �׼��� �Է¹޾� 
 * ���� ����, �� ����, õ ����, 500��¥�� ����, 100��¥�� ����, 50�� ¥�� ����, 
 * 10�� ¥�� ����, 1��¥�� ������ �� �� ���� ��ȯ�Ǵ��� ����϶�. 
 * �� �� �ݵ�� ������ �迭�� �̿��ϰ� �ݺ������� �ۼ��϶�.
 * 
 * int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
 */
public class q11 {
	public static void main(String[] args) {
	
		int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		
		Scanner in = new Scanner(System.in);
		
		int input_val = in.nextInt();
		
		calc(unit, input_val);
		
		in.close();
	}
	
	public static void calc(int[] unit, int value) {
		int temp = value;
		int cnt = 0;
		
		for(int u : unit) {
			cnt = temp/u;
			System.out.println(u + "�� : " + cnt);
			
			temp = temp - u*cnt;
			cnt = 0;
		}
	}
}
