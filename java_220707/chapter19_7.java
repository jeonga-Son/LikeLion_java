//code.oa.gg/java8/938
// ���� : �Ʒ��� ���� ��µǵ��� ���ּ���. init() �޼��忡 ���ؼ� ��µǾ�� �մϴ�.
// ���� : ��� Ŭ������ �����ڴ� ����� �� �����ϴ�.
// ��Ʈ : ��� �����ڴ� �ڽ��� ���� �ϱ� ���� super(); ���� �����մϴ�.
// ��Ʈ : ��� �����ڴ� �ڽ��� ���� �ϱ� ���� �θ�Ŭ������ ������ ���� �����մϴ�.

package java_220707;

public class chapter19_7 {

	public static void main(String[] args) {
		new ���4();
		// ��� : ����� �ʱ�ȭ �˴ϴ�.
	}
}

class ����3 {
	����3 () {
		init();
	}
	
	void init() {}
}

class ���4 extends ����3 {
	
// �̰� ��� �������.	
//	���4() {
//		super();
//	} 
	
	void init() {
		System.out.println("����� �ʱ�ȭ �˴ϴ�.");
	}
}