package day03;

import java.util.Scanner;

public class Day03_2_if_practice4 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print( "Enter the first number: ");
		int f = scanner.nextInt();
		
		System.out.print( "Enter the second number: ");
		int s = scanner.nextInt();
		
		if( f > s ) {
			System.out.println( f );
		}else {
			System.out.println( s );
		}
	}

}
