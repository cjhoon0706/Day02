package day03;

import java.util.Scanner;

public class Day03_2_if_practice5 {
	
	public static void main(String[] args) {
		
		//3개의 정수를 입력받아 가장 큰수 출력
		Scanner scan = new Scanner(System.in);
		
		System.out.println( "비교할 정수1: " );
		int 정수1 = scan.nextInt();
		
		System.out.println( "비교할 정수2: " );
		int 정수2 = scan.nextInt();
		
		System.out.println( "비교할 정수3: " );
		int 정수3 = scan.nextInt();
		
		//방법1
		int max = 정수1;
		if( max < 정수2 ) {
			max = 정수2;
		}
		if( max < 정수3 ) {
			max = 정수3;
		}
		System.out.println( "가장 큰수는: " + max );
		
		//방법2
		if( 정수1 > 정수2 && 정수2 > 정수3 ) {
			System.out.println( 정수1 );
		}else if( 정수2 > 정수1 && 정수2 > 정수3 ) {
			System.out.println( 정수2 );
		}else if( 정수3 > 정수2 && 정수3 > 정수2 ) {
			System.out.println( 정수3 );
		}else {
			System.out.println( "모두 같다" );
		}
		
	}

}
