package ex05;

class Data3{
	int x;
}
public class Ex6_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data3 d = new Data3();
		d.x = 10;
		
//		Data3 Ŭ������ ��ü d�� �Ű������� �ѱ�
		Data3 d2 = copy(d);
		
//		�޸� �ּ� ����
		System.out.println("d.x = " + d.x);
		System.out.println("d2.x = " + d2.x);
	}

//	�Ű������� �ڷ����� ������� ���ݽ�?
//	�ٵ� ������ ������ �Ѹ���� ��ü���·� �������� ������ d��� ��ü�� �ִ°Ŵϱ�
//	�׷��� ���� �Ű������� �Ϲ����� �����ָ� int a ��� �Ű����� ���� ���ݾ� int��� �ڷ����� �����ְ� �״�� ���� a�� ������
//	�׷��� �Ȱ��� ��ü���·� �������� �츮�� ������ ���� ��ü���� Data3�� �״�� �ڷ������� �����ְ� �ڿ� ���� ���� ���� �����ָ� ��
//	���� �Ʒ� �Ű������� d�� �׳� ���� ���̱� ���� ���� ���̰� �긦 a,b ��Ÿ��� �� �ٲ��൵ ��
//	�� ����� �ڷ����̶� ���ϸ� int == Data3, a == d ��� ��
	static Data3 copy(Data3 d) {
		Data3 tmp = new Data3();
		
		tmp.x = d.x;
		
		return tmp;
	}
}