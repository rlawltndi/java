package ex03_method;

import java.util.Scanner;

public class StartMain {

	public static void main(String[] args) {
		Start s = new Start();

		Scanner sc = new Scanner(System.in);

		// 정답을 맞출때 까지 반복
		// for,while
		// 몇번만에 맞출지 모름-> while
		while (true) {
			System.out.print("숫자입력 : "); // 숫자를 입력 받는다.
			int number = sc.nextInt();// 난수를 맞추면 반복문 나가기
			if (s.check(number).equals("정답!")) {
				System.out.println("정답입니다.");
				System.out.println(s.count+"회만에 맞추셨습니다.");
				break;
			} else {
				System.out.println(s.check(number));
				s.count++; // 틀릴때마다 카운트 증가
			}
		}

	}

}
