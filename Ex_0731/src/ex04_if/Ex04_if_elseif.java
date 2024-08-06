package ex04_if;

import java.util.Scanner;

public class Ex04_if_elseif {

	public static void main(String[] args) {
		
	int favorite = 7;
	
	if (favorite > 5 ) {
		System.out.println("좋아하는 숫자가 5보다 큽니다.");
		
	} else if(favorite == 7) {
		System.out.println("좋아하는 숫자는 7입니다.");
		
	}
	//------------------------------------------------
	//나이를 키보드에서 입력받는다.
	//20살 이상이면 성인입니다.
	//14살 이상이면 청소년입니다.
	//7살 이상이면 어린이입니다.
	//그 이외에는 유아입니다.
	//라고 출력하기
	
	
	Scanner scan = new Scanner(System.in);
	System.out.println("나이를 입력하세요 : ");
	int age = scan.nextInt();
	
	
	if (age >19 ) {
		System.out.println("성인입니다.");
	} else if ( age > 13 ) {
		System.out.println("청소년입니다.");
	} else if ( age > 6 ) {
		System.out.println("어린이 입니다.");
	} else {
		System.out.println("유아입니다");
		
		//---------------------------------------------
		//키보드에서 성적을 입력받는다.
		//100~90점까지는 A
		//89~80점까지는 B
		//79~70점 C
		//69~60 까지 D
		//59~0 까지 F
		//출력하기 "점수는 X점이고 성적은 X입니다"
		
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요. : ");
		int score = sc.nextInt();
		
		if ( score <= 100 && score > 89 ) {
			System.out.println("점수는 A점이고 성적은 A입니다.");
		}	else if ( score < 90 && score > 79) {
		 System.out.println("점수는 B점이고 성적은 B입니다.");
		} else if (score < 80 && score > 69) {
			System.out.println("점수는 C점이고 성적은 C입니다.");
		} else if (score < 70 && score > 59) {
			System.out.println("점수는 D점이고 성적은 D입니다.");
		} else if (score < 60 && score <= 0 ) {
		   System.out.println("점수는 F점이고 성적은 F입니다."); 
		} else if(score > 100) {
			System.out.println("오류입니다.");
		}
		
		}
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	

	}


