package day03;

import java.util.Scanner;

public class Day03_2 {
	
	//제어문: 경우의 수에 따른 판단력
		//if[논리검사], switch[값 검사]
	
	public static void main(String[] args) {
		//if 형태
			//만약에 ~~이면
			//1. if( T/F ) 실행문;
			//2. if( T/F ) T실행문;
			//	 else F실행문;
			//3. if( T/F ) {실행문; 실행문2;}
			//	 else {실행문; 실행문2;}
			//4. if( T/F ) 실행문[T1];
			//	 else if( T/F ) 실행문[T2];
			//	 else if( T/F ) 실행문[T3};
			//	 else
		
		if( 5 > 3 ) System.out.println( "5가 크다" );
		if( 5 > 10 ) System.out.println( "5가 크다2" );
		
		
		if( 5 > 3 ) System.out.println( "5가 크다3" );
		else System.out.println( "5가 작다3" );
		
		
		if( 5 > 3 ) {
			System.out.println( "true");
			System.out.println( "5가 크다4" );
		} else {
			System.out.println( "false" ); System.out.println("5가 작다4");
		}
		
		
		if( 5 > 10 ) {
			System.out.println( "5가 크다1" );
		}else if( 5 > 8 ) {
			System.out.println( "5가 크다2" );
		}else if( 5 > 6 ) {
			System.out.println( "5가 크다3" );
		}else if( 5 > 4 ) {
			System.out.println( "5가 크다4" );
		}else {
			System.out.println( "5보다 작은 뎅터가 없다" );
		}
		
		

		
	}

}
