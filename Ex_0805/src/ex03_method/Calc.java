package ex03_method;

public class Calc {

	// 두 수를 더하는 sum메서드 만들기
	// "두 수의 합은 X입니다. " 라는 출력문 작성하기
	// CalcMain만둘어서 메서드 호출
	void sum(int x, int y) {
		System.out.println("두 수의 합은" + (x + y) + "입니다");
	}

	int sum(int[] nums) {
		int result = 0;
		for (int i = 0; i < nums.length; i++) {
			result += nums[i];

		}
		// System.out.println("숫자들의 합은 : "+ result+"입니다"); //그냥 출력하는 방법
		// 위에 식 쓰려면 int sum(int[] num)이 부분
		// int -> void 바꿔주고 아래 return return; 지우기
		// main sysout 지우기

		return result; // 값을 반환받아서 main에서 쓰기위함
	}

}
