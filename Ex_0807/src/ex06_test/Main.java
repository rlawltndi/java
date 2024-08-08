package ex06_test;

class Parent {
	int x = 100;

	Parent() {
		this(500);

	}

	Parent(int x) {
		this.x = x;
	}

	int getx() {
		return x;

	}
}

class Child extends Parent(){

	int x =4000;
}
    Child(){
	 this(5000);
    }
	Child(int x) {
		this.x = x;
	}

}

public class Main {
	public Main(String[] args) {
		Child obj = new Child();
		System.out.println(obj.getx()); // 답:500
		

	}

}
