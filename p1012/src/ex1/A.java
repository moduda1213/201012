package ex1;

public class A {//ex1.A
	int x;
	final int y = 1; // ��� -> ������ �� ���� ��
	A(){} // ������ -> �ڽ��� �̸��� ���� �Լ�
	void m1() {} // �޼���
	
	class In{} // Ŭ���� �ȿ� Ŭ����
	
	static {}// static ���
}
//Ŭ������ ������ Ÿ���̴�.

//���� �ڵ� ���� �� ���� ���� ���� �ڵ�
/*
	public class A extends Object{
	int x;
	A(A this){
		this.x = 0
	}
}
*/
