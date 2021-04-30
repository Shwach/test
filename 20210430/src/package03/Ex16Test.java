package package03;

public class Ex16Test {

	public static void main(String[] args) {
		String ssn = "881212-1234567";
		//            01234567890123
		System.out.println(ssn.substring(0,8)+"******");
		
		int idx = ssn.indexOf("-");
		System.out.println(idx);
		
		System.out.println(ssn.substring(0,idx));
		
		System.out.println(ssn.substring(idx+1));
		//¿ùÀÏ
		System.out.println(ssn.substring(idx-4,idx));
		
		System.out.println(ssn.substring(2,6));
		
		
		String str = "123456789";
		idx = str.indexOf('3');
		System.out.println(idx);
		System.out.println(str.substring(idx, idx+4));
		System.out.println(str.substring(2,6));
		

	}

}
