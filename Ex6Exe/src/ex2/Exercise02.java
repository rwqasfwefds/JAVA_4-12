package ex2;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
//		Ŭ������ �ۼ��� ������
//		3������ ������ �Է� �޾Ƽ� ���� ����� ����� ������
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("����, ����, ���� ������ 3���� ���� �Է�");
		int math = scanner.nextInt();
		int science = scanner.nextInt();
		int english = scanner.nextInt();
		
//		�Ʒ� Ŭ������ �ۼ��ϼ���
		Grade me = new Grade();
		//System.out.println("����� " + me.everage(math, science, english));
		
		System.out.printf("����� %.2f", me.everage(math, science, english));
	}

}