package chapter3;
/*
 * 키보드로부터 임의의 정수를 입력받고 *를 출력하는 프로글매을 작성하라.
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
