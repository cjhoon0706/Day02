package day03;

import java.util.Scanner;

public class Day03_2_if_practice7 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//����7: 4�� ������ �Է¹޾� �������� ������ ���
		System.out.print( "����1: " );
		int ����1 = scan.nextInt();
		
		System.out.print( "����2: " );
		int ����2 = scan.nextInt();
		
		System.out.print( "����3: " );
		int ����3 = scan.nextInt();
		
		int temp; //��ü�� �ӽ� ����
		
		System.out.printf( "���� ��: %d %d %d ", ����1, ����2, ����3 );
		if( ����1 > ����2 ) {
			temp = ����1;
			����1 = ����2;
			����2 = temp;
		}
		if( ����1 > ����3 ) {
			temp = ����1;
			����1 = ����3;
			����3 = temp;
		}
		if( ����2 > ����3 ) {
			temp = ����2;
			����2 = ����3;
			����3 = temp;
		}
		System.out.printf( "���� ��: %d %d %d", ����1, ����2, ����3 );
		
	}

}
