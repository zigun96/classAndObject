package sec01_createobjectandusageofmembers.EX01_CreateObjectAndUsageOfMembers;

// Ŭ���� (�ؾ ���) ����
class A{
	int m = 3;
	void print() {
		System.out.println("��ü ���� �� Ȱ��");
	}
}

public class CreateObjectAndUsageOfMembers {
	public static void main (String[] args) {
		// Ŭ������ ��ü (�ؾ) ����
		A a = new A();
		
		// Ŭ���� �ɹ� Ȱ�� (�ؾ �Ա�)
		// @�ʵ� Ȱ��: �ʵ忡 ���� �б�/����
		a.m = 5;
		System.out.println(a.m);
		
		// @�޼��� Ȱ��: �޼��带 ȣ��
		a.print();
	}
}
