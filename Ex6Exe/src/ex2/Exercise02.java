package ex2;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
//		클래스를 작성해 보세요
//		3과목의 점수를 입력 받아서 성적 평균을 출력해 보세요
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("수학, 과학, 영어 순으로 3개의 정수 입력");
		int math = scanner.nextInt();
		int science = scanner.nextInt();
		int english = scanner.nextInt();
		
//		아래 클래스를 작성하세요
		Grade me = new Grade();
		//System.out.println("평균은 " + me.everage(math, science, english));
		
		System.out.printf("평균은 %.2f", me.everage(math, science, english));
	}

}