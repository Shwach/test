package package03;

public class Ex18Test {

	public static void main(String[] args) {
		String text = "나는 자바 프로그램을 잘 하도록 노력합니다.";
		String [] res = text.split(" ");
		System.out.println(res);
		for(String str : res) {
			System.out.println(str);
		}
		text = "나`는`자바 `프`로그램`을 잘 하도록 노력합`니다.";
		res = text.split("`");
		for(String str : res) {
			System.out.println(str);
		}
		
		
	}

	
	

}
