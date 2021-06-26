package day03;

import java.util.Scanner;

public class Day03_2_if_practice {
	
	public static void main(String[] args) {
		
		//문제1: 하나의 점수를 입력받아 80점 이상이면 합격 아니면 불합격 출력
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print( "Enter score: ");

		int score = scan.nextInt();
		
		if(  score >= 80 ) {
			System.out.println( "PASS" );
		}else {
			System.out.println( "Fail" );
		}
		
		
	}

}
