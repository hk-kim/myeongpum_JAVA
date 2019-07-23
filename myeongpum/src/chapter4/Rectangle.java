package chapter4;
/*다음과 같은 멤버를 가지는 직사각형을 표현하는 Rectangle 클래스를 작성하라.
 * int 타입의 x1, y1, x2, y2 필드 : 사각형을 구성ㅎ나느 두 점의 좌표
 * 생성자 2개 : 매개 변수 없는생성자와 x1, y1, x2, y2의 값을 설정하는 생성자
 * vod set(int x1, int y1, int x2, int y2) : x1, y2, x2, y2 좌표 설정
 * int square() : 사각형 넓이 리턴
 * void show() 좌표와 넒이 등 직사각형 정보의 화면 출력
 * boolean equals(Rectangle r) 인자로 전달된 객체 r과 현 객체가 동일한 직사각형이면 true 리턴
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
		
		System.out.println("넓이 : " + square());
	}
	
	public boolean equals(Rectangle r) {
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
