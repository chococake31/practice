package ex20210701;

import java.util.Scanner;

public class BoardMain {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		Board[] board = new Board[50];
		
		Board b = new Board();
		
		boolean onOff = true;
		
		int count = 0;
		
		while(onOff) {
			
			int selectNum = b.menu();
			
			switch(selectNum) {
			
			case 1 : 
				
					if(board[0] == null) {
						System.out.println("작성된 글이 없습니다.");
					} else {
						for(int i = 0; i<board.length; i++) {
						if(board[i] != null) { // 내용이 있으면 
							System.out.println((i+1) + ". " + board[i].getTitle());
							continue;
						} else if (board[i] == null) { // 내용이 없으면 
							continue;
						}
						
						}
						
						int number = b.textOpen();
						
						System.out.println("제목 : " + board[number-1].getTitle());
						System.out.println("작성자 : " + board[number-1].getWriter());
						System.out.println("내용 : " + board[number-1].getText());
						
					}
					
					break;
					
				
					
			case 2 : 
				
				Board bb = b.write(); 
				
				for(int i = 0; i<board.length; i++) {
					if(board[i] == null) {
						board[i] = bb;
						System.out.println((i+1) + "번째 글이 작성되었습니다. ");
						break;
					} else {
						continue;
					}
				}
				
				
				
				break;
				
			case 3 : 
				
				int modiNum = b.modify();
				
				if(modiNum == 00) {
					
					break;
				} else {
					System.out.println("해당 글의 비밀번호를 입력하세요. ");
					String textPwd = scan.next();
					if((textPwd.equals(board[modiNum-1].getPwd()))) {
						System.out.println("수정할 글의 내용을 입력하세요 ");
						String text = scan.next();
						board[modiNum-1].setText(text);
						System.out.println(modiNum + "번 게시물의 내용이 변경되었습니다. ");
						
					} else {
						System.out.println("비밀번호가 잘못되었습니다.");
						break;
					}
				}
				
				
				
			}
			
		}
		
	}

}

class Board {
	
	private String title;
	private String writer;
	private String text;
	private String pwd;
	
	Scanner scan2 = new Scanner(System.in);
	
	Board() {
		
	}
	
	Board(String title, String writer, String text, String pwd) {
		this.title = title;
		this.writer = writer;
		this.text = text;
		this.pwd = pwd;
	}
	
	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	int menu() {
		
		System.out.println("메뉴를 선택하세요. ");
		System.out.println("1. 글 목록 보기 ");
		System.out.println("2. 글 작성  ");
		System.out.println("3. 글 수정  ");
		System.out.println("4. 글 삭제  ");
		
		int menuNum = scan2.nextInt();
		
		return menuNum;
		
	}
	
	Board write() {
		
		System.out.println("제목> ");
		String title = scan2.next();
		
		System.out.print("작성자> ");
		String author = scan2.next();
		
		System.out.println("내용> ");
		String text = scan2.next();
		
		System.out.println("비밀번호> ");
		String pwd = scan2.next();
		
		Board b = new Board(title, author, text, pwd);
		
		return b;
		
	}
	
	int modify() {
		
		System.out.println("수정할 게시글의 번호를 입력하세요. ");
		System.out.println("(수정할 글이 없을 경우 00번 입력)");
		
		int textNum = scan2.nextInt();
		
		
		
		return textNum;
	}
	
	int textOpen() {
		
		System.out.println("보고싶은 글의 번호를 입력하세요. ");
		
		int textNumber = scan2.nextInt();
		
		return textNumber;
	}
}
