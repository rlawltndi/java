package ex08_interface;

//클래스를 상속 -> extends
//인터페이스를 구현-> implements
public class ThreeStarPhone implement Phone{
int batteryCapcity = 40;
	
	@Override
	public void powerOn() {
		if(batteryCapcity>30) {
			System.out.println("@@@Powwer on!!@@");
			isOn = true;
		}
	
		
	}
	@Override
	public void powerOff() {
		System.out.println("@@@Power off!!!@@@");
		isOn = false;
		
	}
	@Override
	public boolean isOn() {
		if(isOn)
			return true;
	}else {
		return false;
	}

	}


	@Override
	public boolean equals(Object obj) {


		return super.equals(obj);
	}
	@Override
	public void charge() {
		if(battery)
		
		
	}
	@Override
	public void watchUtube() {
		if(batteryCapcity >10) {
			System.out.println("----watching Utube--");
			batteryCapcity -= 10;
			System.out.println("battery is..."+ batteryCapcity+"%");
		
		
	}
		else {
			System.out.println("Low Battery..");
			powerOff();
			if(batteryCapcity < Phone.MAX_BATTERY_CAPACITY - 20) {
				System.out.println("----charging-----");
				batteryCapcity += 5;
				System.out.println("Charged...."+batteryCapcity+"%");
				
			}
			else {
				System.out.println("You don't bave to charge...");
				System.out.println("It's enought..."+ batteryCapcity + "%");
			}

}
