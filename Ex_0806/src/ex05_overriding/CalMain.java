package ex05_overriding;

public class CalMain {

	public static void main(String[] args) {
		CalPlus cp = new CalPlus();
		CalMinus cm = new CalMinus();
		
		System.out.println("CalPlus : " + cp.getResult(10,20));
		System.out.println("CalMinus : " + cm.getResult(30,15));

	}

}
