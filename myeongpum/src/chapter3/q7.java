package chapter3;
/*
 * 4x4�� 2���� �迭�� ����� �̰��� 1���� 10���� ������ ������ 
 * �����ϰ� �����Ͽ� ���� 16���� �迭�� �����ϰ� 2���� �迭�� ȭ�鿡 ����϶�.
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
