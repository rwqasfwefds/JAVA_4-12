package ex02;

public class Ex6_3 {

	public static void main(String[] args) {
//		Card Ŭ����
//		Ŭ������.���� : �������� ȣ����
//		new : ��ü ���� �� ��
		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.height = " + Card.height );
		
//		�ν��Ͻ� ����(�Ϲ� ����)�� �ٸ� ��ü�� ���� ����
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "spade";
		c2.number = 4;
		
//		�ν��Ͻ� ����(�Ϲ� ����) ���
		System.out.println("c1�� " + c1.kind + ", " + c1.number + "�̸�, ũ��� (" + c1.width + ", " + c1.height + ")");
		System.out.println("c2�� " + c2.kind + ", " + c2.number + "�̸�, ũ��� (" + c2.width + ", " + c2.height + ")");
		
//		���� ����(Ŭ���� ����) ����
		c1.width = 50;
		c1.height = 80;
		
//		�Ϲ� ����(�ν��Ͻ� ����), ���� ����(Ŭ���� ����)
		System.out.println("c1�� " + c1.kind + ", " + c1.number + "�̸�, ũ��� (" + c1.width + ", " + c1.height + ")");
		System.out.println("c2�� " + c2.kind + ", " + c2.number + "�̸�, ũ��� (" + c2.width + ", " + c2.height + ")");
	}

}