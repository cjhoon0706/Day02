package day02hw;

import java.util.Scanner;

public class Hw03 {
	
	public static void main(String[] args) {
		
		//���� 5: �ϳ��� ������ �Է¹޾� 7�� ��� �̸鼭 ¦�� ���� Ȯ��
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print( "Put any integer to find out if it is a multiple of 7 and a even number: " );
		int a = scan.nextInt();
		
		System.out.println( "Integer a is the multiple of 7 and a even number: " + ((a % 7 == 0) && (a % 2 == 0)) );
		
		
		
	}

}
