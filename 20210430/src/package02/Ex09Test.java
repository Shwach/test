package package02;

import java.util.Scanner;

public class Ex09Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ���α׷��� ����");
		while (true) {
			System.out.println("���α׷��� �����Ϸ��� exit");
			System.out.print("���۴��� �Է� : ");
			String data1 = sc.nextLine();
			System.out.print("������ �Է��ϼ��� : ");
			String data2 = sc.nextLine();
			
			if(data1.equals("exit")||data2.equals("exit")) {
				System.out.println("���α׷��� �����մϴ�.");
				sc.close();
				System.exit(0); // ���α׷� ���� /// break�� �ݺ����� ����				
			}

			int startDan = Integer.parseInt(data1);
			int endDan = Integer.parseInt(data2);

			for (int dan = startDan; dan <= endDan; dan++) {
				for (int gop = 1; gop <= 9; gop++) {
					System.out.println(dan + " * " + gop + " = " + dan * gop);
				}
			}
		}
		

	}

}
