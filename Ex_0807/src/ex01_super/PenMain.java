package ex01_super;

import java.security.PublicKey;

//상속을 이용해서 다음 클래스들을 간결한 구조로 만드세요.
//부모-> 넓은 범위의 개념, 자식-> 좁은 범위의 개념
public class PenMain {

	class Pen {
		private int amount; // 남은 량

		public int getAmount() {
			return amount;
		}

		public void setAmount(int amount)(this.amount = amount;)

		class SharpPencil { // 샤프펜
			private int width; // 펜의 굵기

		}

		class Ballpen { // 볼펜
			private String color; // 볼펜의 색

			public String getColor() {
				return color;
			}

			public void setColor(String color) {
				this.color = color;
			}
		}

		class FountainPen {// 만연필
			private String color; // 볼펜의 색

			public String getColor() {
				return color;
			}

			public void setColor(String color) {
				this.color = color;
			}

			public void refill(int n) {
				setAmount(n);
			}
		}

		public static void main(String[] args) {

		}
	class A{
			public A() {System.out.println("A");}
			public A(int x ) {System.out.println("A : "+ x);
			}
	class B extends A{
		public B() {super(100);}
		public B(int x ) {System.out.println("B : "+ x);

	}
	public class Example{
	public static void main(String[] args) {
	B b = new B(11);//?
	}
	}
			
