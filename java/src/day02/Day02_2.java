package day02;

public class Day02_2 {
	
	//변수
		//1. 변하는수 <==> 상수 (고정된수
		//2. 메모리: 자원 [ 데이터 저장소 ]
			//변수 형태:
				//사람 : 문자		int 변수명;
				//컴퓨터 : 숫자	메모리크기 주소값;
		//3. 자료형 : 미리 정의된 메모리 크기 [메모리 효율적]
			// 1비트 : 0 , 1
			// 1byte : 8 bit => 0 혹은 1 이 8 자리
			// 1kb => 1024byte	// 1024kb => mb => gb
	
			// boolean: 1비트 논리 [ 0[false] , 1 [true] ]
			// char : 2byte 문자 [ 아스키코드 ???? ]
			// byte : 1byte 정수 [ +- 120]
			// short : 2 byte 정수 [ +-3만 ]
			// int : 4 byte 정수 [ +-20억 ]
			// long : 8 byte 정수 [ +-20억 이상 ]
			// float : 4 byte 실수
			// double : 8 byte 실수
	
	public static void main(String[] args) {
		
		//예제1
		// 1. 변수선언
		// 자료형 변수명;		//쓰레기값 [임의의값]
		// 자료형 변수명 = 값 ;
		boolean 논리형변수 = true; // true 혹은 false 저장할 수 있는 저장소
		System.out.println( "boolean 변수: " + 논리형변수 ); //변수 출력

		char 문자변수 = 'a';
		System.out.println( "char 변수: " + 문자변수 );
			// char : 아스키코드 사용
		char 문자변수2 = 97;
		System.out.println( 문자변수2 );
		
		char 문자변수3 = 98; //문자
		System.out.println( 문자변수3 );
		
		byte 바이트변수 = 100;
		System.out.println( "byte 변수 : " + 바이트변수 );
		byte 바이트변수2 = 'a';//정수
		System.out.println( "byte 변수 : " + 바이트변수2 );
		
		short 쇼트변수 = 300;
		System.out.println( "short 변수: " + 쇼트변수 );
		short 쇼트변수2 = 'a';
		System.out.println( "short 변수: " + 쇼트변수2 );
		
		int 인트변수 = 3000; System.out.println( "int 변수: " + 인트변수 );
		int 인트변수2 = 'a' ; System.out.println( "int 변수: " + 인트변수2 );
			// 정수의 기본 자료형은: int
		
		long 롱변수 = 99999999999L; System.out.println( "long 변수: " + 롱변수 );
			//데이터L;
		
		float 실수변수 = 10.511111111111f;
		System.out.println( "float 변수: " + 실수변수 );
			//데이터F;
		double 실수변수2 = 10.51111111111111;
		System.out.println( "double 변수: " + 실수변수2 );
		
		String 문자열객체 = "안녕하세요";
		System.out.println( "String 객체: " + 문자열객체 ); 
		
		
		
	}

}
