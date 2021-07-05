package ex20210701;

import java.util.Scanner;

public class MemberMain {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		Member[] members = new Member[100];
		boolean onOff = true;
		Member m = new Member();
		
		
		while(onOff) {
			
			int selectNum = m.menu();
			
			switch(selectNum) {
			
			case 1 : 
				
				for(int i=0; i<members.length; i++) {
					if(members[i] == null) {
						members[i] = m.signUp();
						break;	
					}
				}
				break;
				
				
			case 2 : 
				
					System.out.print("아이디 : ");
					String id2 = scan.next();
					
					System.out.print("비밀번호 : ");
					String pwd2 = scan.next();
					
				for(int i = 0; i<members.length; i++) {
					if(id2.equals(members[i].id) && pwd2.equals(members[i].pwd)) {
						System.out.println("로그인이 완료되었습니다. ");
						System.out.println("이름 : " + members[i].getName());
						System.out.println("전화번호 : " + members[i].getPhoneNumber());
						
						break;
					} else {
						continue;
					}
				}
				
				break;
				
			case 3 : 
				
				onOff = m.exit();
				break;
				
				
			}
		}
	}
}

class Member {
	
	String id;
	String pwd;
	private String name;
	private String phoneNumber;
	
	Scanner scan2 = new Scanner(System.in);
	
	public Member() {
		
	}
	
	public Member(String id, String pwd, String name, String phoneNumber) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	int menu() {
		
		System.out.println("기능을 선택하세요. ");
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 종료");
		
		int menuNum = scan2.nextInt();
		
		return menuNum;
		
	}
	
	Member signUp() {
		
		System.out.print("아이디 > ");
		String id = scan2.next();
		
		System.out.print("비밀번호 > ");
		String pwd = scan2.next();
		
		System.out.print("이름 > ");
		String name = scan2.next();
		
		System.out.print("전화번호 > ");
		String phoneNum = scan2.next();
		
		Member a = new Member(id, pwd, name, phoneNum);
		
		System.out.println("가입이 완료되었습니다. ");
		
		return a;
	}
	
	boolean exit() {
		System.out.println("시스템을 종료합니다.");
		
		boolean onOff = false;
		return onOff;
	}
}
