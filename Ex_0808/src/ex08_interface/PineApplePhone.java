package ex08_interface;

import javax.crypto.interfaces.DHPrivateKey;

public class PineApplePhone  implements Phone{
	//인터페이스를 구현하는 클래스에 모든 추상메서드를 구체화 해야한다.
	
	//배터리양
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
		if(batteryCapcity < Phone.MAX_BATTERY_CAPACITY -20) {
			System.out.println("--charging---");
			batteryCapcity += 5;
			System.out.println("charged..."+batteryCapcity+"%");
			
		}else {
			System.out.println("you don't haver to charge..");
			System.out.println("it's enough.."+ batteryCapcity+"%");
		}
		
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
	

}
