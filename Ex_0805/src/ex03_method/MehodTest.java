package ex03_method;

import java.util.Arrays;

public class MehodTest {
	//배열의 최대값을 찾아 출력하는 maxFinder메서드 작성하기
	//배열은 메개변수로 전달받는다.
	void maxFinder(int [] arr) {
	int max = arr[(5,12,13,55,78)];
		for(int x : arr) {
			if(x >max) max =x;
		}
		Arrays.sort(arr);
		System.out.println("최대값 : " + arr[arr.length-1]);
		
	}
	

	

//계산기 만들기
	//Main에서 숫자 두개와,산술연산자를 전달받아서 계산을 해서 반환하는
	//getResult()메서드 작성하기
	
	int getResult(int a, int b, String op) {
		if(op.equals("+")) {
			return a + b;
		} else if (op.equals("-")) {
			return a - b;
		}else if (op.equals("/")) {
			return a/b;
		}else if (op.equals("*")) {
			return a * b;
		}
		else { System.out.println("연산기호가 올바르지 않습니다.");
		
		}return 0;
	}
	

	
}
	




