package ex01_interface;

public class MicMain {

	public static void main(String[] args) {
		System.out.println("----Tjmic 객체-----");
		Tjmic tj = new Tjmic();
		tj.connect();
		tj.music();
		tj.sing();
		
		System.out.println("---Tjmic 객체를 BluetoothMic로 타입변환---");
		BluetoothMic bm = tj;
		bm.connect();
		bm.music();
		bm.sing();
		
		System.out.println("---Tjmic 객체를 MicoPhone타입으로 변환----");
		MicroPhone m = tj;
		m.sing();
//		m.music(); MicroPhone애 정의되어있지 않아서 불가
//		m.connect();
		
		System.out.println("---Tjmic 객체를 Speaker타입으로 변환---");
		Speaker s = tj;
		s.music();
		
	

		
	 }

}
