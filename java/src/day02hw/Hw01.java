package day02hw;

import java.util.Scanner;

public class Hw01 {
	
	public static void main(String[] args) {
		
		//���� 3 �ϳ��� ������ �޾� 7�� ������� Ȯ�� => T or F
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print( "Put any integer to find out if it is multiple of 7: " );
		int a = scan.nextInt();
		
		if ( a % 7 == 0 ) {
			System.out.println( a + " is a multiple of 7" );
		} else {
			System.out.println( "it is not a multiple of 7" );
		}
		
		
	}

}
