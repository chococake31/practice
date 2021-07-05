package ex20210701;

public class SingletonMain2 {

	public static void main(String[] args) {
		
		Singleton2 s = Singleton2.getInstance();
		
		s.setNumber(100);
		System.out.println(s.getNumber());
		

	}

}

class Singleton2 {
	
	private Singleton2() {
		
	}
	
	private static Singleton2 s = new Singleton2();
	
	private int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public static Singleton2 getInstance() {
		return s;
	}
	
	
}
