package day03;

import java.util.Scanner;

public class Day03_2_if_practice6 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//����6: 4�� ������ �Է¹޾� ���� ū�� ���
		System.out.println( "���� ����1: " );
		int ����1 = scan.nextInt();
		
		System.out.println( "���� ����2: " );
		int ����2 = scan.nextInt();
		
		System.out.println( "���� ����3: " );
		int ����3 = scan.nextInt();
		
		System.out.println( "���� ����4: " );
		int ����4 = scan.nextInt();
		
		int max = ����1; //���Ƿ� ù��° ������ max�� ����
			if( max < ����2 ) {
				max = ����2;
			}
			if( max < ����3 ) {
				max = ����3;
			}
			if( max < ����4 ) {
				max = ����4;
			}
		
	}

}
