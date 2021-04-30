package package03;

import java.util.StringTokenizer;

public class Ex19Test {

	public static void main(String[] args) {
		String text = "홍길동/이수홍/박연수";
		StringTokenizer st = new StringTokenizer(text, "/");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}

	}
	
	
	/*
	 * charAt() : 인덱스에 해당하는 문자 가져오기
	 * equals() : 문자열이 같은지 비교
	 * getBytes() : 문자열을 byte로 / 크기를 알 수 있다 / 암호화 시킬 수 있다
	 * indexOf() : 문자나 문자열의 index 출력
	 * length() : 문자열의 문자 갯수(크기X)
	 * replace() : 문자열 바꾸기 함수
	 * substring() : 문자열 자르기
	 * toLowerCase() : 모두 소문자로
	 * toUpperCase() : 모두 대문자로
	 * trim() : 앞뒤 문자열의 공백문자 제거
	 * valueOf() : 기본자료형을 문자열로 
	 * split() : 문자열을 구분문자를 기준으로 배열로 반환
	 */

}
