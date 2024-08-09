package ex01_interface;

public class Main {
	public static void main(String[] args) {
		//Point를 상속받아 색을 가진 점을 나타내는 ColrPoimt클래스를 작성하기
		//main메서드를 실행한 결과는 다음과 같다
		ColorPoint cp = new ColorPoint(5,5,"Yellow");//생성자의 매개변수
		cp.setXY(10,20);//생성자의 매개변수
		cp.setColor("Red");//생성자의 매개변수
		String str= cp.toString();
		System.out.println(str+"입니다.");
		
		//결과
		//Red색의 (10,20)의 점입니다.
		
		
	}

}
