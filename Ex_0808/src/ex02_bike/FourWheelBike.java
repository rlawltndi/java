package ex02_bike;

public class FourWheelBike extends Bike {

	

	public FourWheelBike(String riderName) {
		super(riderName);
		
	}

	public void addwheel() {
		if (wheel == 2) {
			wheel = 4;
			System.out.println(riderName + "의 자전거 보조 바퀴를 부착하였습니다");
		} else {
			System.out.println(riderName + "의 바퀴에는 이미 보조바퀴가 부착되어있습니다.");
		}

	}

}
