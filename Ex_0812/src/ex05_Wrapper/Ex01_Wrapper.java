package ex05_Wrapper;

public class Ex01_Wrapper {
	public static void main(String[] args) {
		//정수형타입 선언
		//생성자를 통한 선언은 JDK 1.9 부터 사용하지않는 것을 권장
		Integer num01 = new Integer(10);//사용하지 말라고 권장  추후 업데이트 없음
		Integer num02 = Integer.valueOf(10); 
		
		//실수형타입선언
		Double double1Num01 = Double.valueOf(30.11);
		
		//문자형 타입선언
		Character ch = Character.valueOf('A');
		
		System.out.println("정수형1 : "+ num01);
		System.out.println("정수형2 : "+ num02);
		System.out.println("실수형 : "+ double1Num01);
		System.out.println("문자형 : "+ ch);
	}

}
