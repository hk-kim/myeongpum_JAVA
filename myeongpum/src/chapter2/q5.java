package chapter2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/*
 * Scanner를 이용하여 정수를 3개 입력받고 이 3개의 수로 삼ㅅ각형을 만들 수 있는지를
 * 판별하라. 삼각형이 가능하려면 두 변의 합이 다른 한 변의 합보다 반드시 커야 한다.
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
			System.out.println("삼각형 가능");
		}
		else if( list.get(2) >= list.get(0)+list.get(1) ){
			System.out.println("삼각형 불가능");
		}
		
		
		
		
		
		
	}
}
