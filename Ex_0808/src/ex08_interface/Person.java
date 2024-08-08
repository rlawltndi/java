package ex08_interface;

public class Person {

	Phone p;// -> PineApple폰 객체, ThreePhone 객체가 들어올 수 있음

	public Person(Phone p) {
		this.p = p;

	}

	public void buyNewPhone(Phone p) {
		this.p = p;
		System.out.println("- - - - -");
		System.out.println("새 폰을 샀습니다");
	}

	public void turnOnPhone() {
		p.powerOff();
	}

	public void watcheUtute() {
		if (p.isOn()) {
			p.watchUtube();
		} else {
			System.out.println("폰이 거져있기때문에 유튜브를 볼 수 없습니다.");

		}
	}

	public void chargePhone() {
		p.charge();

	}
}
