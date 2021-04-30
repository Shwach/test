package package03;

public class Ex17Test {

	public static void main(String[] args) {
		String str = "1234567";
		System.out.println(str.substring(2,6));
		int idx = str.indexOf('3');
		System.out.println(idx);
		System.out.println(str.substring(idx,idx+4));
		
		str = "abcdefghijklmnopqrstuvwxyz";
		idx = str.indexOf("l");
		System.out.println(idx);
		System.out.println(str.substring(idx, idx+3));
		
		//데이터도 대소문자 구별함
		String str1 = "Java Programming";
		String str2 = "JAVA Programming";
		System.out.println(str1.equals(str2));
		
		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();
		
		System.out.println(lowerStr1);
		System.out.println(lowerStr2);
		System.out.println(lowerStr1.equals(lowerStr2));
		
		String upperStr1 = str1.toUpperCase();
		String upperStr2 = str2.toUpperCase();
		System.out.println(upperStr1);
		System.out.println(upperStr2);
		
		String str3 = " 이숭무";
		if(str3.trim().equals("이숭무")) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		str3 = " 이 숭 무"; //가운데 있는 공백문자는 제거 대상이 아니다.
		if(str3.trim().equals("이숭무")) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		str3 = " 1이 숭무1";
		System.out.println(str3.trim());
		
		int i = 10;
		double d = 10.5;
		boolean b = true;
		String i1 = "10";
		int result = Integer.parseInt(i1);
		System.out.println(result);
		String result1 = String.valueOf(i);
		System.out.println(result1);
		result1 = String.valueOf(b);
		System.out.println(result1);
		
		
		
	}

}
