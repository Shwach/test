package package03;

public class Ex12Test {

	public static void main(String[] args) {
		String name = "�̼���";
		String name1 = new String("�̼���");
		String name2 = "�̼���";
		
		if(name == name2) {
			System.out.println("�ּҰ� ����");
		}else {
			System.out.println("�ּҰ� �ٸ���");
		}
		
		if(name1 == name2) {
			System.out.println("�ּҰ� ����");
		}else {
			System.out.println("�ּҰ� �ٸ���");
		}
		System.out.println(name);
		
		Ex11Test ex = new Ex11Test();
		System.out.println(ex);
		
		if(name.equals(name2)) {
			System.out.println("���� ����.");
		}
		
		if(name1.equals(name2)) {
			System.out.println("���� ����.");
		}else {
			System.out.println("���� �ٸ���.");
		}
		
		
		

	}

}
