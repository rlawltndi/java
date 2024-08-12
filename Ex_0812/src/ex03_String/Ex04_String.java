package ex03_String;

import java.util.Scanner;

public class Ex04_String {

	public static void main(String[] args) {
		// (-포함)주민번호를 키보드에서 입력받는다.
		// 예시)970530-1234567
		// 당신은 1997년 5월 30일에 태어난 남자입니다.
		// 형식을 잘못입력했을때는 "주민번호를 올바르게 입력하세요" 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("(-포함) 주민번호를 입력하세요. : ");
		System.out.print(">> ");
		String bd = sc.next();

		if (bd.length() < 14 || bd.charAt(6) != '-') { // 잘못쓴 경우
			System.out.println("주민번호를 올바르게 입력하세요.");
		} else {
			String year = "";
			String result = "";
			year = bd.substring(0, 2);

			if (Integer.parseInt(year) <= 14) {
				result = "당신은 20";

			} else {
				result = "당신은 19";

			}

			result += year + "년" + bd.substring(2, 4) + "월" + bd.substring(4, 6) + "일에 태어난 ";

			if (bd.charAt(7) % 2 != 0) {
				result += "남자입니다.";
			} else {
				result += "여자입니다.";
			}

			System.out.println(result);

		}
	}
}
