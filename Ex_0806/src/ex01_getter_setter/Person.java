package ex01_getter_setter;

public class Person {
	private int age;

	//필드에 직접 접근하는 목적으로 private으로 범위를 제한
	public void setAge(int num) {
		if (num <= 0) {
			System.out.println("잘못된 값을 입력하셨습니다.1이상의 값으로 설정하세요.");
			return; // 메서드 종료
		}
		age = num; // age필드에 num값을 대입
	}
	
	//메서드가 public이면 외부에서 사용가능
	public int getAge() {
		return age;
	}
	
	
	
	
	
	
	
	
	
	

}
