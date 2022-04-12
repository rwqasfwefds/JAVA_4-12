// Ex_6-3
//package ex;
//
//public class Ex6 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.out.println("Card.width = " + Card.width);
//		System.out.println("Card.height = " + Card.height);
//		
//		Card c1 = new Card();
//		c1.kind = "Heart";
//		c1.number = 7;
//		
//		Card c2 = new Card();
//		c2.kind = "Spade";
//		c2.number = 4;
//		
//		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")");
//		System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")");
//		System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다,");
//		c1.width = 50;
//		c1.height = 80;
//		
//		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")");
//		System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")");
//	}
//
//}
//
//class Card{
//	String kind;
//	int number;
//	static int width = 100;
//	static int height = 250;
//}


// 강사님 예제
//package ex;
//
//public class Ex6 {
//	
//	public static class StaticTest{
//		static int classVar = 10;
//		int instanceVar = 20;
//	}
//	
//	public static void main(String[] args) {
////		StaticTest 객체 1
//		StaticTest staticTest1 = new StaticTest();
////		StaticTest 객체 2
//		StaticTest staticTest2 = new StaticTest();
//		
//		System.out.println("1. " + StaticTest.classVar + ", " + staticTest1.instanceVar);
//		System.out.println("2. " + StaticTest.classVar + ", " + staticTest2.instanceVar);
//		
////		값을 변경
//		staticTest1.classVar = 12; // 객체 1에서 classVar 값을 12로 변경
//		staticTest1.instanceVar = 400; // 객체 1에서 instanceVar 값을 400으로 변경
//		
//		System.out.println("------------------------------------------------------------");
////		객체 1 값을 출력
//		System.out.println("1. " + staticTest1.classVar + ", " + staticTest1.instanceVar);
////		객체 2 값을 출력
//		System.out.println("2. " + staticTest2.classVar + ", " + staticTest2.instanceVar);
//	}
//	
//}

// Ex6_4
//package ex;
//
//public class Ex6 {
//	
//	public static void main(String[] args) {
//		MyMath mm = new MyMath();
//		long result1 = mm.add(5L, 3L);
//		long result2 = mm.subtract(5L, 3L);
//		long result3 = mm.multiply(5L, 3L);
//		double result4 = mm.divide(5L, 3L);
//		
//		System.out.println("add(5L, 3L) = " + result1);
//		System.out.println("subtract(5L, 3L) = " + result2);
//		System.out.println("multiply(5L, 3L) = " + result3);
//		System.out.println("divide(5L, 3L) = " + result4);
//	}
//	
//}
//
//class MyMath{
//	long add(long a, long b) {
//		long result = a + b;
//		return result;
//	}
//	long subtract(long a, long b) {
//		return a - b;
//	}
//	long multiply(long a, long b) {
//		return a * b;
//	}
//	double divide(double a, double b) {
//		return a / b;
//	}
//}

// Ex6_6
//package ex;
//
//class Data{int x;}
//
//public class Ex6 {
//	
//	public static void main(String[] args) {
//		Data d = new Data();
//		d.x = 10;
//		System.out.println("main() : x = " + d.x);
//		
//		change(d.x);
//		System.out.println("After change(d.x)");
//		System.out.println("main() : x = " + d.x);
//	}
//	static void change(int x) {
//		x = 1000;
//		System.out.println("change() : x = " + x);
//	}
//	
//}

// Ex6_7
//package ex;
//
//class Data2{int x;}
//
//public class Ex6 {
//	
//	public static void main(String[] args) {
//		Data2 d = new Data2();
//		d.x = 10;
//		System.out.println("main() : x = " + d.x);
//		
//		change(d);
//		System.out.println("After change(d)");
//		System.out.println("main() : x = " + d.x);
//	}
//	static void change(Data2 d) {
//		d.x = 1000;
//		System.out.println("change() : x = " + d.x);
//	}
//}

// Ex6_8
package ex;

class Data3{int x;}

public class Ex6 {
	
	public static void main(String[] args) {
		Data3 d = new Data3();
		d.x = 10;
		
		Data3 d2 = copy(d);
		System.out.println("d.x = " + d.x);
		System.out.println("d2.x = " + d2.x);
	}
	static Data3 copy(Data3 d) {
		Data3 tmp = new Data3();
		tmp.x = d.x;
		return tmp;
	}
}