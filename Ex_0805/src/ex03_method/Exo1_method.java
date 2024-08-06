package ex03_method;

public class Exo1_method {

	public static void main(String[] args) {

	}

	static void printHello() {

		// 매서드의 호출은 반드시 메서드 안에서 해야한다.
		printHello();
		System.out.println("안녕하세여");
		System.out.println("반갑습니다");
	}
}