package ex01_try_catch;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class Ex02_try_catch {
	public static void main(String[] args) {
		// 나이를 입력받고
		// 20살 이상이면 "성인입니다"
		// 14살 이상이면 "청소년입니다"
		// 7살이상이면 "어린이입니다"
		// 그 외에는 "아동입니다"
		// 단, 0 이하의 수가 입력되면 InputErrorException을 발생시키고
		// 입력이 잘못되었습니다. 라고 출력시키기

		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("당신의 나이를 입력하세요 >>");
			int age = sc.nextInt();// 예외발생 가능성 있음
			

			if (age < 0) {//나이에는 음수가 없으니 음수가 들어오면 강제로 예외를 발생시켜야한다
				throw new InputErrorException("입력이 잘못되었습니다.");

			} else if (age > 19) {
				System.out.println("성인입니다.");

			} else if (age > 13) {
				System.out.println("청소년입니다.");

			} else if (age > 6) {
				System.out.println("어린이입니다.");
			} else {
				System.out.println("아동입니다");

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
