package ex;

public class Exercise01 {

	public static void main(String[] args) {
//		������ ���� ��µǵ��� TVŬ������ �ۼ��Ͻÿ�.
//		��� �� : LG���� ���� 2017���� 32��ġ TV
		TV myTv = new TV();
		
//		1��° ���
//		myTv.show("LG", 2017, 32);
		
//		2��° ���
//		myTv.show();		
		
//		3��° ���
		myTv.brand = "LG";
		myTv.year = 2017;
		myTv.inch = 32;
		
		myTv.show();		

	}

}
