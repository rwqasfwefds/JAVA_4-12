package ex06;

public class Ex6_9 {

	public static void main(String[] args) {
//		클래스명으로 호출하는 것은 전역 변수 또는 전역 메소드
		System.out.println(MyMath2.add(200L, 100L));
		System.out.println(MyMath2.subtract(200L, 100L));
		System.out.println(MyMath2.multiply(200L, 100L));
		System.out.println(MyMath2.divide(200L, 100L));
		
//		new 연산자를 이용해 객체를 생성해서 쓰는 인스턴스 메소드(일반 메소드)
		MyMath2 mm = new MyMath2();
//		MyMath2 클래스의 객체 mm의 a, b값을 변경
		mm.a = 200L;
		mm.b = 100L;
		
//		일반 메소드(인스턴스 메소드) 호출
		System.out.println(mm.add());
		System.out.println(mm.subtract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());
	}

}
