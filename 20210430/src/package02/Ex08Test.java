package package02;

public class Ex08Test {

	public static void main(String[] args) {
		
		Ex06 ex1 = new Ex06("회사1","맥");
		Ex06 ex2 = new Ex06("회사2","윈도우");
		Ex07 ex3 = new Ex07();
		
		if(ex1.equals(ex2)) {
			System.out.println("같은 클래스로 만들어진 객체");
		}else {
			System.out.println("다른 클래스로 만들어진 객체");
		}
		
		if(ex1.equals(ex3)) {
			System.out.println("같은 클래스로 만들어진 객체");
		}else {
			System.out.println("다른 클래스로 만들어진 객체");
		}
		
		String str = ex1.toString();
		System.out.println(str);
		
		str = ex2.toString();
		System.out.println(str);
		
		
		
		

	}

}
