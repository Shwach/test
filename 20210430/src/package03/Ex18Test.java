package package03;

public class Ex18Test {

	public static void main(String[] args) {
		String text = "���� �ڹ� ���α׷��� �� �ϵ��� ����մϴ�.";
		String [] res = text.split(" ");
		System.out.println(res);
		for(String str : res) {
			System.out.println(str);
		}
		text = "��`��`�ڹ� `��`�α׷�`�� �� �ϵ��� �����`�ϴ�.";
		res = text.split("`");
		for(String str : res) {
			System.out.println(str);
		}
		
		
	}

	
	

}