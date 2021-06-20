package day02;

public class Day02_1 {
	
	public static void main(String[] args) {
		
		//연산자
		//1. 산술연산자
		System.out.println( 3 + 5 );
		System.out.println( 3 - 5 );
		System.out.println( 3 * 5 );
		System.out.println( "나누기:" + (5 / 3) );
		System.out.println( "나머지:" + 5 % 3 );
		
		//2. 비교연산자 [ 결과 : true / false ]
		
		// == : 같다 [ = 대입 ]
		// != : 같지 않다
		
		System.out.println( "초과: " + ( 5 > 3 ) );
		System.out.println( "이상: " + ( 5 >= 3 ) );
		System.out.println( "미만: " + ( 5 < 3 ) );
		System.out.println( "이하: " + ( 5 >= 3 ) );
		System.out.println( "같지않다: " + ( 5 != 3 ) );
		System.out.println( "같다: " + ( 5 == 3 ) );
		
		//문제1
			//1. 3이 홀수[true]인지 짝수[false] 인지 출력
		System.out.println( "3은 홀수: " + ( 3 % 2 == 1 ) );
		
		//문제2
			//2. 36의 수가 3의 배수이면[true] 아니면 [false] 출력
		System.out.println( "36은 3의 배수: " + ( 36 % 3 == 0 ) );
		
		//3. 관계연산자 [ 비교연산자가 두개 이상일 경우 ]
			// and : && : 이면서, 면서, 이고, 모두, 그리고 [ 비교연산자가 모두 T, T ]
			// or : || : 이거나, 거나, 또는, 하나라도 [ 비교연산자 하나라도 T, T ]
			// 부정: !: true => false	false => true
			System.out.println( "and: " + ( 1 < 3 && 3 < 5 ) ); 
			System.out.println( "or: " + ( 1 < 3 || 3 < 2 ) ); 
			System.out.println( "부정: " + !( 1 < 3 ) );
			
		//4. 대입연산자
			// = 대입 [ 오른쪽 값 => 왼쪽 으로 대입 ]
			// += [ 오른쪽값을 왼쪽에 더한후에 왼쪽에 대입 ]
			// *=	/=	%=
		int a = 10;
		a += 10;	// a = a + 10
		
		//5. 증감연산자
			// ++ : 1증가	++변수 : 선증가		변수++ = 후증가
			// -- : 1감소
		System.out.println( ++a ); //21
		System.out.println( a++ ); //21
		System.out.println( a );   //22
		
		System.out.println( --a ); //21
		System.out.println( a-- ); //21
		System.out.println( a );   //20
		
		//문제 3. 365,420원의 지폐수 세기
			//출력 십만원권: 3, 만원권: 6, 천원권: 5, 백원: 4
		int amount = 365420;
	
		System.out.println( "hundreddr: " + amount / 100000 + " bills" );
			amount -= ( amount / 100000) * 100000;
		System.out.println( "tendr: " + ( amount / 10000) + " bills");
		
		//변수: 메모리 [ 데이터 저장소 ]
		
	}//main

}//class
