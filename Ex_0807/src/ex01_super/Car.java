package ex01_super;
//클래스에 들어갈 수 있는것
//1.필드
//2.메서드
//3.생성자
public class Car { //car 클래스는
	//필드
	int gasGauge;//private로 변수에 다른 메소드 접근금지
	//생성자
	//접근제한자 클래스면(매개변수){     }
	
	public Car(int gasGauge){
		this.gasGauge = gasGauge;
	}
	//메서드 만드는 법
	//접근제한자 반환형 메서드명(매개변수){
	//
	//}
	  public void showCurrentGauge(  ) { //가스 잔여랑을 출력하는 함수인 showCurrentGauge() 참조
	//접근제한자 반환형	  메서드명     (매개변수)
		
		System.out.println("가스량 : "+ gasGauge);
    //                                지역변수 없어서  this 안써도됌
		
	}

		
	}


