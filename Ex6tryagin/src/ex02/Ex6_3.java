package ex02;

public class Ex6_3 {

	public static void main(String[] args) {
//		Card 클래스
//		클래스명.변수 : 전역변수 호출방법
//		new : 객체 생성 안 함
		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.height = " + Card.height );
		
//		인스턴스 변수(일반 변수)는 다른 객체에 영향 없음
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "spade";
		c2.number = 4;
		
//		인스턴스 변수(일반 변수) 출력
		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")");
		System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")");
		
//		전역 변수(클래스 변수) 변경
		c1.width = 50;
		c1.height = 80;
		
//		일반 변수(인스턴스 변수), 전역 변수(클래스 변수)
		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")");
		System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")");
	}

}
