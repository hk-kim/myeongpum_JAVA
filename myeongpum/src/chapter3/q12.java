package chapter3;
/*
 * �ݺ����� �̿��Ͽ� 369 ���ӿ��� �ڼ��� �ľ� �ϴ� ����� ���� 
 * ������� ȭ�鿡 ����غ���.
 * 1���� �����ϸ� 99������ �Ѵ�. 
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
				System.out.println(i + " �ڼ� �ι�");
			}
			else if(cnt ==1) {
				System.out.println(i + " �ڼ� �ѹ�");
			}
			
			cnt = 0;
		}

	}

}
