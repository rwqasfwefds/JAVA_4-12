package ex;

public class Ex6_9 {

	public static void main(String[] args) {
//		MyMath2 Ŭ���� ���� �޼ҵ� ȣ�� : ��ü����(new) �ʿ� ����
		System.out.println(MyMath2.add(200L, 100L));
		System.out.println(MyMath2.subtract(200L, 100L));
		System.out.println(MyMath2.multiply(200L, 100L));
		System.out.println(MyMath2.divide(200L, 100L));
		
		MyMath2 mm = new MyMath2(); // ��ü ����
		mm.a = 200L;
		mm.b = 100L;
		
//		�ν��Ͻ� �޼���� ��ü ����(new) �� ��밡��
		System.out.println(mm.add());
		System.out.println(mm.subtract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());

	}

}
