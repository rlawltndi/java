package ex04_inheritance;

public class PerosnMain {

	public static void main(String[] args) {
		Customer c1 = new Customer("박자바", 25,20240001);
		Customer c2 = new Customer("송코딩", 30,20024002);
		
		c1.enter();
		c2.enter();

	}

}
