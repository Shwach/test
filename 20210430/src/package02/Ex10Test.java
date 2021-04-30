package package02;

public class Ex10Test {

	public static void main(String[] args) {
		
		long startTime = System.nanoTime(); //시작시간
		
		int sum = 0;
		for(int i = 1; i <= 1000000; i++) {
			sum += i;
		}
		System.out.println("1~1000000 까지의 합 : " + sum);
		
		long endTime = System.nanoTime(); 
		System.out.println("실행 시간은 " + (endTime - startTime) + " 나노초 걸렸습니다.");
		
		
		startTime = System.currentTimeMillis(); //시작시간
		
		sum = 0;
		for(int i = 1; i <= 1000000; i++) {
			sum += i;
		}
		System.out.println("1~1000000 까지의 합 : " + sum);
		
		endTime = System.currentTimeMillis();
		System.out.println("실행 시간은 " + (endTime - startTime) + "/1000초 걸렸습니다.");
		
		
	}

}
