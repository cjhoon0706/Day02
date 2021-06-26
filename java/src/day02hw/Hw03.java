package day02hw;

import java.util.Scanner;

public class Hw03 {
	
	public static void main(String[] args) {
		
		//문제 5: 하나의 정수를 입력받아 7의 배수 이면서 짝수 인지 확인
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print( "Put any integer to find out if it is a multiple of 7 and a even number: " );
		int a = scan.nextInt();
		
		System.out.println( "Integer a is the multiple of 7 and a even number: " + ((a % 7 == 0) && (a % 2 == 0)) );
		
		
		
	}

}
