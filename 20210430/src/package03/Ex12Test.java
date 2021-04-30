package package03;

public class Ex12Test {

	public static void main(String[] args) {
		String name = "이숭무";
		String name1 = new String("이숭무");
		String name2 = "이숭무";
		
		if(name == name2) {
			System.out.println("주소가 같다");
		}else {
			System.out.println("주소가 다르다");
		}
		
		if(name1 == name2) {
			System.out.println("주소가 같다");
		}else {
			System.out.println("주소가 다르다");
		}
		System.out.println(name);
		
		Ex11Test ex = new Ex11Test();
		System.out.println(ex);
		
		if(name.equals(name2)) {
			System.out.println("값이 같다.");
		}
		
		if(name1.equals(name2)) {
			System.out.println("값이 같다.");
		}else {
			System.out.println("값이 다르다.");
		}
		
		
		

	}

}
