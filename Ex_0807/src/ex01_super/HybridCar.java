package ex01_super;

class HybridCar extends Car	{
	private int electricGauge;
	HybridCar(int gasolineGauge, int electricGauge) {
		super(gasolineGauge);
// 상위 클래스의 변수는 상위 클래스 생성자에서 초기화할 수 있도록 매개변수 전달
		this.electricGauge = electricGauge;	
	}

	public void showCurrentGauge() {
		super.showCurrentGauge();// Car 출력문 호출
		System.out.println("잔여 전기량 : " + electricGauge);
	}
}
