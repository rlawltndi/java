package ex02_for;

import java.util.Scanner;

public class Ex01_for {

	public static void main(String[] args) {

		for (int i = 0; i < 3; i++) {
			System.out.print(i);
		}
		System.out.println("------------");
		// 1 2 3 4 5 6 7 8 9 10

		for (int i = 0; i < 10; i++) {
			System.out.print((i + 1) + " ");

		}

		for (int i = 10; i > 11; i--) {
			System.out.print(i + " ");
		}
		// 1~20홀수만 가로로 출력

		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
			}
		}
		// 1~10까지 3의 배수만 출력하는 코드
		for (int i = 1; i < 11; i++) {
			if (i % 3 == 0)
				System.out.print(i + " ");
		}
		// 1부터 10까지의 총합 구하기
		// 총합은 한번만 출력하세여
		int sum = 0;
		for (int i = 1; i < 11; i++) {
			sum += i;// sum = sum + 1;
			// += 누적합계 구할 때 좋음
		}
		System.out.println(sum);

		// 정수형 변수 dan에 2~9사이의 값으로 초기화 하고
		// 해당 dan에 해당하는 구구단 출력하기
		// 2 x 1 = 2
		// 2 x 2 = 4
		// ...
		// 2 x 9 = 18
		int dan = 5;
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d x %d = %d\n", dan, i, (dan * i));
		}
		// 키보드에서 정수를 하나 입력받아
		// 1부터 입력받은 수 가지의 총합을 구하세요

		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = scan.nextInt();
		sum = 0;
		for (int i = 1; 1 <= num; i++) {
			sum += i;
		}
		System.out.println("총 합 : " + sum);
		
		// 10개의 정수를 입력받아 그 중에 짝수가 몇개인지
		// 개수를 출력해주세요

		// 개수를 세서 저장 할 수 있는 변수
//		int count = 0;

//		for(int i = 0; i < 10; i++ ) {
//			System.out.println("정수입력 : ");
//			int n = scan.nextInt();
//			//짝수인지 판별
//			if( n % 2 == 0) { 
//				  //개수를 센다.
//				count++;
//				
//			}
//		}
//		System.out.println("짝수의 개수 : "+ count);

		// 키보드로부터 정수를 두 개 입력받는다.
		// 입력받은 x부터 y까지의 총합을 출력하세요
		// ex 2와 5를 입력받으면
		// 2+3+4+5+를 한 14가 출력되야한다.
		// 단, x가 y보다 큰 경우
		// x와 y의 값을 바꿔서 총 합을 구한다.
		System.out.println("첫번째 숫자 : ");
		int x = scan.nextInt();
		int y = scan.nextInt();
		// x와 y의 크기 비교
		if (x > y){
			int z = x;
			x = y;
			y = z;
		}
		sum = 0;
		for (int i = x; i < -y; i++) {
		}
		System.out.printf("d% 부터 %d 까지의 총합 : %d", x, y, sum);

	}

}
