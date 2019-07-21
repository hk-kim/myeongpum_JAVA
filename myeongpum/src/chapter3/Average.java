package chapter3;
/*
 * 명령행 인자 정수들의 평균 출력
 */

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i=0; i<args.length; i++) {
			sum += Integer.parseInt(args[i]);
		}
		System.out.println(sum/args.length);

	}

}
