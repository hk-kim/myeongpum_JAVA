package chapter2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 키보드로부터 특정 연도를 입력받아 윤년인지 아닌지를 판별하는 프로그램을 작성
 * 하라. 연수가 4로 나누어떨어지는 해는 우선 윤년으로 하되, 그중에서 100으로 나누
 * 어떨어지는 해는 평년으로 하고, 다만 400으로 나누어떨어지는 해는 다시 윤년으로
 * 판정한다.
 */
public class q6 {
	public static void main(String[] args) {
	    InputStreamReader inputStreamReader = new InputStreamReader(System.in);
	    BufferedReader br = new BufferedReader(inputStreamReader);	
	    String line;
	    int year = 0;
	    try {
			while ((line = br.readLine()) != null) {
				year = Integer.parseInt(line);
				
				if(year%4==0 && year%100==0)
				{
					if(year%400==0)
					{
						System.out.println("윤년");
					}
					else {
						System.out.println("평년1");
					}
				}
				else if(year%4==0 && year%100!=0) {
					System.out.println("윤년");
				}
				else {
					System.out.println("평년2");
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
