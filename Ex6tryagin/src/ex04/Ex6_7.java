package ex04;

class Data {
	int x;
}

// 화면 출력
public class Ex6_7 {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		
		System.out.println("main() : x = " + d.x);

		change(d);
		
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);
	}
	
//	매개 변수가 객체일 경우(다른 말로 참조형 일 경우) 값을 변경하면 영구적으러 변경 됨
//	매개 변수가 기본형(정수, 실수, 문자) 값을 변경하면 원본에 영향이 없음
//	얇은 복사랑 같은 개념임
//	위에 change에 있는 매개변수 d가 카피본이고 맨 위에 만들어져 있는 놈이 원본임
//	일단 ppt랑 같이 보자
	static void change(Data d) {
//		매개 변수 d.x = 10
		d.x = 1000; // x = 1000으로 변경을 가한 시점부터 객체의 값이 영구적으로 변경
		System.out.println("change() : x = " + d.x);
	}

}
