package Day01; // 패키지명

// 주석 : 설명달기 [ 실행x ]
	// : 한줄주석
		/*
		 *  여러줄 주석
		 */

public class Day01_1 { // c s
	//Object 클래스로부터 데이터 제공받음
		// 모든 클래스는 object로 부터 시작된다
			// 100% 클래스 언어 == 100% 객체지향 언어
	
	// { } 안에 포함된 코드 tab[들여쓰기]
	// main 메소드
		// ctrl + 스페이스바 : 자동완성
	public static void main(String[] args) { //m s
		// main 메소드 : main 스레드를 가지고 있음
			//스레드 : 프로세스에 코드를 읽어주는 역할
				//main {} 박에 코드는 실행x
		//출력
			//1. 클래스의 첫글자는 무조건 대문자
			//2. 메뉴 => run => run [Ctrl + F11]
		System.out.println("java");
			//System: 시스템 관련 [ 입출력 ] 클래스
				// . : 클래스내 맴버 접근 연산자 [ 특수기호 ]
					// out: 출력 관련 스트림
						// println("출력내용") : 출력메소드
							// ; : [일처리 명령] 코드한줄의 끝
		//예제1: println [자동 줄바꿈 포함]
			//컴퓨터 기계어 : 0, 1 [수]
			//" " 문자처리 : 키워드[미리 만들어진 단어/문법/을 제외한 모든 문자
		System.out.println(7); // 수에는 문자처리 x
		System.out.println("java"); //문자에는 문자처리 o
		System.out.println("java7");
		
		// 예제2: print [자동 줄바꿈 포함x]
		System.out.print(7);
		System.out.print("java");
		System.out.print("java7");
		
		//예제3 : printf [ 형식 = 서식 = 형태꾸미기 = format 출력 ]
		System.out.printf( "%d", 7 );
		System.out.printf( "%s", "java" );
		System.out.printf( "%s", "java7" );
			//형식 문자
				// %d : 정수
				// %f : 실수
				// %s : 문자열
				// %c : 문자
		//예제4 : print , printf 차이
		System.out.println( "java" + 7 + "입니다" );
			// + 더하기 연산자 : 숫자 + 숫자 경우
			// + 연결 연산자 : 문자 + 숫자 경우 혹은 문자 + 문자
		
		System.out.printf( "%s%d%s", "java" , 7, "입니다" );
		System.out.printf( "java%d입니다", 7 );
			// 제어 문자
				// \ : 원화기호
				// \n:
				// \t: 들여쓰기
				// \r: 개행 [앞으로 가기]
				// \\: \
				// \" : "
		
		//예제5 : 제어문자
		System.out.print( "\n" + 7 + "\n" + "java\njava7\n" );
		System.out.print( "\t" + 7 + "\t" + "java\tjava7\n" );
		
		//문제1 : println, 출석부
		System.out.println( "================출석부==============");
		System.out.println( "이름\t1교시\t2교시\t3교시" );
		System.out.println( "강호동\t출석\t결석\t출석" );
		System.out.println( "===================================");
		
		//문제2 : 문제1번을 printf
		System.out.printf("===============%s==============" , "출석부");
		System.out.printf("이름\t1교시\t2교시\t3교시\n");
		System.out.printf("%");
		
		
	} // m e
	
} //c e
