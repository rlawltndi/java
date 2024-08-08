package ex01_super;
              //부모클래스 호출 
public class Child extends Parent{
	public Child(int n) {
		//super(); 부모클래스의 매개변수가 없으면 생략가능
		super(n);//부모생성자의 호출
		         //부모생성자가 매개변수를 갖기시작하면 생략할 수 없다.
	}
	
	
	

}
