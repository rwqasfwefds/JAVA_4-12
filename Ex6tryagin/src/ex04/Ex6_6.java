package ex04;

class Data {
	int x;
}

// 화면 출력
public class Ex6_6 {

	public static void main(String[] args) {
//		Data 클래스의 객체 생성
		Data d = new Data();
//		객체 d의 인스턴스 변수 x = 10
		d.x = 10;
		
//		1st 출력
		System.out.println("main() : x = " + d.x);

//		2nd 출력
//		매개변수 d.x = 10 인 값을 넘김
		change(d.x);
		
//		3rd 출력
//		change() 메소드를 호출하고나서 변수 d.x 값이 변했을까요? 라는걸 묻는 문제 == 아니 ㅄ아
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);
	}
	
//	전역 메소드
//	매개변수 : 기본형(정수)
	static void change(int x) {
//		매개변수 x에 1000으로 값을 변경
//		매개변수 x = 10이 들어갔는데
		x = 1000; // 여기서 다시 x값에 1000으로 덮어 씀
		System.out.println("change() : x = " + x);
	}

}
