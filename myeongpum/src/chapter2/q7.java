package chapter2;

import java.util.Scanner;

/*
 * 2���� ��鿡�� �ϳ��� ���簢���� �� ������ ǥ���ȴ�. (50, 50)�� (100, 100)��
 * �� ������ �̷���� �簢���� �ִٰ� ����. �̶� Ű����κ��� �� ���� �����ϴ� ����
 * x�� y ���� �Է¹ް� �� (x, y)�� �� ���簢�� �ȿ� �ִ��� �Ǻ��ϴ� ���α׷��� �ۼ��϶�
 */
public class q7 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int x = in.nextInt();
		int y = in.nextInt();
		
        if((x/50)==1 && (y/50)==1)  // x�� y�� ���� 50~99�� ���
            System.out.println("�簢�� ��");
 
        else if(x==100 && y==100)   // x�� y�� ���� 100�� ���
            System.out.println("�簢�� ��");
 
        else
            System.out.println("�簢�� ��");
	}

}
