package day02;

public class Day02_1 {
	
	public static void main(String[] args) {
		
		//������
		//1. ���������
		System.out.println( 3 + 5 );
		System.out.println( 3 - 5 );
		System.out.println( 3 * 5 );
		System.out.println( "������:" + (5 / 3) );
		System.out.println( "������:" + 5 % 3 );
		
		//2. �񱳿����� [ ��� : true / false ]
		
		// == : ���� [ = ���� ]
		// != : ���� �ʴ�
		
		System.out.println( "�ʰ�: " + ( 5 > 3 ) );
		System.out.println( "�̻�: " + ( 5 >= 3 ) );
		System.out.println( "�̸�: " + ( 5 < 3 ) );
		System.out.println( "����: " + ( 5 >= 3 ) );
		System.out.println( "�����ʴ�: " + ( 5 != 3 ) );
		System.out.println( "����: " + ( 5 == 3 ) );
		
		//����1
			//1. 3�� Ȧ��[true]���� ¦��[false] ���� ���
		System.out.println( "3�� Ȧ��: " + ( 3 % 2 == 1 ) );
		
		//����2
			//2. 36�� ���� 3�� ����̸�[true] �ƴϸ� [false] ���
		System.out.println( "36�� 3�� ���: " + ( 36 % 3 == 0 ) );
		
		//3. ���迬���� [ �񱳿����ڰ� �ΰ� �̻��� ��� ]
			// and : && : �̸鼭, �鼭, �̰�, ���, �׸��� [ �񱳿����ڰ� ��� T, T ]
			// or : || : �̰ų�, �ų�, �Ǵ�, �ϳ��� [ �񱳿����� �ϳ��� T, T ]
			// ����: !: true => false	false => true
			System.out.println( "and: " + ( 1 < 3 && 3 < 5 ) ); 
			System.out.println( "or: " + ( 1 < 3 || 3 < 2 ) ); 
			System.out.println( "����: " + !( 1 < 3 ) );
			
		//4. ���Կ�����
			// = ���� [ ������ �� => ���� ���� ���� ]
			// += [ �����ʰ��� ���ʿ� �����Ŀ� ���ʿ� ���� ]
			// *=	/=	%=
		int a = 10;
		a += 10;	// a = a + 10
		
		//5. ����������
			// ++ : 1����	++���� : ������		����++ = ������
			// -- : 1����
		System.out.println( ++a ); //21
		System.out.println( a++ ); //21
		System.out.println( a );   //22
		
		System.out.println( --a ); //21
		System.out.println( a-- ); //21
		System.out.println( a );   //20
		
		//���� 3. 365,420���� ����� ����
			//��� �ʸ�����: 3, ������: 6, õ����: 5, ���: 4
		int amount = 365420;
	
		System.out.println( "hundreddr: " + amount / 100000 + " bills" );
			amount -= ( amount / 100000) * 100000;
		System.out.println( "tendr: " + ( amount / 10000) + " bills");
		
		//����: �޸� [ ������ ����� ]
		
	}//main

}//class
