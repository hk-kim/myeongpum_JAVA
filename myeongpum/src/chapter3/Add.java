package chapter3;
/*
 * 명령행 인자 중 정수만 골라 합을 구하라.
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
