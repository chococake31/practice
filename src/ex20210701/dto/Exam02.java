package ex20210701.dto;

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

}
