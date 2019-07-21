package chapter3;
/*
 * 4x4의 2차원 배열을 만들고 이곳에 1에서 10까지 범위의 정수를 8개만 랜덤하게 생성하여
 * 임의의 위치에 삽입하라. 동일한 수가 나올 수도 있다. 나머지 8개의 숫자는
 * 모두 0이다. 즉, 2차원 배열에는 항상 8개의 정수가 랜덤한 위치에 있도록 하라. 
 * 그리고 이 2차원 배열을 화면에 출력하라.
 */

public class q8 {
	public static void main(String[] args) {
		int [][]val = new int[4][4];
		
		for(int j=0; j<8; j++) {
			int col = ((int)Math.round(Math.random()*9+1))%4;
			int row = ((int)Math.round(Math.random()*9+1))%4;
			
			if(val[col][row] == 0 ) {
				val[col][row] = (int)Math.round(Math.random()*9+1);
			}
			else {
				j--;
			}
		}
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				System.out.print(val[i][j]+"\t");
			}
			System.out.println("");
		}
	}
}
