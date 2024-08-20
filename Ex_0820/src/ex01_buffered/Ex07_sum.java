package ex01_buffered;

import java.io.BufferedReader;

import java.io.InputStreamReader;

public class Ex07_sum {

	public static void main(String[] args) throws Exception {
		// 문제
		// N개의 숫자가 공백없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하세요

		// 입력
		// N개의 숫자를 입력 , 입력된 N개의 숫자만큼 공백없이 주어진다.

		// 출력
		// 입력으로 주어진 숫자 N개의 합을 출력

		// 예시
		// 1
		// 1
		// 결과
		// 1

		// 5
		// 54321
		// 결과
		// 15

		// 25
		// 70000000000000000000000
		// 결과
		// 7

		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("정수입력 : ");
		int n = Integer.parseInt(buffer.readLine());
		int sum = 0;

		// 입력받은 문자를 미리 배열에 담아놓는다.
		String[] arr = buffer.readLine().split("");

		// 내가 받은 숫자만큼만 반복
		for (int i = 0; i < n; i++) {
			sum += Integer.parseInt(arr[i]);
		}
		System.out.println("총합 : " + sum);

	}

}
