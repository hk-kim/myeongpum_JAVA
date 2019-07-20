package chapter2;

import java.util.Scanner;

/*
 * 2차원 평면에서 하나의 직사각형은 두 점으로 표현된다. (50, 50)과 (100, 100)의
 * 두 점으로 이루어진 사각형이 있다고 하자. 이때 키보드로부터 한 점을 구성하는 정수
 * x와 y 값을 입력받고 점 (x, y)가 이 직사각형 안에 있는지 판별하는 프로그램을 작성하라
 */
public class q7 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int x = in.nextInt();
		int y = in.nextInt();
		
        if((x/50)==1 && (y/50)==1)  // x와 y의 값이 50~99인 경우
            System.out.println("사각형 안");
 
        else if(x==100 && y==100)   // x와 y의 값이 100인 경우
            System.out.println("사각형 안");
 
        else
            System.out.println("사각형 밖");
	}

}
