package ex08_interface;

public class PersinMain {

	public static void main(String[] args) {
		Person jimin = new Person(new PineApplePhone());
		jimin.turnOnPhone();
		for (int i = 1; i < 6; i++) {
			jimin.watcheUtute();
			if (i % 3 == 0) {
				jimin.chargePhone();

			}
		}

	
	jimin.buyNewPhone(new ThreeStarPhone());
	jimin.turnOnPhone();
	for (int i = 1; i < 6; i++) {
		jimin.watcheUtute();
		if (i % 3 == 0) {
			jimin.chargePhone();
		}
	}


}
}