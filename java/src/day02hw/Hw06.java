package day02hw;

import java.util.Scanner;

public class Hw06 {
	
	public static void main(String[] args) {
		
		//���� 6: �ΰ��� ������ �Է� �޾� �� ū�� Ȯ��
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print(  "Put first number: ");
		int a = scan.nextInt();
		
		System.out.print( "Put second number: " );
		int b = scan.nextInt();
		
		if ( a > b ) {
			System.out.println( a + " is a bigger number" );
		} else {
			System.out.println( b + " is a bigger number" );
		}
		
	}

}
