package ex03_operater;

import java.util.Scanner;

public class Ex08_Operater {

	public static void main(String[] args) {
		//과수원에서 배, 사과 ,오렌지를 하루에 각각 5,7,5개씩 생산한다.
		//1. 과수원에서 하루에 생간되는 과일의 총 개수를 구하기
		//2. 시간당 총 생산량 구하기
		
		int pear = 5;
		int apple = 7;
		int orange = 5;
		
		int result = pear + apple + orange;
		System.out.println(result);		
		
		
		//--------------------------
		//상자 하나에는 농구공이 5개가 들어갈 수 있다.
		//만일 농구공이 23개라면 몇개의 상자가 필요한가
		//삼항연산자
		//박스의 개수 : 공의 개수가 5로 나누어 떨어지면 몫만큼 필요
		//공의 개수가 5로 나눠 떨어지지 않으면 몫+1만큼 필요
		
		int ball =23;//공의 갯수
		int n = 5;//담을 수 있는 개수
		
		int result2 = ball % n == 0 ? ball / n : ball / n + 1;
		System.out.println(result2);
		
		//----------------------------------------------
		//국어,영어,수학에 대한 점수를 키보드를 이용해 점수로 입력받고
		//1. 세 과목에 대판 합계 출력하기
		//2. 평균 풀력하기 (합계 /3.0)
		
		//세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데
		//세 과목의 점수가 각각 40점 이상이면서 편균이 60점 이상일 때 합격
		//아니면 불합격
		
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 : ");
		int kor = sc.nextInt();
		System.out.println("영어 : ");
		int eng = sc.nextInt();
		System.out.println("수학 : ");
		int mat = sc.nextInt();
		
		int total2 = kor + eng + mat;
		System.out.printf("합계 : %d\n", total2);
		
		double avg = total2 / 3.0;
		System.out.printf("평균 : %f\n", avg);
		
		String result3 = (kor >= 40 && eng >= 40 && mat >= 40 && avg >= 60) ? "합격" : "불합격";
		System.out.println(result3);
		
		
   				
	  
	  
	
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	}

}
