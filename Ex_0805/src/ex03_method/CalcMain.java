package ex03_method;

public class CalcMain {

	public static void main(String[] args) {
		Calc calc = new Calc();
		calc.sum(0, 0);
		calc.sum(1, 1);

		int[] nums = { 100, 200 };
		// 필요에 따라 결과값을 변수에 저장하여 활용가능
		int n = calc.sum(nums);
		System.out.println("총합 : " + n);

	}

}
