package ex06;

public class Ex6_9 {

	public static void main(String[] args) {
//		Ŭ���������� ȣ���ϴ� ���� ���� ���� �Ǵ� ���� �޼ҵ�
		System.out.println(MyMath2.add(200L, 100L));
		System.out.println(MyMath2.subtract(200L, 100L));
		System.out.println(MyMath2.multiply(200L, 100L));
		System.out.println(MyMath2.divide(200L, 100L));
		
//		new �����ڸ� �̿��� ��ü�� �����ؼ� ���� �ν��Ͻ� �޼ҵ�(�Ϲ� �޼ҵ�)
		MyMath2 mm = new MyMath2();
//		MyMath2 Ŭ������ ��ü mm�� a, b���� ����
		mm.a = 200L;
		mm.b = 100L;
		
//		�Ϲ� �޼ҵ�(�ν��Ͻ� �޼ҵ�) ȣ��
		System.out.println(mm.add());
		System.out.println(mm.subtract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());
	}

}