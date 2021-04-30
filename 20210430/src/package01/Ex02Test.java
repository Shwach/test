package package01;

public class Ex02Test {

	public static void main(String[] args) {
		Ex02 ex1 = new Ex02("id1");
		Ex02 ex2 = new Ex02("id2");
		Ex02 ex3 = new Ex02("id1");
		
		Ex04 ex4 = new Ex04();
		ex4.setUserId("이름");
		System.out.println(ex4.getUserId());
		Ex04 ex5 = new Ex04();
		ex5.setUserId("이름2");
		System.out.println(ex5.getUserId());
		Ex04 ex6 = new Ex04();
		ex6.setUserId("이름3"); // 객체명은 객체 내에서 this가 된다.
		System.out.println(ex6.getUserId()); 
		
		ex1.equals(ex2);
		
		System.out.println(ex1.equals(ex2));
		System.out.println(ex1.equals(ex1));
	

	}

}
