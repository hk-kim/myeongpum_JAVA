package chapter3;
/*
 * 키보드로부터 0보다 큰 임의의 정수를 입력받고 이 정수를 이진수로 출력하고 
 * 이진 수에 들어 있는 1의 개수를 출력하라
 */
import java.util.Scanner;

public class q3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		String b_num = Integer.toBinaryString(num);
		System.out.println(b_num);
		
		int cnt = 0;
		
		for(int i=0; i<b_num.length(); i++) {
			if(b_num.charAt(i) == '1') {
				cnt ++;
			}
		}
		System.out.println("1의 개수 : " + cnt);
		in.close();
	}
}
