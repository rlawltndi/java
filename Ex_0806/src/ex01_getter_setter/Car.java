package ex01_getter_setter;

public class Car {
	private int speed;// 속도
	private boolean stop;// 정지

	void setSpeed(int s) {
		if (s < 0) {
			speed = 0;
			return;
		} else {
			speed = s;

		}

	}

	public int getSpeed() {
		return speed;

	}

	public void setStop(boolean s) {
		stop = s;
		if(s==false) {
			speed = 0;
		}
		

	}

	public boolean getStop() {
		return stop;
	}

}
