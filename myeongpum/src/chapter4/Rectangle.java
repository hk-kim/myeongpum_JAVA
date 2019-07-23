package chapter4;
/*������ ���� ����� ������ ���簢���� ǥ���ϴ� Rectangle Ŭ������ �ۼ��϶�.
 * int Ÿ���� x1, y1, x2, y2 �ʵ� : �簢���� ���������� �� ���� ��ǥ
 * ������ 2�� : �Ű� ���� ���»����ڿ� x1, y1, x2, y2�� ���� �����ϴ� ������
 * vod set(int x1, int y1, int x2, int y2) : x1, y2, x2, y2 ��ǥ ����
 * int square() : �簢�� ���� ����
 * void show() ��ǥ�� ���� �� ���簢�� ������ ȭ�� ���
 * boolean equals(Rectangle r) ���ڷ� ���޵� ��ü r�� �� ��ü�� ������ ���簢���̸� true ����
 */
public class Rectangle {
	private int x1;
	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getY1() {
		return y1;
	}

	public void setY1(int y1) {
		this.y1 = y1;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}

	private int y1;
	private int x2;
	private int y2;	
	
	public Rectangle() {
		this.x1 = 0;
		this.y1 = 0;
		this.x2 = 0;
		this.y2 = 0;
	}
	
	public Rectangle(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;		
	}
	
	public void set(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;		
	}
	
	public int square() {
		return Math.abs((x1-x2)*(y1-y2));
	}
	
	public void show() {
		System.out.println("x1 : " + getX1());
		System.out.println("y1 : " + getY1());
		System.out.println("x2 : " + getX2());
		System.out.println("y2 : " + getY2());
		
		System.out.println("���� : " + square());
	}
	
	public boolean equals(Rectangle r) {
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
