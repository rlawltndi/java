package ex06_throws;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex01_ThrowsExceptionExample {
	public static void checkYourSelf(Scanner sc) throws InputMismatchException {
		System.out.println("1. 사람과 함께 있는것이 좋다.2. 혼자있는것이 좋다.");
		System.out.println("선택 : ");
		int check = sc.nextInt();
		if(check == 1) {
			System.out.println("당신은 E");
		}else {
			System.out.println("당신은 I");
		}
		
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("===성격 유형 검사를 시작합니다.===");
			//메서드 호출
		ThrowsExceptionExample.check
		}catch (Exception e) {
			System.out.println("키도브 입력이 잘못되었습니다.");
		}
	}

}
