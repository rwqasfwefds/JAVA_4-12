// Ex6_1
package ex;

// Ŭ���� ���� : tv �Ӽ��� ����� �߰��� Ŭ����
class Tv {
//	Tv �Ӽ�
	String color = ""; // ����
	boolean power = false; // ��������
	int channel = 0; //ä��
	
//	Tv ���(�Լ�, �޼ҵ�)
//	tv �Ѱų� ���� ����� �ϴ� �޼ҵ� : toggle
	void power() {
		power = !power;
	}
//	Tv ä���� ���̴� ����� �ϴ� �޼ҵ�
	void channelUp() {
		++channel;
	}
//	Tv ä���� ���ߴ� ����� �ϴ� �޼ҵ�
	void channelDown() {
		--channel;
	}
}