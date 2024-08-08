package ex03_mothod;

class MethodTest {

	public void result() {
		System.out.println("인자가 없는 메서드");

	}

	public static void result(int n) {
		System.out.println("문자열,정수를 인자로 받는 메서드");

	}

	public static void result(char c) {
		System.out.println("문자를 인자로 받는 메서드");

	}

	public static void result(String s, int n) {
		System.out.println("정수 ,문자열을 인자로 받는 메서드");

	}

	public static void result(int n, String s) {
		System.out.println("문자열, 정수를 인자로 받는 메서드");

	}
}
	public class Ex03_Method {
		public static void main(String[] args) {
			MethodTest mt = new MethodTest();
			mt.result();
			mt.result(10);
			mt.result('A');
			mt.result("A", 10);
			mt.result(10, "A");

		}
	}

