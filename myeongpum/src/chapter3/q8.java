package chapter3;
/*
 * 4x4�� 2���� �迭�� ����� �̰��� 1���� 10���� ������ ������ 8���� �����ϰ� �����Ͽ�
 * ������ ��ġ�� �����϶�. ������ ���� ���� ���� �ִ�. ������ 8���� ���ڴ�
 * ��� 0�̴�. ��, 2���� �迭���� �׻� 8���� ������ ������ ��ġ�� �ֵ��� �϶�. 
 * �׸��� �� 2���� �迭�� ȭ�鿡 ����϶�.
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
