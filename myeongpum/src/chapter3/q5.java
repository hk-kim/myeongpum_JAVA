package chapter3;
import java.util.ArrayList;
import java.util.Comparator;
/*
 * 키보드로부터 정수를 10개 입력받아 배열에 저장하고 
 * 증가하는 순서로 정렬하고 이들을 출력하는 프로그램을 작성하라.
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
