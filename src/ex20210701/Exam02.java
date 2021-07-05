package ex20210701;

public class Exam02 {
	
	public String field1 = "public";
	String field2 = "default";
	private String field3 = "private";
	
	public void method1() {
		System.out.println("public");
	}
	
	void method2() {
		System.out.println("default");
	}
	
	private void method3() {
		System.out.println("private");
	}
	
	private void check() {
		
		System.out.println("public" + this.field1);
		System.out.println("default" + this.field2);
		System.out.println("private" + this.field3);
		
		this.method1();
		this.method2();
		this.method3();
	}

}
