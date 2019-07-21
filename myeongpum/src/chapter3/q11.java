package chapter3;

import java.util.Scanner;

/*
 * 배열과 반복문을 이용하여 프로그램을 작성해보자. 키보드에서 정수로 된 돈의 액수를 입력받아 
 * 오만 원권, 만 원권, 천 원권, 500원짜리 동전, 100원짜리 동전, 50원 짜리 동전, 
 * 10원 짜리 동전, 1원짜리 동전이 각 몇 개로 변환되는지 출력하라. 
 * 이 때 반드시 다음의 배열을 이용하고 반복문으로 작성하라.
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
			System.out.println(u + "원 : " + cnt);
			
			temp = temp - u*cnt;
			cnt = 0;
		}
	}
}
