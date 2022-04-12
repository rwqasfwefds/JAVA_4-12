package ex05;

class Data3{
	int x;
}
public class Ex6_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data3 d = new Data3();
		d.x = 10;
		
//		Data3 클래스의 객체 d를 매개변수로 넘김
		Data3 d2 = copy(d);
		
//		메모리 주소 복사
		System.out.println("d.x = " + d.x);
		System.out.println("d2.x = " + d2.x);
	}

//	매개변수에 자료형을 적어줘야 하잖슴?
//	근데 지금은 참조형 한마디로 객체형태로 받을거임 위에서 d라는 객체를 주는거니깐
//	그러면 원래 매개변수에 일반형을 적어주면 int a 라는 매개변수 값을 주잖아 int라는 자료형을 적어주고 그대로 값은 a로 들어오고
//	그러면 똑같이 객체형태로 받을려면 우리가 위에서 만든 객체형인 Data3를 그대로 자료형으로 적어주고 뒤에 값을 받을 놈을 적어주면 됨
//	지금 아래 매개변수의 d는 그냥 같게 보이기 위해 적은 놈이고 얘를 a,b 기타등등 다 바꿔줘도 됨
//	한 마디로 자료형이랑 비교하면 int == Data3, a == d 라는 말
	static Data3 copy(Data3 d) {
		Data3 tmp = new Data3();
		
		tmp.x = d.x;
		
		return tmp;
	}
}
