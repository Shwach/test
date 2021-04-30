package package02;

import java.util.Scanner;

public class Ex09Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단 프로그램이 실행");
		while (true) {
			System.out.println("프로그램을 종료하려면 exit");
			System.out.print("시작단을 입력 : ");
			String data1 = sc.nextLine();
			System.out.print("끝단을 입력하세요 : ");
			String data2 = sc.nextLine();
			
			if(data1.equals("exit")||data2.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				System.exit(0); // 프로그램 종료 /// break는 반복문만 종료				
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
