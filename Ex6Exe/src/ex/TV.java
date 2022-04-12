package ex;

public class TV {
//	인스턴스 변수 : 문자열 brand
//	인스턴스 변수 : 정수 year
//	인스턴스 변수 : 정수 inch
//	show 메소드를 작성하세요
//	출력 함수 작성 show : brand 에서 만든 year 년형 inch 인치 Tv

//	1번째 방법(가장 좋은 방법)
//	void show(String brand, int year, int inch){
//		System.out.println(brand + "에서 만든 " + year + "년형 " + inch + "인치 Tv");
//	}
	
//	2번째 방법
//	String brand = "LG";
//	int year = 2017;
//	int inch = 32;
//	
//	void show() {
//		System.out.println(brand + "에서 만든 " + year + "년형 " + inch + "인치 Tv");
//	}
	
//	3번째 방법
	String brand;
	int year;
	int inch;
	
	void show() {
		System.out.println(brand + "에서 만든 " + year + "년형 " + inch + "인치 Tv");
	}
}
