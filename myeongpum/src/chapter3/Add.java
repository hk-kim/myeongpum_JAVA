package chapter3;
/*
 * ����� ���� �� ������ ��� ���� ���϶�.
 */
public class Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;

		for(int i=0; i<args.length; i++) {
			try {
				sum += Integer.parseInt(args[i]);
			}catch (Exception e) {
				// TODO: handle exception
				continue;
			}
		}
		
		System.out.println(sum);
		
	}

}
