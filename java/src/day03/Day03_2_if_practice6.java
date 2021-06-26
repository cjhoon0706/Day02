package day03;

import java.util.Scanner;

public class Day03_2_if_practice6 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//문제6: 4개 정수를 입력받아 가장 큰수 출력
		System.out.println( "비교할 정수1: " );
		int 정수1 = scan.nextInt();
		
		System.out.println( "비교할 정수2: " );
		int 정수2 = scan.nextInt();
		
		System.out.println( "비교할 정수3: " );
		int 정수3 = scan.nextInt();
		
		System.out.println( "비교할 정수4: " );
		int 정수4 = scan.nextInt();
		
		int max = 정수1; //임의로 첫번째 변수를 max에 대입
			if( max < 정수2 ) {
				max = 정수2;
			}
			if( max < 정수3 ) {
				max = 정수3;
			}
			if( max < 정수4 ) {
				max = 정수4;
			}
		
	}

}
