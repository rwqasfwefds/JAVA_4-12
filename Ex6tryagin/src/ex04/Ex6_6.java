package ex04;

class Data {
	int x;
}

// ȭ�� ���
public class Ex6_6 {

	public static void main(String[] args) {
//		Data Ŭ������ ��ü ����
		Data d = new Data();
//		��ü d�� �ν��Ͻ� ���� x = 10
		d.x = 10;
		
//		1st ���
		System.out.println("main() : x = " + d.x);

//		2nd ���
//		�Ű����� d.x = 10 �� ���� �ѱ�
		change(d.x);
		
//		3rd ���
//		change() �޼ҵ带 ȣ���ϰ����� ���� d.x ���� ���������? ��°� ���� ���� == �ƴ� ����
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);
	}
	
//	���� �޼ҵ�
//	�Ű����� : �⺻��(����)
	static void change(int x) {
//		�Ű����� x�� 1000���� ���� ����
//		�Ű����� x = 10�� ���µ�
		x = 1000; // ���⼭ �ٽ� x���� 1000���� ���� ��
		System.out.println("change() : x = " + x);
	}

}