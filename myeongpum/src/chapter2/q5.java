package chapter2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/*
 * Scanner�� �̿��Ͽ� ������ 3�� �Է¹ް� �� 3���� ���� �蘆������ ���� �� �ִ�����
 * �Ǻ��϶�. �ﰢ���� �����Ϸ��� �� ���� ���� �ٸ� �� ���� �պ��� �ݵ�� Ŀ�� �Ѵ�.
 */

public class q5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<>();

		list.add(in.nextInt());
		list.add(in.nextInt());
		list.add(in.nextInt());
		
		list.sort(Comparator.naturalOrder());
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		if( list.get(2) < list.get(0)+list.get(1) ) {
			System.out.println("�ﰢ�� ����");
		}
		else if( list.get(2) >= list.get(0)+list.get(1) ){
			System.out.println("�ﰢ�� �Ұ���");
		}
		
		
		
		
		
		
	}
}
