package day02;

import java.util.Scanner; // Scanner ����

public class Day02_3 {
	
	public static void main(String[] args) {
		
		//�Է¹ޱ�
			// 1. �Է¹ޱ� => ������ ���� => ���
		
		Scanner scan = new Scanner(System.in);
			//Scanner: �Է� ���� Ŭ����
				//scan: ��ü�� vs ������
					//new: ��ü�� �޸� �Ҵ� ������
						//Scanner(System.in) : Ŭ���� ������
		System.out.print( "���� �Է�: " );
		int �Է����� = scan.nextInt();
					//nextInt(): �Է°�ü�� �Էµ� ���� ��������
		System.out.println( "���� �Է��� ������: " + �Է����� );
		
		System.out.print( "���ڿ� �Է�: ");
		String �Է¹��ڿ� = scan.next();
		System.out.print( "���� �Է��� ���ڿ��� : " + �Է¹��ڿ� );
		
		
		
	}

}
