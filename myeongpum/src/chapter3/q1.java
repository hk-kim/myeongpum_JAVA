package chapter3;
/*
 * Ű����κ��� ������ ������ �Է¹ް� *�� ����ϴ� ���α۸��� �ۼ��϶�.
 */
import java.util.Scanner;

public class q1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int input_val = in.nextInt();
		
		for(int i = 0; i < input_val; i++) {
			for(int j = input_val-i; j > 0; j--) {
				System.out.print("*");;
			}
			System.out.println("");
		}
		
		in.close();
	}
}
