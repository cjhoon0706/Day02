package day02hw;

import java.util.Scanner;

public class Hw07 {
	
	public static void main(String[] args) {
		
		//문제 7: 두 실수를 입력받아 앞실수의 값이 뒤의 값의 몇% 인지 출력하기
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("First number: ");
		float a = scan.nextFloat();
		
		System.out.print("Second number: ");
		int b = scan.nextInt();
		
		System.out.println( "a is " + ( a / b * 100 ) + "% of " + b );
		
		
	}

}
