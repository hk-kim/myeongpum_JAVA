package chapter3;
import java.util.ArrayList;
import java.util.Comparator;
/*
 * Ű����κ��� ������ 10�� �Է¹޾� �迭�� �����ϰ� 
 * �����ϴ� ������ �����ϰ� �̵��� ����ϴ� ���α׷��� �ۼ��϶�.
 */
import java.util.Scanner;

public class q5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<10; i++) {
			list.add(in.nextInt());
		}
		
		list.sort(Comparator.naturalOrder());
		
		for(int value : list) {
			System.out.println(value);
		}

		in.close();
	}
}
