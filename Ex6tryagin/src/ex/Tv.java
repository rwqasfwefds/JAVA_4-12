// Ex6_1
package ex;

// 클래스 설명 : tv 속성과 기능이 추가된 클래스
class Tv {
//	Tv 속성
	String color = ""; // 색상
	boolean power = false; // 전원상태
	int channel = 0; //채널
	
//	Tv 기능(함수, 메소드)
//	tv 켜거나 끄는 기능을 하는 메소드 : toggle
	void power() {
		power = !power;
	}
//	Tv 채널을 높이는 기능을 하는 메소드
	void channelUp() {
		++channel;
	}
//	Tv 채널을 낮추는 기능을 하는 메소드
	void channelDown() {
		--channel;
	}
}