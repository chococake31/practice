package ex20210701;

public class SingletonMain {

	public static void main(String[] args) {
		
		Singleton s = Singleton.getInstance(); // 객체 생성 
		
		s.setField("안녕하세요. ");
		
		System.out.println(s.getField());
		Singleton s2 = Singleton.getInstance();
		System.out.println(s2.getField());
	}
}


class Singleton {
	
	private String field;
	
	private static Singleton s = new Singleton(); // 객체를 private으로 지정함 
	
	private Singleton() {
	
	}
	
	public static Singleton getInstance() {
		return s;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}
}
