package day03;

import java.util.Scanner;

public class Day03_2_if_practice {
	
	public static void main(String[] args) {
		
		//����1: �ϳ��� ������ �Է¹޾� 80�� �̻��̸� �հ� �ƴϸ� ���հ� ���
		
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
