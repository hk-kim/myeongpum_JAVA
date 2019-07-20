package chapter2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Ű����κ��� Ư�� ������ �Է¹޾� �������� �ƴ����� �Ǻ��ϴ� ���α׷��� �ۼ�
 * �϶�. ������ 4�� ����������� �ش� �켱 �������� �ϵ�, ���߿��� 100���� ����
 * ������� �ش� ������� �ϰ�, �ٸ� 400���� ����������� �ش� �ٽ� ��������
 * �����Ѵ�.
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
						System.out.println("����");
					}
					else {
						System.out.println("���1");
					}
				}
				else if(year%4==0 && year%100!=0) {
					System.out.println("����");
				}
				else {
					System.out.println("���2");
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
