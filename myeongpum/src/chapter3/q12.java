package chapter3;
/*
 * 반복문을 이용하여 369 게임에서 박수를 쳐야 하는 경우의 수를 
 * 순서대로 화면에 출력해보자.
 * 1부터 시작하며 99까지만 한다. 
 */
public class q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cnt = 0;
		
		for(int i=1; i<100; i++) {
			if(i/10==3 || i/10==6 || i/10==9) {
				cnt++;
			}
			
			int temp = i-((i/10)*10);
			if(temp==3 || temp==6 || temp==9) {
				cnt++;
			}
			
			if(cnt == 2) {
				System.out.println(i + " 박수 두번");
			}
			else if(cnt ==1) {
				System.out.println(i + " 박수 한번");
			}
			
			cnt = 0;
		}

	}

}
