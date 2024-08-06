package ex03_operater;

public class Ex05_Operater {

	public static void main(String[] args) {
		//논리연산자
		//피연산자를 두개 필요로 하는 연산자
		//피연산자로 논리형 데이터만 사용이 가능하다.
		
		//&&
		//and(그리고)의 의미를 가지고있다.
		//앞 뒤의 피연산자가 모두 true면 true를 반환한다.
		
		System.out.println(true && true);
		
		//T && T -> T
		//T && F -> F
		//F && T -> F
		//F && F -> F
		
		int myAge = 30;
		int limit = 35;
		boolean result = (limit-myAge) < 5 && (myAge+=1) > 30;
		System.out.println(result);
		System.out.println(myAge);
		//앞에 가 false 이면 뒤에는 계산을 안한다 어차피 fales이기 때문에
		
		//||(또는)Or의 의미를 가지고있다.
		//앞 뒤의 피연산자중 하나라도 true면 true를 반환한다.
		//T || T -> T
		//T || F -> T
		//F || T -> T
		//F || F -> F
		
		int n1 = 10;
		int n2 = 20;
		boolean result2 = (n1+=10) > 20 || (n2+=1) -10 == 11;
		                    
	    System.out.println(result2);
		System.out.println(n2);
		//앞이 true 이면 뒤의 결과와 상관없이 true, 뒤는 계산 안함
		
		
		
		
		
		
		
		
	}

}