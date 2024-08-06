package ex02_class;

class A{
	
}
//프로그램을 실행했을 때, 코드를 컴파일 한 결과물은 코드 파일을 각각
//작성한것과 동일하게 각 class별로 도출되어 2개가된다.
//파일 분리 여부와 상관없이 결과물이 같기 때문에, 분리 여부는 개발자가
//원하는 대로 작성해도 무방하다
//그러나 추후 유지보수의 편리성과 클래스 재사용을 고려해보니 하나의 파일에
//한 개의 클래스를 작성하는 것을 추천한다.

public class Ex01_class {

	public static void main(String[] args) {
		//객체변수의 선언
		//객체를 담을 수 있는 변수를 선언
		//클래스명 변수명;
		Cat c;
		
		//만들어진 객체변수에
		//객체를 만들어 대입함
		
		c = new Cat();
		//new는 메모리에 객체를 생성하기 위한 공간을 할탕받는 키워드
		
		Cat c2 = new Cat();
		
		//자동차 객체 생성하기
		Car car = new Car();
		
		//변수명.필드명
		//변수명 : 클래스를 이용해 만든 객체의 이름
		//필드명 : 만든 객체가 가지고있는 필드의 이름
		
		System.out.println("car의 바퀴수 : "+car.wheel);
		
		car.wheel = 4;
		
		System.out.println("car의 바퀴수 : "+car.wheel);
		
		Car car2 = new Car();
		
		System.out.println("car2의 바퀴수 : "+car2.wheel);
		
	
		//메서드의 사용
		//구현된 메서드를 사용하는 방법은 필드의 사용법과 동일하다.
		//메서드를 선언한 클래스 안에서 메서드를 사용할 때는 단순히 메서드명만
		//호출하면 되지만, 다른 클래스에서 메서드를 사용하려면 객체를 생성한후
		//참조 변수를 이용해 그 객체의 메서드를 사용해야 한다.
		//객체가 존재해야 메서드도 존재하기 때문이다.
		
		//변수명.메서드명(); 생성한 객체의 메서드 호출
		
		car.ride();
		//car.ride();
		//car.ride();
		//car.ride(); 여러번 사용 가능
		
		//함수의 작동원리
		//메서드를 호출하면 흐름이 선언된쪽으로 간다
		//내부에 있는 코드들이 순차적으로 실행되
		///경우에 따라 실행한 결과를 호출한 곳으로 돌려준다.
		//값을 돌려주는 것을 '반환한다' 라고 표현하고 , 반환하는 결과값을 '반환값'이라고 한다.
		//반환할 값이 있는 경우 반환하는 데이터의 타입을 반환형에 명시
		//int , boolean 등 기본자료형과 String 같은 참조자료형들도 가능하지만
		//사용자가 만든 객체로도 반환이 가능하다.
		//아무것도 반환하지 않을때는 void
		
		//메서드의 이름짓기
		//기능을 명확하게 설명해줄 수 있는 이름이 좋다.
		//메서드명을 작성하는 규칙은 변수를 작성하는 규칙과 동일하다.
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
