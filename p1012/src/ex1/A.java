package ex1;

public class A {//ex1.A
	int x;
	final int y = 1; // 상수 -> 변경할 수 없는 값
	A(){} // 생성자 -> 자신의 이름과 같은 함수
	void m1() {} // 메서드
	
	class In{} // 클래스 안에 클래스
	
	static {}// static 블록
}
//클래스는 데이터 타입이다.

//위의 코드 실행 시 실제 내부 실행 코드
/*
	public class A extends Object{
	int x;
	A(A this){
		this.x = 0
	}
}
*/
