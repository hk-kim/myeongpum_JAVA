package chapter2;

import java.util.Scanner;

/*
 * 2���� ��鿡�� �ϳ��� ���簢���� �� ������ ǥ���ȴ�. (50, 50)�� (100, 100)��
 * �� ������ �̷���� �簢���� �ִٰ� ����. �̶� Ű����κ��� �� ���� �����ϴ� ����
 * x�� y ���� �Է¹ް� �� (x, y)�� �� ���簢�� �ȿ� �ִ��� �Ǻ��ϴ� ���α׷��� �ۼ��϶�
 */
public class q8 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int x1 = in.nextInt();
		int y1 = in.nextInt();
		
		int x2 = in.nextInt();
		int y2 = in.nextInt();
		
        if ((x1<50 && x2<50) || (x1>100 && x2>100)) {
            System.out.println("�簢���� �� ��ħ");
            return;
        }
        if ((y1<50 && y2<50) || (y1>100 && y2>100)) {
            System.out.println("�簢���� �� ��ħ");
            return;
        }
		
        System.out.println("�簢���� ��Ĩ�ϴ�.");
	}

}
