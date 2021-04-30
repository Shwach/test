package package03;

import java.util.StringTokenizer;

public class Ex19Test {

	public static void main(String[] args) {
		String text = "ȫ�浿/�̼�ȫ/�ڿ���";
		StringTokenizer st = new StringTokenizer(text, "/");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}

	}
	
	
	/*
	 * charAt() : �ε����� �ش��ϴ� ���� ��������
	 * equals() : ���ڿ��� ������ ��
	 * getBytes() : ���ڿ��� byte�� / ũ�⸦ �� �� �ִ� / ��ȣȭ ��ų �� �ִ�
	 * indexOf() : ���ڳ� ���ڿ��� index ���
	 * length() : ���ڿ��� ���� ����(ũ��X)
	 * replace() : ���ڿ� �ٲٱ� �Լ�
	 * substring() : ���ڿ� �ڸ���
	 * toLowerCase() : ��� �ҹ��ڷ�
	 * toUpperCase() : ��� �빮�ڷ�
	 * trim() : �յ� ���ڿ��� ���鹮�� ����
	 * valueOf() : �⺻�ڷ����� ���ڿ��� 
	 * split() : ���ڿ��� ���й��ڸ� �������� �迭�� ��ȯ
	 */

}
