package day02hw;

import java.util.Scanner;

public class Hw08 {

	public static void main(String[] args) {
		
		//문제 8: 사다리꼴 넓이 구하기: 1/2(a + b)h
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println( "Area of Trapezoid" );
		System.out.print( "upper length: ");
		int a = scan.nextInt();
		
		System.out.print( "lower lenght: ");
		int b = scan.nextInt();
		
		System.out.print( "height: " );
		int h = scan.nextInt();
		
		System.out.println( "The area of trapezoid is:" + ( 0.5*( a + b )*h ) );
		
	}
	
}
