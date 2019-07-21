package chapter3;
/*
 * 4x4의 2차원 배열을 만들고 이곳에 1에서 10까지 범위의 정수를 
 * 랜덤하게 생성하여 정수 16개를 배열에 저장하고 2차원 배열을 화면에 출력하라.
 */

public class q7 {
	public static void main(String[] args) {
		int [][]val = new int[4][4];
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				val[i][j] = (int)Math.round(Math.random()*9+1);
				
				System.out.print(val[i][j]+"\t");
			}
			System.out.println("");
		}
		
	}
}
