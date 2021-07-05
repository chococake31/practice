package ex20210701;

public class doWhile {

	public static void main(String[] args) {
		
		int i = 2;
		int j = 1;
		
		do {
			System.out.println(i + "단");
			j = 1; // 맨 처음 곱할 숫자는 항상 1로 초기화함 
			do {
				System.out.println(i + "x" + j + "=" + (i*j));
				j++;
			} while ( j < 10);
			System.out.println();
			i++;
		} while (i < 10);
		
		
	}
}
