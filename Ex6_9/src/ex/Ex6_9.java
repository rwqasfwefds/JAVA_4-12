package ex;

public class Ex6_9 {

	public static void main(String[] args) {
//		MyMath2 클래스 전역 메소드 호출 : 객체생성(new) 필요 없음
		System.out.println(MyMath2.add(200L, 100L));
		System.out.println(MyMath2.subtract(200L, 100L));
		System.out.println(MyMath2.multiply(200L, 100L));
		System.out.println(MyMath2.divide(200L, 100L));
		
		MyMath2 mm = new MyMath2(); // 객체 생성
		mm.a = 200L;
		mm.b = 100L;
		
//		인스턴스 메서드는 객체 생성(new) 후 사용가능
		System.out.println(mm.add());
		System.out.println(mm.subtract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());

	}

}
