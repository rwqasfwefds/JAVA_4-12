package ex;

public class Exercise01 {

	public static void main(String[] args) {
//		다음과 같이 출력되도록 TV클래스를 작성하시오.
//		출력 값 : LG에서 만든 2017년형 32인치 TV
		TV myTv = new TV();
		
//		1번째 방법
//		myTv.show("LG", 2017, 32);
		
//		2번째 방법
//		myTv.show();		
		
//		3번째 방법
		myTv.brand = "LG";
		myTv.year = 2017;
		myTv.inch = 32;
		
		myTv.show();		

	}

}
