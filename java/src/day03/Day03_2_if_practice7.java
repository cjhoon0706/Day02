package day03;

import java.util.Scanner;

public class Day03_2_if_practice7 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//문제7: 4개 정수를 입력받아 오름차순 정렬후 출력
		System.out.print( "정수1: " );
		int 정수1 = scan.nextInt();
		
		System.out.print( "정수2: " );
		int 정수2 = scan.nextInt();
		
		System.out.print( "정수3: " );
		int 정수3 = scan.nextInt();
		
		int temp; //교체용 임시 변수
		
		System.out.printf( "정렬 전: %d %d %d ", 정수1, 정수2, 정수3 );
		if( 정수1 > 정수2 ) {
			temp = 정수1;
			정수1 = 정수2;
			정수2 = temp;
		}
		if( 정수1 > 정수3 ) {
			temp = 정수1;
			정수1 = 정수3;
			정수3 = temp;
		}
		if( 정수2 > 정수3 ) {
			temp = 정수2;
			정수2 = 정수3;
			정수3 = temp;
		}
		System.out.printf( "정렬 후: %d %d %d", 정수1, 정수2, 정수3 );
		
	}

}
