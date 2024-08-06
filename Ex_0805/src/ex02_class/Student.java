package ex02_class;

public class Student {	
	//정적 멤버의 선언	
	static String schoolName = "코리아 학교";
	
	//인스터스 멤버
	String stdentName;
	
	static void goTOschool() {
		System.out.println("학교에 갑니다.");
	}
	//인스터스 메서드
	void hello() {
		System.out.println("안녕하세요, 제 이름은 " + stdentName + "입니다.");
	}
}
