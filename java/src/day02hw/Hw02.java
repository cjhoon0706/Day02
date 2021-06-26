package day02hw;

import java.util.Scanner;

public class Hw02 {
	
	public static void main(String[] args) {
		
		//문제 4 : 하나의 정수를 받아 홀수 인지 확인
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print( "Put any numbers to figure out if it is a even number or a odd number: " );
		
		int a = scan.nextInt();
		
		System.out.println( "It is an even number: " + (a % 2 == 0) );
		
		
		
		
		
		
		
	}

}
