package day02;

public class Day02_2 {
	
	//����
		//1. ���ϴ¼� <==> ��� (�����ȼ�
		//2. �޸�: �ڿ� [ ������ ����� ]
			//���� ����:
				//��� : ����		int ������;
				//��ǻ�� : ����	�޸�ũ�� �ּҰ�;
		//3. �ڷ��� : �̸� ���ǵ� �޸� ũ�� [�޸� ȿ����]
			// 1��Ʈ : 0 , 1
			// 1byte : 8 bit => 0 Ȥ�� 1 �� 8 �ڸ�
			// 1kb => 1024byte	// 1024kb => mb => gb
	
			// boolean: 1��Ʈ �� [ 0[false] , 1 [true] ]
			// char : 2byte ���� [ �ƽ�Ű�ڵ� ???? ]
			// byte : 1byte ���� [ +- 120]
			// short : 2 byte ���� [ +-3�� ]
			// int : 4 byte ���� [ +-20�� ]
			// long : 8 byte ���� [ +-20�� �̻� ]
			// float : 4 byte �Ǽ�
			// double : 8 byte �Ǽ�
	
	public static void main(String[] args) {
		
		//����1
		// 1. ��������
		// �ڷ��� ������;		//�����Ⱚ [�����ǰ�]
		// �ڷ��� ������ = �� ;
		boolean �������� = true; // true Ȥ�� false ������ �� �ִ� �����
		System.out.println( "boolean ����: " + �������� ); //���� ���

		char ���ں��� = 'a';
		System.out.println( "char ����: " + ���ں��� );
			// char : �ƽ�Ű�ڵ� ���
		char ���ں���2 = 97;
		System.out.println( ���ں���2 );
		
		char ���ں���3 = 98; //����
		System.out.println( ���ں���3 );
		
		byte ����Ʈ���� = 100;
		System.out.println( "byte ���� : " + ����Ʈ���� );
		byte ����Ʈ����2 = 'a';//����
		System.out.println( "byte ���� : " + ����Ʈ����2 );
		
		short ��Ʈ���� = 300;
		System.out.println( "short ����: " + ��Ʈ���� );
		short ��Ʈ����2 = 'a';
		System.out.println( "short ����: " + ��Ʈ����2 );
		
		int ��Ʈ���� = 3000; System.out.println( "int ����: " + ��Ʈ���� );
		int ��Ʈ����2 = 'a' ; System.out.println( "int ����: " + ��Ʈ����2 );
			// ������ �⺻ �ڷ�����: int
		
		long �պ��� = 99999999999L; System.out.println( "long ����: " + �պ��� );
			//������L;
		
		float �Ǽ����� = 10.511111111111f;
		System.out.println( "float ����: " + �Ǽ����� );
			//������F;
		double �Ǽ�����2 = 10.51111111111111;
		System.out.println( "double ����: " + �Ǽ�����2 );
		
		String ���ڿ���ü = "�ȳ��ϼ���";
		System.out.println( "String ��ü: " + ���ڿ���ü ); 
		
		
		
	}

}
