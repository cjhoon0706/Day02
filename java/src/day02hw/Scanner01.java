package day02hw;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		
		//입력받기
			//입력받기 => 변수에 저장 => 사용
		
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
