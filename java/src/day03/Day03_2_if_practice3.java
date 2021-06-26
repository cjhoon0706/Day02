package day03;

import java.util.Scanner;

public class Day03_2_if_practice3 {
	
	public static void main(String[] args) {
		
		//남자이면서 90점 이상 A-1 클래스
		//여자이면서 90점 이상 A-2 클래스
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println( "Enter score: " );
		int score = scan.nextInt();
		
		System.out.println( "Enter gender: " );
		String gender = scan.next();
		
		// String: 문자열 객체 (클래스)
		// 문자열.equals(문자열2) : 문자열 비교 [ 반환 = T / F ]
		
		if( gender.equals("m") ) {
			if( score >= 90 ) {
				System.out.println( "A-1 class" );
			}else if( score <= 80 ) {
				System.out.println( "B-1 class" );
			}else {
				System.out.println( "C class" );
			}
		}else if( gender.equals("f") ) {
			if( score >= 90 ) {
				System.out.println( "A-2 class" );
			}else if( score <= 80 ) {
				System.out.println( "B-2 class" );
			}else {
				System.out.println( "C class" );
			}
		}
		
	}

}
