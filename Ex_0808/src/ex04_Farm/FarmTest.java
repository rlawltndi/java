package ex04_Farm;

class Animal {
	//오버라이드하기 위해 만든 메서드
	public void cry() {};
}

class Pig extends Animal {
	@Override
	public void cry() {
		System.out.println("꿀꿀");
	}
};

class Cow extends Animal {
	@Override
	public void cry() {
		System.out.println("음메");
	}
	
};

class Farm {
	public void sound(Animal animal) {
//		if (animal instanceof Pig) {
//			System.out.println("꿀꿀");
//		} else {
//			System.out.println("음메");
//		}
		animal.cry();
		
		
		
	}

}

public class FarmTest {
	public static void main(String[] args) {
		Farm f= new Farm();
		Pig p = new Pig();
		Cow c = new Cow();
		
		f.sound(p);
		f.sound(c);
				
		
	}

}
//instanceof와 '==" 의 차이
//A instanceof B : 객체변수 A가 B타입으로 생선된것인지 확인
// A==B : 객체A와 같은 주소를 찹조하고 있는지 확인
