package chapter2;

import java.util.Scanner;

/*
 * 2차원 평면에서 하나의 직사각형은 두 점으로 표현된다. (50, 50)과 (100, 100)의
 * 두 점으로 이루어진 사각형이 있다고 하자. 이때 키보드로부터 한 점을 구성하는 정수
 * x와 y 값을 입력받고 점 (x, y)가 이 직사각형 안에 있는지 판별하는 프로그램을 작성하라
 */
public class q8 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int x1 = in.nextInt();
		int y1 = in.nextInt();
		
		int x2 = in.nextInt();
		int y2 = in.nextInt();
		
        if ((x1<50 && x2<50) || (x1>100 && x2>100)) {
            System.out.println("사각형이 안 겹침");
            return;
        }
        if ((y1<50 && y2<50) || (y1>100 && y2>100)) {
            System.out.println("사각형이 안 겹침");
            return;
        }
		
        System.out.println("사각형이 겹칩니다.");
	}

}
