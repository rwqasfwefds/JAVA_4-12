package ex4;

import java.awt.Rectangle;

public class Excercise04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		���� ����� ������ ���簢���� ǥ���ϴ� Rectangle Ŭ������ �ۼ��ϰ� ����ϼ�
//		1) int Ÿ���� x, y, width, height : �簢���� �����ϴ� ���� ũ�� ����
//		2) int square : �簢���� ���̸� �����ϴ� �޼ҵ�
//		3) void show : �簢���� ��ǥ(x, y)�� ���̸� ȭ�鿡 ����ϴ� �޼ҵ�
		Rectangle rect = new Rectangle();
		
		rect.x = 2;
		rect.y = 2;
		rect.width = 8;
		rect.height = 7;
		
		rect.show(); // �簢�� ��ǥ�� ���
		System.out.println("rect�� ������ " + rect.square()); // ���̸� ��� 
	}

}