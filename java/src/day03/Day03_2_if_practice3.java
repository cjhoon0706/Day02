package day03;

import java.util.Scanner;

public class Day03_2_if_practice3 {
	
	public static void main(String[] args) {
		
		//�����̸鼭 90�� �̻� A-1 Ŭ����
		//�����̸鼭 90�� �̻� A-2 Ŭ����
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println( "Enter score: " );
		int score = scan.nextInt();
		
		System.out.println( "Enter gender: " );
		String gender = scan.next();
		
		// String: ���ڿ� ��ü (Ŭ����)
		// ���ڿ�.equals(���ڿ�2) : ���ڿ� �� [ ��ȯ = T / F ]
		
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
