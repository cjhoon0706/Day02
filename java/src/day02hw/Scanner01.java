package day02hw;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		
		//�Է¹ޱ�
			//�Է¹ޱ� => ������ ���� => ���
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print( "put integer: ");
		int integer = scan.nextInt();
		
		System.out.println( "currently put integer: " + integer );
		
		System.out.println("------------------------");
		
		System.out.print( "put words: " );
		String str = scan.next();
		
		System.out.println( "currenlty put words: " + str );
		
		
	}
	
}
