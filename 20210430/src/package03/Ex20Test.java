package package03;

public class Ex20Test {

	public static void main(String[] args) {
		String url = "https://news.naver.com/main/read.nhn";
		String contextPath = "/main";
		//�� �� ���ڿ��� �̿��Ͽ� /read.nhn�� ����Ͻÿ�.
		
		int idx = url.indexOf(contextPath);
		int i = contextPath.length();
		System.out.println(i);
		System.out.println(idx);	
		System.out.println(url.substring(idx+i));
		
		//����
		System.out.println(url.substring(url.indexOf(contextPath)+contextPath.length()));

	}

}
