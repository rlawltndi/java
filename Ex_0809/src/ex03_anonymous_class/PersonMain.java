package ex03_anonymous_class;

public class PersonMain {

	public static void main(String[] args) {
		Person s = new Student();
		s.mySelf();
		
		//만약 Person을 상속받아 처리해야 하는 클래스 또 필요하긴 하지만
		//한 번만 사용하고 말거라면 굳이 상속받는 클래스를 또 만들필요가 있을까?
		
		//회사원
		Person w = new Person() { 
			//중괄호 부분이 익명클래스
			//익명클래스 Student 클래스를 extends 한것과 같은 역할
			@Override
			public void mySelf() {
				System.out.println("나는 회사원 입니다.");
			}
		};
		w.mySelf(); 
		
		Person p = new Person() {/*익명클래스*/};
		
		
		
	}

}
