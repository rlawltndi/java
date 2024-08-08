package ex03_polymorphism;

public class ComMain {
	public static void main(String[] args) {
		ComputerRoom cr = new ComputerRoom();
		//rx.com1 ,com2 -> Computer 타입
		cr.com1 = new Mac();
		cr.com2 = new LZ();
		cr.com3 = new Samsung();
		
		cr.allPowerOn();
		cr.allPowerOff();
		
		//((Mac)cr.com3).info(); //임시로 변경하기
		
		//Mac mac = (Mac)cr.com3; //자식타입으로 바꿔서 변수에 저장
		//mac.info();
		//객체를 변경하기 위해 여러 코드를 수정하는 것은
		//위험도가 높은 작업이다.
		//실무에서 프로그램은 코드의 양이 많이지고, 수 많은 객체가 서로
		//얽혀서 복잡한 로직으로 구성되어있다.
		//그렇기 때문에 수정을 최소화 하는 것이 좋다.
		
		
	}

}