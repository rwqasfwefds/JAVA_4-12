package ex;

public class MyMath2 {
	long a, b;
	
	long add() {return a + b;}
	long subtract() {return a - b;}
	long multiply() {return a * b;}
	double divide() {return a / b;}
	
//	전역메소드(클래스 메소드 정의)
	static long add(long a, long b) {return a + b;}
	static long subtract(long a, long b) {return a - b;}
	static long multiply(long a, long b) {return a * b;}
	static double divide(long a, long b) {return a / (double)b;}
}
