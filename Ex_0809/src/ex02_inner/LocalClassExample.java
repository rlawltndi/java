package ex02_inner;

public class LocalClassExample {
	
	private int speed = 10;
	
	public void getUnit(String unitName) {
		//unitName = unitName+"님"; 메서드 안에서 이름변경 ㄴㄴ
		class Unit{
			public void move() {
				//자바7버전가지는 지역클래스에서 메서드의 변수를 사용하려면
				//final 키워드를 붙여서 사용하도록 했다.
				//자바8버전 부터는 해당 변수를 변경하지 않는다는 조건하에 effrctive final이라는
				//기능이 추가되어 키워드를 사용하지 않아도 final변수로 인정된다.
		
				System.out.println(unitName+"이 "+speed+"의 속도로 이동합니다.");
			}//move();
		}//unit클래스 
		
		Unit unit = new Unit();
		unit.move();
	}//getUnit();

	
	public static void main(String[] args) {
		LocalClassExample local = new LocalClassExample();
		local.getUnit("마린");
	}
}
