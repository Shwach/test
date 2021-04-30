package package01;

public class Ex05Test {

	public static void main(String[] args) {
		Ex02 ex1 = new Ex02("이름1");
		Ex02 ex2 = new Ex02("이름2");
		Ex02 ex3 = new Ex02("이름1");
		Ex04 ex4 = new Ex04();
		
		if(ex1.equals(ex2)) {
			System.out.println("ex1과 ex2는 같다.");
		}else {
			System.out.println("ex1과 ex2는 동일한 값이 아닙니다.");
		}
		
		if(ex1.equals(ex3)) {
			System.out.println("ex1과 ex2는 같다.");
		}else {
			System.out.println("ex1과 ex2는 동일한 값이 아닙니다.");
		}
		
		if(ex1.equals(ex4)) {
			System.out.println("같은 클래스로 만든 객체입니다.");
		}else {
			System.out.println("다른 클래스로 만든 객체입니다.");
		}
		

	}

}
