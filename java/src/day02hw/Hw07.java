package day02hw;

import java.util.Scanner;

public class Hw07 {
	
	public static void main(String[] args) {
		
		//���� 7: �� �Ǽ��� �Է¹޾� �սǼ��� ���� ���� ���� ��% ���� ����ϱ�
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("First number: ");
		float a = scan.nextFloat();
		
		System.out.print("Second number: ");
		int b = scan.nextInt();
		
		System.out.println( "a is " + ( a / b * 100 ) + "% of " + b );
		
		
	}

}
