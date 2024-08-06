package ex04_if;

import java.util.Scanner;

public class Ex02_if_eles {

	public static void main(String[] args) {
		int num = 5;
		if(num > 4) {
			System.out.println(num+"은 4보다 큽니다.");
		} else { 
			System.out.println(num+"은 4보다 작습니다.");
		}
		
		//--------------------------------------------
		//두개의 숫자 비교하기
		int a = 4;
		int b = 10;
		
		if( a>b ) {
			System.out.println("a가 b보다 큽니다.");
		} else {
			if( a==b) {
				System.out.println("a는 b와 같습니다.");
			} else {
			System.out.println("a가 b보다 작습니다.");
		}
		}
			
		System.out.println(" ----------");
		
	    //int 형 변수 x가 10보다 크고 20부다 작을 떄 true인 조건식
		int x = 11;
		if(x > 10 && x < 20) {
			System.out.println(true);
		} else { 
			System.out.println(false);
		}	
	    //char형변수 ch가 'x' 또는 'X' 일 때 ture인 조건식
		//if(ch == 'x' || ch == 'X')
		//char형 변수 ch2 가 알파벳(대문자 또는 소문자)일 때 true인 조건식
		//if ((ch >= 'a' && ch <= 'z'))
		
		//삼항연산자로 만들었던 x개의 농구공을 담기위한 박스의 개수 구하기를 조건문으로 만들기
		//int ball =23;//공의 갯수
		//int n = 5;//담을 수 있는 개수
		
		//int result2 = ball % n == 0 ? ball / n : ball / n + 1;
		//System.out.println(result);
		Scanner scan = new Scanner(System.in);
		System.out.print("공의 개수 입력 : ");
		
		int ball = scan.nextInt();//공의 갯수
		int n = 5;//담을 수 있는 개수
		int box = 0;
		if( ball % n == 0) {
		 box = ball / n;
		} else {
			box = ball / n + 1;
		}
		
//		int result2 = ball % n == 0 ? ball / n : ball / n + 1;
		System.out.println("필요한 팍스의 개수 : " + box);
		
	}
}

		
		
		
		
		
		
		
		
		
		


