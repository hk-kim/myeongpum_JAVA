package chapter2;

import java.util.Scanner;

/*
 * 369게임을 간단히 작성해보자. 1~99까지의 정수를 키보드로부터 입력받고 정수에
 * 3,6,9 중 하나가 있는 경우는 "박수짝"을 출력하고 두 개 있는 경우는 "박수짝짝"을
 * 출력하는 프로그램을 작성하라. 예를 들면 키보드로 입력된 수가 13인 경우 "박수짝"을
 * 36인 경우 "박수짝짝"을 출력하면 된다.
 */
public class q4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int val = in.nextInt();
		int cnt = 0;
		
		int f_num = val/10;
		if(f_num == 3 || f_num == 6 || f_num == 9)
		{
			cnt++;
		}
		
		int s_num = val%10;
		if(s_num == 3 || s_num == 6 || s_num == 9)
		{
			cnt++;
		}
		
		if(cnt == 1) {
			System.out.println("박수짝");
		}
		else if(cnt == 2)
		{
			System.out.println("박수짝짝");
		}
			
	}
	
}
