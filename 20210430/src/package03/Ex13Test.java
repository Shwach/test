package package03;

public class Ex13Test {

	public static void main(String[] args) {
		String subject = "�ڹ� ���α׷���";
		///               0 1234 567
		char ch = subject.charAt(3);
		System.out.println(ch); //���鹮�ڵ� ������
		
		int idx = subject.indexOf("��");
		System.out.println(idx);
		
		idx = subject.indexOf("�׷���");
		System.out.println(idx); //ù��° ���ڰ� �ִ� �ε����� ������
		
		idx = subject.indexOf("�̼���");
		System.out.println(idx);
		
		if(subject.indexOf("�̼���") != -1) {
			System.out.println("�̼����� �ֽ��ϴ�.");
		}else {
			System.out.println("�̼����� �����ϴ�.");
		}
		
		int count = subject.length(); //���ڿ��� ����
		System.out.println(count);
		
		int i [] = new int[3];
		count = i.length; //�迭�� ũ��
		System.out.println(count);
		

	}

}
