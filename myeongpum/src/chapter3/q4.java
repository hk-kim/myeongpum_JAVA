package chapter3;
/*
* 두 수를 입력받아 최대 공약수를 출력하는 프로그램을 작성하라 
 */
import java.util.Scanner;

public class q4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int m = 1;
		
		if(num1 < num2) {
			int temp = num2;
			num2 = num1;
			num1 = temp;
		}
		
		while(m > 0) {
			m = num1 % num2;
			num1 = num2;
			num2 = m;
		}
		
		System.out.println(num1);

		in.close();
	}
}
