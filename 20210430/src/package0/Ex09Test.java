package package0;

import java.util.HashMap;

public class Ex09Test {

	public static void main(String[] args) {
		HashMap<String, Ex09> map = new HashMap<String, Ex09>();
		Ex09 ex09 = new Ex09("ID1","E-MAIL1","이름1");
		map.put(ex09.getUserId(), ex09);
		ex09 = new Ex09("ID2","E-MAIL2","이름2");
		map.put(ex09.getUserId(), ex09);
		ex09 = new Ex09("ID3","E-MAIL3","이름3");
		map.put(ex09.getUserId(), ex09);
		ex09 = new Ex09("ID4","E-MAIL4","이름4");
		map.put(ex09.userId, ex09);
		
		for(String key : map.keySet()) {
			ex09 = map.get(key);
			System.out.println(ex09.getUserId() + "," + ex09.getUserEmail() + "," + ex09.getUserName());
		}
		

	}

}
