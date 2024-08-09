package ex02_inner;


class PirntOut {
	public static class Out {
		public void println(String str) {
			System.out.println(str);

		}
	}
}

public class StaticClassExample {
 public static void main(String[] args) {
	String str = "정적 내부 클래스 테스트";
	PirntOut.Out out = new PirntOut.Out();
	out.println(str);
	
}
}
