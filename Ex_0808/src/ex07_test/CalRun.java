package ex07_test;

public class CalRun {

	public static void main(String[] args) {
		 Calculator calc = new GoodCalc();
	        int[] a = {1,2,3,4,5};
	        System.out.printf("합 : %d\n", calc.add(1,2));
	        System.out.printf("차 : %d\n",calc. substract(20,10));
	        System.out.printf("평균 : %.2f",calc.average(a));

	}

}
