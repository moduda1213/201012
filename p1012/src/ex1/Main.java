package ex1;

public class Main extends Object{ // ex1.Main
	public static void main(String[] args) { // static에는 내부 실행 코드에 this가 없다
		A a = null;//ex1.A a = null; -> ex1 패키지안에 포함되어있기 때문에 생략 가능
		a = new A(); //a객체를 위한 공간 할당
		
		A[] arr = null;//A배열 생성
		arr = new A[2];
		arr[0] = null;
		arr[1] = null;
		arr[0] = new A();
		arr[1] = new A();
		
		
	}
}
/*
클래스 영역(실행할 수 있는 것들)			스택영역				힘영역 
java.lang.*
Main.class											 x:0
----------------------
Main.main() : 메인 메서드
----------------------
main() : 생성자 (1)			ㅣㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅣ
----------------------		ㅣ		  			ㅣ
A.class						ㅣ		  			ㅣ
A() 						ㅣ a | '(x:0 주소)' 	ㅣ
 							ㅣ main() 			ㅣ

생성시 클래스영역에 먼저 생성되고 종료시 가장 늦게 삭제된다 -> 그러므로 클래스 영역에 많은 데이터를 올리지 않는 것이 좋다
스택영역(메서드 호출 스택영역)에 있는 데이터는 메서드호출 시 데이터 생성
스택영역에 데이터가 없다 -> 데이터 종료상태 -> 클래스 영역 삭제
힙 영역은 you(this)값 호출 시 데이터가 올라간다.

 */					
