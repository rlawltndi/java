package ex03_access;

import ex02_modifier.*;//modifier패키지의 모든 클래스를 import 하겟다

public class PulicB {

	public static void main(String[] args) {
		Default c = new DefaultC();
		//default로 선언된 클래스는 다른 패키지에서 사용될 수 없다.
	}
       c.variableC = 20;
        //필드가 public으로 선언되어있음에도 불구하고 객체생성 자체가 안되기때문에 사용X
}
