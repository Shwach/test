package package01;

public class Ex02 {
	// �ڷ��� ������ = ��;

	String id;

	public Ex02(String id) {
		this.id = id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return this.id;
	}
	
	
	// ����ϰ� �ִ� ��ü�� �� Ŭ������ ����������� �� 
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Ex02) {
			Ex02 ex = (Ex02)obj;
			System.out.println(ex.getId());
			return true; 
		}else {
			System.out.println("�ٸ� ���Դϴ�.");
			return false;
		}	
			
		
	}
	

}