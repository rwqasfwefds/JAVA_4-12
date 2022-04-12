package ex06;

public class MyMath2 {
//	일반 변수(인스턴스 변수)
	long a, b;
	
//	일반 메소드(인스턴스 메소드)
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
	
//	전역 메소드
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
