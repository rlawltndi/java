package ex02_modifier;

public class PublicA {
	public int a;

	Private PublicA(int a) {
		this.a = a;
	}
		PublicA a = new PublicA(1);
		this a.printA();
	}
public void printA() {
	System.out.println("PublicA 클래스의 printA()메서드 호출");
	
}
	
	
	
	DefaultC dc = new DefaultC();
	void methodA() {
		dc.variableC = 20; //public으로 선언된 필드이기 때문에 사용 가능
	}

}
