package day03;

import java.util.Scanner;

public class Day03_2_if_practice5 {
	
	public static void main(String[] args) {
		
		//3���� ������ �Է¹޾� ���� ū�� ���
		Scanner scan = new Scanner(System.in);
		
		System.out.println( "���� ����1: " );
		int ����1 = scan.nextInt();
		
		System.out.println( "���� ����2: " );
		int ����2 = scan.nextInt();
		
		System.out.println( "���� ����3: " );
		int ����3 = scan.nextInt();
		
		//���1
		int max = ����1;
		if( max < ����2 ) {
			max = ����2;
		}
		if( max < ����3 ) {
			max = ����3;
		}
		System.out.println( "���� ū����: " + max );
		
		//���2
		if( ����1 > ����2 && ����2 > ����3 ) {
			System.out.println( ����1 );
		}else if( ����2 > ����1 && ����2 > ����3 ) {
			System.out.println( ����2 );
		}else if( ����3 > ����2 && ����3 > ����2 ) {
			System.out.println( ����3 );
		}else {
			System.out.println( "��� ����" );
		}
		
	}

}
