package ex06;

public class MyMath2 {
//	�Ϲ� ����(�ν��Ͻ� ����)
	long a, b;
	
//	�Ϲ� �޼ҵ�(�ν��Ͻ� �޼ҵ�)
	long add() {
		return a + b;
	}
	long subtract() {
		return a - b;
	}
	long multiply() {
		return a * b;
	}
	double divide() {
		return a / b;
	}
	
//	���� �޼ҵ�
	static long add(long a, long b) {
		return a + b;
	}
	static long subtract(long a, long b) {
		return a - b;
	}
	static long multiply(long a, long b) {
		return a * b;
	}
	static double divide(long a, long b) {
		return a / (double)b;
	}
}