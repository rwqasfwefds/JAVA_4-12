package ex04;

class Data {
	int x;
}

// ȭ�� ���
public class Ex6_7 {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		
		System.out.println("main() : x = " + d.x);

		change(d);
		
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);
	}
	
//	�Ű� ������ ��ü�� ���(�ٸ� ���� ������ �� ���) ���� �����ϸ� ���������� ���� ��
//	�Ű� ������ �⺻��(����, �Ǽ�, ����) ���� �����ϸ� ������ ������ ����
//	���� ����� ���� ������
//	���� change�� �ִ� �Ű����� d�� ī�Ǻ��̰� �� ���� ������� �ִ� ���� ������
//	�ϴ� ppt�� ���� ����
	static void change(Data d) {
//		�Ű� ���� d.x = 10
		d.x = 1000; // x = 1000���� ������ ���� �������� ��ü�� ���� ���������� ����
		System.out.println("change() : x = " + d.x);
	}

}